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

public class GeometryIndex_getTableName_55172987131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1178;

    public GeometryIndex_getTableName_55172987131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1178 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex"));
        setField(term1178, term1178.getClass(), "tableIndex", null);
        setField(term1178, term1178.getClass(), "tableName", null);
        setLongField(term1178, term1178.getClass(), "geomId", 0L);
        setDoubleField(term1178, term1178.getClass(), "minX", 0.0);
        setDoubleField(term1178, term1178.getClass(), "maxX", 0.0);
        setDoubleField(term1178, term1178.getClass(), "minY", 0.0);
        setDoubleField(term1178, term1178.getClass(), "maxY", 0.0);
        setField(term1178, term1178.getClass(), "minZ", null);
        setField(term1178, term1178.getClass(), "maxZ", null);
        setField(term1178, term1178.getClass(), "minM", null);
        setField(term1178, term1178.getClass(), "maxM", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTableName", argTypes, term1178, args);
    }

};


