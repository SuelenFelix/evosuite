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

public class GeoPackageIOUtils_fileString_85718147818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2205;

    public GeoPackageIOUtils_fileString_85718147818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2241 = Class.forName((String) "java.io.File$PathStatus");
        Field term2240 = ((Class) term2241).getDeclaredField((String) "CHECKED");
        ((Field) term2240).setAccessible(true);
        Object enum11 = ((Field) term2240).get((Object) null);
        term2205 = newInstance(Class.forName("java.io.File"));
        setField(term2205, term2205.getClass(), "path", "RkybSrpybU");
        setField(term2205, term2205.getClass(), "status", enum11);
        setIntField(term2205, term2205.getClass(), "prefixLength", -883034806);
        setField(term2205, term2205.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.io.GeoPackageIOUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term2205;
        callMethod(klass, "fileString", argTypes, null, args);
    }

};


