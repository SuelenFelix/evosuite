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

public class GeometryIndex_setMaxX_112626297837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1218;
     Object term1224;

    public GeometryIndex_setMaxX_112626297837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1218 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex"));
        setField(term1218, term1218.getClass(), "tableIndex", null);
        setField(term1218, term1218.getClass(), "tableName", null);
        setLongField(term1218, term1218.getClass(), "geomId", 0L);
        setDoubleField(term1218, term1218.getClass(), "minX", 0.0);
        setDoubleField(term1218, term1218.getClass(), "maxX", 0.0);
        setDoubleField(term1218, term1218.getClass(), "minY", 0.0);
        setDoubleField(term1218, term1218.getClass(), "maxY", 0.0);
        setField(term1218, term1218.getClass(), "minZ", null);
        setField(term1218, term1218.getClass(), "maxZ", null);
        setField(term1218, term1218.getClass(), "minM", null);
        setField(term1218, term1218.getClass(), "maxM", null);
        term1224 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term1224;
        callMethod(klass, "setMaxX", argTypes, term1218, args);
    }

};


