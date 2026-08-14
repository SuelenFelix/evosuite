package mil.nga.geopackage.extension.nga.index;

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
import static mil.nga.geopackage.extension.nga.index.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class GeometryIndex_getMinM_127723801321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1006;

    public GeometryIndex_getMinM_127723801321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term1024 = new Double(0.8924855581421237);
        Double term1026 = new Double(0.32237559209193944);
        Double term1028 = new Double(0.53094494792755);
        Double term1030 = new Double(0.146431486357265);
        term1006 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex"));
        setField(term1006, term1006.getClass(), "tableIndex", null);
        setField(term1006, term1006.getClass(), "tableName", "OWDIEULEFu");
        setLongField(term1006, term1006.getClass(), "geomId", -5892135042702373494L);
        setDoubleField(term1006, term1006.getClass(), "minX", 0.53094494792755);
        setDoubleField(term1006, term1006.getClass(), "maxX", 0.146431486357265);
        setDoubleField(term1006, term1006.getClass(), "minY", 0.24259014218848696);
        setDoubleField(term1006, term1006.getClass(), "maxY", 0.1544348383112728);
        setField(term1006, term1006.getClass(), "minZ", term1024);
        setField(term1006, term1006.getClass(), "maxZ", term1026);
        setField(term1006, term1006.getClass(), "minM", term1028);
        setField(term1006, term1006.getClass(), "maxM", term1030);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinM", argTypes, term1006, args);
    }

};


