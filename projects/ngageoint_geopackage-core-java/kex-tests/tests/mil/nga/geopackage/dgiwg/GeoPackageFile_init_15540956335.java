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

public class GeoPackageFile_init_15540956335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17310;

    public GeoPackageFile_init_15540956335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17346 = Class.forName((String) "java.io.File$PathStatus");
        Field term17345 = ((Class) term17346).getDeclaredField((String) "INVALID");
        ((Field) term17345).setAccessible(true);
        Object enum42 = ((Field) term17345).get((Object) null);
        term17310 = newInstance(Class.forName("java.io.File"));
        setField(term17310, term17310.getClass(), "path", "TwfWVQGiIj");
        setField(term17310, term17310.getClass(), "status", enum42);
        setIntField(term17310, term17310.getClass(), "prefixLength", -616727354);
        setField(term17310, term17310.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term17310;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


