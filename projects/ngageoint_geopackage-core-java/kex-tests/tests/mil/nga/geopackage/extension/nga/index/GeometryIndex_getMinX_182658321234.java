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

public class GeometryIndex_getMinX_182658321234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1198;

    public GeometryIndex_getMinX_182658321234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1198 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex"));
        setField(term1198, term1198.getClass(), "tableIndex", null);
        setField(term1198, term1198.getClass(), "tableName", null);
        setLongField(term1198, term1198.getClass(), "geomId", 0L);
        setDoubleField(term1198, term1198.getClass(), "minX", 0.0);
        setDoubleField(term1198, term1198.getClass(), "maxX", 0.0);
        setDoubleField(term1198, term1198.getClass(), "minY", 0.0);
        setDoubleField(term1198, term1198.getClass(), "maxY", 0.0);
        setField(term1198, term1198.getClass(), "minZ", null);
        setField(term1198, term1198.getClass(), "maxZ", null);
        setField(term1198, term1198.getClass(), "minM", null);
        setField(term1198, term1198.getClass(), "maxM", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinX", argTypes, term1198, args);
    }

};


