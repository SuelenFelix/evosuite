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

public class GeoPackageIOUtils_fileString_184660684519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2383;

    public GeoPackageIOUtils_fileString_184660684519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2431 = Class.forName((String) "java.io.File$PathStatus");
        Field term2430 = ((Class) term2431).getDeclaredField((String) "INVALID");
        ((Field) term2430).setAccessible(true);
        Object enum12 = ((Field) term2430).get((Object) null);
        term2383 = newInstance(Class.forName("java.io.File"));
        setField(term2383, term2383.getClass(), "path", "xOEqzGAmDU");
        setField(term2383, term2383.getClass(), "status", enum12);
        setIntField(term2383, term2383.getClass(), "prefixLength", 1585847225);
        setField(term2383, term2383.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.io.GeoPackageIOUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term2383;
        args[1] = "eZFUvlxvGV";
        callMethod(klass, "fileString", argTypes, null, args);
    }

};


