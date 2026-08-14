package mil.nga.geopackage.extension;

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
import static mil.nga.geopackage.extension.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class CrsWktExtension_hasMinimum_2690841634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum30;

    public CrsWktExtension_hasMinimum_2690841634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24358 = Class.forName((String) "mil.nga.geopackage.extension.CrsWktExtensionVersion");
        Field term24357 = ((Class) term24358).getDeclaredField((String) "V_1_1");
        ((Field) term24357).setAccessible(true);
        enum30 = ((Field) term24357).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.CrsWktExtension");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.extension.CrsWktExtensionVersion");
        Object[] args = new Object[1];
        args[0] = enum30;
        callMethod(klass, "hasMinimum", argTypes, null, args);
    }

};


