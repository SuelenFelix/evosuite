package mil.nga.geopackage.io;

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
import static mil.nga.geopackage.io.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class GeoPackageIOUtils_addFileExtension_5802741875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term423;

    public GeoPackageIOUtils_addFileExtension_5802741875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term471 = Class.forName((String) "java.io.File$PathStatus");
        Field term470 = ((Class) term471).getDeclaredField((String) "INVALID");
        ((Field) term470).setAccessible(true);
        Object enum2 = ((Field) term470).get((Object) null);
        term423 = newInstance(Class.forName("java.io.File"));
        setField(term423, term423.getClass(), "path", "jJCZpVmanW");
        setField(term423, term423.getClass(), "status", enum2);
        setIntField(term423, term423.getClass(), "prefixLength", 1484323161);
        setField(term423, term423.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.io.GeoPackageIOUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term423;
        args[1] = "EGtDIRbSSb";
        callMethod(klass, "addFileExtension", argTypes, null, args);
    }

};


