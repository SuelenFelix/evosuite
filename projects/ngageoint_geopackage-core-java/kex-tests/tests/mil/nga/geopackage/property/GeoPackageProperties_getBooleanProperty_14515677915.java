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

public class GeoPackageProperties_getBooleanProperty_14515677915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term703;

    public GeoPackageProperties_getBooleanProperty_14515677915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term703 = (Object[]) newArray("java.lang.String", 2);
        setElement(term703, 0, "dWRymuLBtr");
        setElement(term703, 1, "AijpHYOFuy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.property.GeoPackageProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term703;
        callMethod(klass, "getBooleanProperty", argTypes, null, args);
    }

};


