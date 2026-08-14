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

public class GeometryIndex_setId_13448090053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320;
     Object term346;

    public GeometryIndex_setId_13448090053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term338 = new Double(0.6076495596892013);
        Double term340 = new Double(0.37773193782763337);
        Double term342 = new Double(0.8474802076607362);
        Double term344 = new Double(0.5183269973490326);
        term320 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex"));
        setField(term320, term320.getClass(), "tableIndex", null);
        setField(term320, term320.getClass(), "tableName", "uuaPigETmJ");
        setLongField(term320, term320.getClass(), "geomId", -8885298608300233488L);
        setDoubleField(term320, term320.getClass(), "minX", 0.6076495596892013);
        setDoubleField(term320, term320.getClass(), "maxX", 0.37773193782763337);
        setDoubleField(term320, term320.getClass(), "minY", 0.8474802076607362);
        setDoubleField(term320, term320.getClass(), "maxY", 0.5183269973490326);
        setField(term320, term320.getClass(), "minZ", term338);
        setField(term320, term320.getClass(), "maxZ", term340);
        setField(term320, term320.getClass(), "minM", term342);
        setField(term320, term320.getClass(), "maxM", term344);
        term346 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndexKey"));
        setField(term346, term346.getClass(), "tableName", "MxlszYVzRf");
        setLongField(term346, term346.getClass(), "geomId", -4325723315152823407L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndexKey");
        Object[] args = new Object[1];
        args[0] = term346;
        callMethod(klass, "setId", argTypes, term320, args);
    }

};


