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

public class GeoPackageIOUtils_copyFile_160023682911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term911;
     Object term936;

    public GeoPackageIOUtils_copyFile_160023682911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term961 = Class.forName((String) "java.io.File$PathStatus");
        Field term960 = ((Class) term961).getDeclaredField((String) "CHECKED");
        ((Field) term960).setAccessible(true);
        Object enum4 = ((Field) term960).get((Object) null);
        term911 = newInstance(Class.forName("java.io.File"));
        setField(term911, term911.getClass(), "path", "MxlszYVzRf");
        setField(term911, term911.getClass(), "status", enum4);
        setIntField(term911, term911.getClass(), "prefixLength", -1922583790);
        setField(term911, term911.getClass(), "filePath", null);
        term936 = newInstance(Class.forName("java.io.File"));
        setField(term936, term936.getClass(), "path", "LQFpaHEwXR");
        setField(term936, term936.getClass(), "status", enum4);
        setIntField(term936, term936.getClass(), "prefixLength", -616727354);
        setField(term936, term936.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.io.GeoPackageIOUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.io.File");
        Object[] args = new Object[2];
        args[0] = term911;
        args[1] = term936;
        callMethod(klass, "copyFile", argTypes, null, args);
    }

};


