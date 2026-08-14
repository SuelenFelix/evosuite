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

public class GeometryIndex_setMinZ_143210697443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1260;

    public GeometryIndex_setMinZ_143210697443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1260 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex"));
        setField(term1260, term1260.getClass(), "tableIndex", null);
        setField(term1260, term1260.getClass(), "tableName", null);
        setLongField(term1260, term1260.getClass(), "geomId", 0L);
        setDoubleField(term1260, term1260.getClass(), "minX", 0.0);
        setDoubleField(term1260, term1260.getClass(), "maxX", 0.0);
        setDoubleField(term1260, term1260.getClass(), "minY", 0.0);
        setDoubleField(term1260, term1260.getClass(), "maxY", 0.0);
        setField(term1260, term1260.getClass(), "minZ", null);
        setField(term1260, term1260.getClass(), "maxZ", null);
        setField(term1260, term1260.getClass(), "minM", null);
        setField(term1260, term1260.getClass(), "maxM", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMinZ", argTypes, term1260, args);
    }

};


