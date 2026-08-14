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

public class GeoPackageValidate_validateGeoPackageExtension_16416612474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245;

    public GeoPackageValidate_validateGeoPackageExtension_16416612474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term281 = Class.forName((String) "java.io.File$PathStatus");
        Field term280 = ((Class) term281).getDeclaredField((String) "INVALID");
        ((Field) term280).setAccessible(true);
        Object enum1 = ((Field) term280).get((Object) null);
        term245 = newInstance(Class.forName("java.io.File"));
        setField(term245, term245.getClass(), "path", "xxtlPwDYFs");
        setField(term245, term245.getClass(), "status", enum1);
        setIntField(term245, term245.getClass(), "prefixLength", 1162663216);
        setField(term245, term245.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.validate.GeoPackageValidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term245;
        callMethod(klass, "validateGeoPackageExtension", argTypes, null, args);
    }

};


