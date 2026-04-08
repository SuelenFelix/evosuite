from pathlib import Path

PROJECTS_DIR = "/home/suelenfelix/TCC/evosuite/projects"

def count_projects_with_coverage():
    base = Path(PROJECTS_DIR)

    total = 0
    done = 0

    for project in sorted(base.iterdir()):
        if not project.is_dir():
            continue

        if not (project / "pom.xml").exists():
            continue

        total += 1

        csv_file = project / "coverage_kex.csv"
        if csv_file.exists():
            done += 1

    print(f"📊 Projetos com coverage: {done}/{total}")
    print(f"📈 Progresso: {round((done/total)*100, 2)}%")

if __name__ == "__main__":
    count_projects_with_coverage()