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

public class GeometryIndex_setId_134480900528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1160;

    public GeometryIndex_setId_134480900528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1160 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex"));
        setField(term1160, term1160.getClass(), "tableIndex", null);
        setField(term1160, term1160.getClass(), "tableName", null);
        setLongField(term1160, term1160.getClass(), "geomId", 0L);
        setDoubleField(term1160, term1160.getClass(), "minX", 0.0);
        setDoubleField(term1160, term1160.getClass(), "maxX", 0.0);
        setDoubleField(term1160, term1160.getClass(), "minY", 0.0);
        setDoubleField(term1160, term1160.getClass(), "maxY", 0.0);
        setField(term1160, term1160.getClass(), "minZ", null);
        setField(term1160, term1160.getClass(), "maxZ", null);
        setField(term1160, term1160.getClass(), "minM", null);
        setField(term1160, term1160.getClass(), "maxM", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndexKey");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setId", argTypes, term1160, args);
    }

};


