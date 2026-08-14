package mil.nga.geopackage.property;

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
import static mil.nga.geopackage.property.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GeoPackageProperties_getProperty_13059259543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47;

    public GeoPackageProperties_getProperty_13059259543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47 = (Object[]) newArray("java.lang.String", 5);
        setElement(term47, 0, "MuLcgQHgqz");
        setElement(term47, 1, "xxtlPwDYFs");
        setElement(term47, 2, "jJCZpVmanW");
        setElement(term47, 3, "EGtDIRbSSb");
        setElement(term47, 4, "SzjVpOQTyS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.property.GeoPackageProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term47;
        callMethod(klass, "getProperty", argTypes, null, args);
    }

};


