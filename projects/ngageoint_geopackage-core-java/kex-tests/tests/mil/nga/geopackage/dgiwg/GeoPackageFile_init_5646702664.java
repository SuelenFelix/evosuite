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

public class GeoPackageFile_init_5646702664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17110;

    public GeoPackageFile_init_5646702664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17158 = Class.forName((String) "java.io.File$PathStatus");
        Field term17157 = ((Class) term17158).getDeclaredField((String) "INVALID");
        ((Field) term17157).setAccessible(true);
        Object enum41 = ((Field) term17157).get((Object) null);
        term17110 = newInstance(Class.forName("java.io.File"));
        setField(term17110, term17110.getClass(), "path", "qCpEbQDHdF");
        setField(term17110, term17110.getClass(), "status", enum41);
        setIntField(term17110, term17110.getClass(), "prefixLength", -1922583790);
        setField(term17110, term17110.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFile");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term17110;
        args[1] = "AHbZyFOmlo";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


