package mil.nga.geopackage.extension.coverage;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static mil.nga.geopackage.extension.coverage.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class GriddedCoverage_getScale_1436859508 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2509;

    public GriddedCoverage_getScale_1436859508() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term2555 = new Double(1.0);
        Double term2557 = new Double(0.1544348383112728);
        term2509 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage"));
        Object term2511 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet"));
        setLongField(term2509, term2509.getClass(), "id", -2644215923136513282L);
        setField(term2511, term2511.getClass(), "contents", null);
        setField(term2511, term2511.getClass(), "tableName", "bLPjGVBhlX");
        setField(term2511, term2511.getClass(), "srs", null);
        setLongField(term2511, term2511.getClass(), "srsId", -1468719814009985452L);
        setDoubleField(term2511, term2511.getClass(), "minX", 0.13246999699526574);
        setDoubleField(term2511, term2511.getClass(), "minY", 0.9126850255993704);
        setDoubleField(term2511, term2511.getClass(), "maxX", 0.11179067076100713);
        setDoubleField(term2511, term2511.getClass(), "maxY", 0.5306473989087822);
        setField(term2509, term2509.getClass(), "tileMatrixSet", term2511);
        setField(term2509, term2509.getClass(), "tileMatrixSetName", "whBvTVIIlC");
        setField(term2509, term2509.getClass(), "datatype", "IgRJUzaCwW");
        setDoubleField(term2509, term2509.getClass(), "scale", 1.0);
        setDoubleField(term2509, term2509.getClass(), "offset", 0.022483645678509023);
        setField(term2509, term2509.getClass(), "precision", term2555);
        setField(term2509, term2509.getClass(), "dataNull", term2557);
        setField(term2509, term2509.getClass(), "gridCellEncoding", "JUmudUmaaV");
        setField(term2509, term2509.getClass(), "uom", "KoyGrUJeJW");
        setField(term2509, term2509.getClass(), "fieldName", "HqBOwkVqjD");
        setField(term2509, term2509.getClass(), "quantityDefinition", "MAcUBcBckh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScale", argTypes, term2509, args);
    }

};


