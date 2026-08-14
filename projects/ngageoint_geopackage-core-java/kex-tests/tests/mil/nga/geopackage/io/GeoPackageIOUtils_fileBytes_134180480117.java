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

public class GeoPackageIOUtils_fileBytes_134180480117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2027;

    public GeoPackageIOUtils_fileBytes_134180480117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2063 = Class.forName((String) "java.io.File$PathStatus");
        Field term2062 = ((Class) term2063).getDeclaredField((String) "INVALID");
        ((Field) term2062).setAccessible(true);
        Object enum10 = ((Field) term2062).get((Object) null);
        term2027 = newInstance(Class.forName("java.io.File"));
        setField(term2027, term2027.getClass(), "path", "hNxWaHcfhY");
        setField(term2027, term2027.getClass(), "status", enum10);
        setIntField(term2027, term2027.getClass(), "prefixLength", 1134449235);
        setField(term2027, term2027.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.io.GeoPackageIOUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term2027;
        callMethod(klass, "fileBytes", argTypes, null, args);
    }

};


