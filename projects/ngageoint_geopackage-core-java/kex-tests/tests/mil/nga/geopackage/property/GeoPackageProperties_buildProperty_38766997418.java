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

public class GeoPackageProperties_buildProperty_38766997418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term883;

    public GeoPackageProperties_buildProperty_38766997418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term883 = (Object[]) newArray("java.lang.String", 7);
        setElement(term883, 0, "aKnKipADSo");
        setElement(term883, 1, "wSQxaModmm");
        setElement(term883, 2, "UlajhuVLaP");
        setElement(term883, 3, "gGSMzuGICf");
        setElement(term883, 4, "hxCBltsObl");
        setElement(term883, 5, "BndsHwAFMv");
        setElement(term883, 6, "GzFkzHGYFt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.property.GeoPackageProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term883;
        callMethod(klass, "buildProperty", argTypes, null, args);
    }

};


