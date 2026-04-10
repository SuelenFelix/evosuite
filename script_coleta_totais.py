import csv
from pathlib import Path

BASE_PATH = Path(__file__).resolve().parent
PROJECTS_DIR = BASE_PATH / "projects"

CSV_NAMES = [
    "coverage_native_evosuite_kex.csv",
    "coverage_native.csv",
    "coverage_native_kex.csv",
    "coverage_kex.csv",
    "coverage_evosuite.csv",
    "coverage_kex_evosuite.csv",
    "coverage_native_evosuite.csv",
]

def list_projects(projects_dir: Path) -> list[Path]:
    projects = []
    for item in sorted(projects_dir.iterdir(), key=lambda p: p.name.lower()):
        if item.is_dir() and (item / "pom.xml").exists():
            projects.append(item)
    return projects

def clean_row(row: dict, project_name: str) -> dict:
    row = dict(row)

    row.pop(None, None)

    if "project" not in row or not row["project"]:
        row["project"] = project_name

    return row

def count_loc_java(project_path: Path) -> int:
    """
    Conta LOC em src/main/java/**/*.java
    Ignora linhas vazias e comentários simples/bloco.
    """
    src_dir = project_path / "src" / "main" / "java"
    if not src_dir.exists():
        return 0

    total_loc = 0

    for java_file in src_dir.rglob("*.java"):
        in_block_comment = False

        try:
            with open(java_file, "r", encoding="utf-8", errors="ignore") as f:
                for raw_line in f:
                    line = raw_line.strip()

                    if not line:
                        continue

                    if in_block_comment:
                        if "*/" in line:
                            after = line.split("*/", 1)[1].strip()
                            in_block_comment = False
                            if not after:
                                continue
                            line = after
                        else:
                            continue

                    while True:
                        if line.startswith("//"):
                            line = ""
                            break

                        if line.startswith("/*"):
                            if "*/" in line:
                                after = line.split("*/", 1)[1].strip()
                                line = after
                                if not line:
                                    break
                                continue
                            else:
                                in_block_comment = True
                                line = ""
                                break

                        if "/*" in line:
                            before, after = line.split("/*", 1)
                            before = before.strip()

                            if "*/" in after:
                                after = after.split("*/", 1)[1].strip()
                                line = f"{before} {after}".strip()
                                if not line:
                                    break
                                continue
                            else:
                                in_block_comment = True
                                line = before
                                break

                        break

                    if line:
                        total_loc += 1

        except Exception:
            continue

    return total_loc

def aggregate_csv(csv_name: str, projects: list[Path], output_dir: Path) -> None:
    aggregated_rows = []
    header = None

    loc_cache = {}

    for project_path in projects:
        project_csv = project_path / csv_name
        if not project_csv.exists():
            continue

        if project_path.name not in loc_cache:
            loc = count_loc_java(project_path)
            loc_cache[project_path.name] = {
                "loc": loc,
                "kloc": round(loc / 1000, 3)
            }

        with open(project_csv, "r", encoding="utf-8", newline="") as f:
            reader = csv.DictReader(f)

            if reader.fieldnames is None:
                continue

            current_header = list(reader.fieldnames)

            if "project" not in current_header:
                current_header = ["project"] + current_header

            for extra_field in ["loc", "kloc"]:
                if extra_field not in current_header:
                    current_header.append(extra_field)

            if header is None:
                header = current_header
            else:
                for field in current_header:
                    if field not in header:
                        header.append(field)

            for row in reader:
                cleaned = clean_row(row, project_path.name)
                cleaned["loc"] = loc_cache[project_path.name]["loc"]
                cleaned["kloc"] = loc_cache[project_path.name]["kloc"]
                aggregated_rows.append(cleaned)

    output_name = csv_name.replace(".csv", "_total.csv")
    output_path = output_dir / output_name

    if not aggregated_rows or header is None:
        print(f"ℹ️ Nenhum arquivo encontrado para consolidar: {csv_name}")
        return

    with open(output_path, "w", encoding="utf-8", newline="") as f:
        writer = csv.DictWriter(f, fieldnames=header, extrasaction="ignore")
        writer.writeheader()
        writer.writerows(aggregated_rows)

    print(f"✅ Consolidado gerado: {output_path} ({len(aggregated_rows)} linha(s))")

def main():
    if not PROJECTS_DIR.exists():
        print(f"❌ Diretório não encontrado: {PROJECTS_DIR}")
        return

    projects = list_projects(PROJECTS_DIR)

    if not projects:
        print(f"❌ Nenhum projeto com pom.xml encontrado em: {PROJECTS_DIR}")
        return

    print(f"📁 {len(projects)} projeto(s) encontrado(s)")

    for csv_name in CSV_NAMES:
        aggregate_csv(csv_name, projects, BASE_PATH)

    print("\n✅ Consolidação finalizada.")

if __name__ == "__main__":
    main()