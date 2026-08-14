package mil.nga.geopackage.validate;

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
import static mil.nga.geopackage.validate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class GeoPackageValidate_addGeoPackageExtension_21135263946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term445;

    public GeoPackageValidate_addGeoPackageExtension_21135263946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term481 = Class.forName((String) "java.io.File$PathStatus");
        Field term480 = ((Class) term481).getDeclaredField((String) "INVALID");
        ((Field) term480).setAccessible(true);
        Object enum2 = ((Field) term480).get((Object) null);
        term445 = newInstance(Class.forName("java.io.File"));
        setField(term445, term445.getClass(), "path", "EGtDIRbSSb");
        setField(term445, term445.getClass(), "status", enum2);
        setIntField(term445, term445.getClass(), "prefixLength", 1484323161);
        setField(term445, term445.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.validate.GeoPackageValidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term445;
        callMethod(klass, "addGeoPackageExtension", argTypes, null, args);
    }

};


