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

public class GeometryIndex_setMaxZ_143919723245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1272;

    public GeometryIndex_setMaxZ_143919723245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1272 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex"));
        setField(term1272, term1272.getClass(), "tableIndex", null);
        setField(term1272, term1272.getClass(), "tableName", null);
        setLongField(term1272, term1272.getClass(), "geomId", 0L);
        setDoubleField(term1272, term1272.getClass(), "minX", 0.0);
        setDoubleField(term1272, term1272.getClass(), "maxX", 0.0);
        setDoubleField(term1272, term1272.getClass(), "minY", 0.0);
        setDoubleField(term1272, term1272.getClass(), "maxY", 0.0);
        setField(term1272, term1272.getClass(), "minZ", null);
        setField(term1272, term1272.getClass(), "maxZ", null);
        setField(term1272, term1272.getClass(), "minM", null);
        setField(term1272, term1272.getClass(), "maxM", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMaxZ", argTypes, term1272, args);
    }

};


