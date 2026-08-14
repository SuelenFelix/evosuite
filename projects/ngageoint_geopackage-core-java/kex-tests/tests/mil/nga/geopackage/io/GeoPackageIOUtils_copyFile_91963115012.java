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

public class GeoPackageIOUtils_copyFile_91963115012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1113;
     Object term1138;

    public GeoPackageIOUtils_copyFile_91963115012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1163 = Class.forName((String) "java.io.File$PathStatus");
        Field term1162 = ((Class) term1163).getDeclaredField((String) "CHECKED");
        ((Field) term1162).setAccessible(true);
        Object enum5 = ((Field) term1162).get((Object) null);
        term1113 = newInstance(Class.forName("java.io.File"));
        setField(term1113, term1113.getClass(), "path", "oVcInYnLWB");
        setField(term1113, term1113.getClass(), "status", enum5);
        setIntField(term1113, term1113.getClass(), "prefixLength", -1955890973);
        setField(term1113, term1113.getClass(), "filePath", null);
        term1138 = newInstance(Class.forName("java.io.File"));
        setField(term1138, term1138.getClass(), "path", "aJlieCFVtF");
        setField(term1138, term1138.getClass(), "status", enum5);
        setIntField(term1138, term1138.getClass(), "prefixLength", -2038273078);
        setField(term1138, term1138.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.io.GeoPackageIOUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.io.File");
        argTypes[2] = Class.forName("mil.nga.geopackage.io.GeoPackageProgress");
        Object[] args = new Object[3];
        args[0] = term1113;
        args[1] = term1138;
        args[2] = null;
        callMethod(klass, "copyFile", argTypes, null, args);
    }

};


