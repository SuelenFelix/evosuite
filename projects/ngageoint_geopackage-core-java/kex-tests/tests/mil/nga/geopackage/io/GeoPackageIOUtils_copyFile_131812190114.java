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

public class GeoPackageIOUtils_copyFile_131812190114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1493;

    public GeoPackageIOUtils_copyFile_131812190114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1529 = Class.forName((String) "java.io.File$PathStatus");
        Field term1528 = ((Class) term1529).getDeclaredField((String) "CHECKED");
        ((Field) term1528).setAccessible(true);
        Object enum7 = ((Field) term1528).get((Object) null);
        term1493 = newInstance(Class.forName("java.io.File"));
        setField(term1493, term1493.getClass(), "path", "tbcdzjIfER");
        setField(term1493, term1493.getClass(), "status", enum7);
        setIntField(term1493, term1493.getClass(), "prefixLength", -1339778481);
        setField(term1493, term1493.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.io.GeoPackageIOUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.io.OutputStream");
        argTypes[2] = Class.forName("mil.nga.geopackage.io.GeoPackageProgress");
        Object[] args = new Object[3];
        args[0] = term1493;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "copyFile", argTypes, null, args);
    }

};


