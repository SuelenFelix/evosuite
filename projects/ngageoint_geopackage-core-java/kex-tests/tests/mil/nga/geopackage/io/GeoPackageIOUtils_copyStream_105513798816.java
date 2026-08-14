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

public class GeoPackageIOUtils_copyStream_105513798816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1849;

    public GeoPackageIOUtils_copyStream_105513798816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1885 = Class.forName((String) "java.io.File$PathStatus");
        Field term1884 = ((Class) term1885).getDeclaredField((String) "CHECKED");
        ((Field) term1884).setAccessible(true);
        Object enum9 = ((Field) term1884).get((Object) null);
        term1849 = newInstance(Class.forName("java.io.File"));
        setField(term1849, term1849.getClass(), "path", "pCTimMblYc");
        setField(term1849, term1849.getClass(), "status", enum9);
        setIntField(term1849, term1849.getClass(), "prefixLength", -522618178);
        setField(term1849, term1849.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.io.GeoPackageIOUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = Class.forName("java.io.File");
        argTypes[2] = Class.forName("mil.nga.geopackage.io.GeoPackageProgress");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term1849;
        args[2] = null;
        callMethod(klass, "copyStream", argTypes, null, args);
    }

};


