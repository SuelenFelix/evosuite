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

public class GeoPackageIOUtils_copyFile_28694909013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1315;

    public GeoPackageIOUtils_copyFile_28694909013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1351 = Class.forName((String) "java.io.File$PathStatus");
        Field term1350 = ((Class) term1351).getDeclaredField((String) "INVALID");
        ((Field) term1350).setAccessible(true);
        Object enum6 = ((Field) term1350).get((Object) null);
        term1315 = newInstance(Class.forName("java.io.File"));
        setField(term1315, term1315.getClass(), "path", "ZiaGIbnzTs");
        setField(term1315, term1315.getClass(), "status", enum6);
        setIntField(term1315, term1315.getClass(), "prefixLength", 1227103734);
        setField(term1315, term1315.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.io.GeoPackageIOUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.io.OutputStream");
        Object[] args = new Object[2];
        args[0] = term1315;
        args[1] = null;
        callMethod(klass, "copyFile", argTypes, null, args);
    }

};


