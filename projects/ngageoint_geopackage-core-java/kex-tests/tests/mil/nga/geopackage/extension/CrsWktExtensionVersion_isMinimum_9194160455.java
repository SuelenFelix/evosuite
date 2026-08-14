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

public class CrsWktExtensionVersion_isMinimum_9194160455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum2;

    public CrsWktExtensionVersion_isMinimum_9194160455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3366 = Class.forName((String) "mil.nga.geopackage.extension.CrsWktExtensionVersion");
        Field term3365 = ((Class) term3366).getDeclaredField((String) "V_1");
        ((Field) term3365).setAccessible(true);
        enum2 = ((Field) term3365).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.CrsWktExtensionVersion");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.extension.CrsWktExtensionVersion");
        Object[] args = new Object[1];
        args[0] = enum2;
        callMethod(klass, "isMinimum", argTypes, enum2, args);
    }

};


