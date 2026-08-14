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

public class CrsWktExtensionVersion_isMinimum_91941604512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum8;

    public CrsWktExtensionVersion_isMinimum_91941604512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5045 = Class.forName((String) "mil.nga.geopackage.extension.CrsWktExtensionVersion");
        Field term5044 = ((Class) term5045).getDeclaredField((String) "FIRST");
        ((Field) term5044).setAccessible(true);
        enum8 = ((Field) term5044).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.CrsWktExtensionVersion");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.extension.CrsWktExtensionVersion");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "isMinimum", argTypes, enum8, args);
    }

};


