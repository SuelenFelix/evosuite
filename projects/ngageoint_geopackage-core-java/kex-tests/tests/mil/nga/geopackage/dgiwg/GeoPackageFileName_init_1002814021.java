package mil.nga.geopackage.dgiwg;

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
import static mil.nga.geopackage.dgiwg.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class GeoPackageFileName_init_1002814021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20690;

    public GeoPackageFileName_init_1002814021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20726 = Class.forName((String) "java.io.File$PathStatus");
        Field term20725 = ((Class) term20726).getDeclaredField((String) "CHECKED");
        ((Field) term20725).setAccessible(true);
        Object enum52 = ((Field) term20725).get((Object) null);
        term20690 = newInstance(Class.forName("java.io.File"));
        setField(term20690, term20690.getClass(), "path", "fzeqPnzpnt");
        setField(term20690, term20690.getClass(), "status", enum52);
        setIntField(term20690, term20690.getClass(), "prefixLength", -1685132342);
        setField(term20690, term20690.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term20690;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


