package mil.nga.geopackage.extension.related.dublin;

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
import static mil.nga.geopackage.extension.related.dublin.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class DublinCoreMetadata_setValue_1660361886 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum5;
     Object term1902;

    public DublinCoreMetadata_setValue_1660361886() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1904 = Class.forName((String) "mil.nga.geopackage.extension.related.dublin.DublinCoreType");
        Field term1903 = ((Class) term1904).getDeclaredField((String) "DESCRIPTION");
        ((Field) term1903).setAccessible(true);
        enum5 = ((Field) term1903).get((Object) null);
        term1902 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.dublin.DublinCoreMetadata");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("mil.nga.geopackage.user.UserCoreRow");
        argTypes[1] = Class.forName("mil.nga.geopackage.extension.related.dublin.DublinCoreType");
        argTypes[2] = Class.forName("java.lang.Object");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = enum5;
        args[2] = term1902;
        callMethod(klass, "setValue", argTypes, null, args);
    }

};


