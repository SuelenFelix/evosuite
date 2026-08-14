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

public class GeometryIndex_setMinY_113335419739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1232;
     Object term1238;

    public GeometryIndex_setMinY_113335419739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1232 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex"));
        setField(term1232, term1232.getClass(), "tableIndex", null);
        setField(term1232, term1232.getClass(), "tableName", null);
        setLongField(term1232, term1232.getClass(), "geomId", 0L);
        setDoubleField(term1232, term1232.getClass(), "minX", 0.0);
        setDoubleField(term1232, term1232.getClass(), "maxX", 0.0);
        setDoubleField(term1232, term1232.getClass(), "minY", 0.0);
        setDoubleField(term1232, term1232.getClass(), "maxY", 0.0);
        setField(term1232, term1232.getClass(), "minZ", null);
        setField(term1232, term1232.getClass(), "maxZ", null);
        setField(term1232, term1232.getClass(), "minM", null);
        setField(term1232, term1232.getClass(), "maxM", null);
        term1238 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term1238;
        callMethod(klass, "setMinY", argTypes, term1232, args);
    }

};


