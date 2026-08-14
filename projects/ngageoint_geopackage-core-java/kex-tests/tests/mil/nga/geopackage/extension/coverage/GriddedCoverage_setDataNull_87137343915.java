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

public class GriddedCoverage_setDataNull_87137343915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3691;
     Object term3789;

    public GriddedCoverage_setDataNull_87137343915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term3737 = new Double(1.0);
        Double term3739 = new Double(0.39286935532362843);
        term3691 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage"));
        Object term3693 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet"));
        setLongField(term3691, term3691.getClass(), "id", 305759998609888272L);
        setField(term3693, term3693.getClass(), "contents", null);
        setField(term3693, term3693.getClass(), "tableName", "pORebkoRdD");
        setField(term3693, term3693.getClass(), "srs", null);
        setLongField(term3693, term3693.getClass(), "srsId", -8654565919063661957L);
        setDoubleField(term3693, term3693.getClass(), "minX", 0.268304014379393);
        setDoubleField(term3693, term3693.getClass(), "minY", 0.7171972879282721);
        setDoubleField(term3693, term3693.getClass(), "maxX", 0.9006361024877096);
        setDoubleField(term3693, term3693.getClass(), "maxY", 0.5644914462415626);
        setField(term3691, term3691.getClass(), "tileMatrixSet", term3693);
        setField(term3691, term3691.getClass(), "tileMatrixSetName", "mXGCWJDOqA");
        setField(term3691, term3691.getClass(), "datatype", "dpNsDgfPso");
        setDoubleField(term3691, term3691.getClass(), "scale", 1.0);
        setDoubleField(term3691, term3691.getClass(), "offset", 0.509895859167191);
        setField(term3691, term3691.getClass(), "precision", term3737);
        setField(term3691, term3691.getClass(), "dataNull", term3739);
        setField(term3691, term3691.getClass(), "gridCellEncoding", "hCWPJQKpdc");
        setField(term3691, term3691.getClass(), "uom", "WzMEhMXkKx");
        setField(term3691, term3691.getClass(), "fieldName", "XOiDvlDhdc");
        setField(term3691, term3691.getClass(), "quantityDefinition", "AdxvLJhNLe");
        term3789 = new Double(0.11577948268926874);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term3789;
        callMethod(klass, "setDataNull", argTypes, term3691, args);
    }

};


