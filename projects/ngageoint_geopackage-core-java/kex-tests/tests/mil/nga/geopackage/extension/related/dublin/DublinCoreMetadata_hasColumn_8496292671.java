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

public class DublinCoreMetadata_hasColumn_8496292671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum0;

    public DublinCoreMetadata_hasColumn_8496292671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term175 = Class.forName((String) "mil.nga.geopackage.extension.related.dublin.DublinCoreType");
        Field term174 = ((Class) term175).getDeclaredField((String) "DESCRIPTION");
        ((Field) term174).setAccessible(true);
        enum0 = ((Field) term174).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.dublin.DublinCoreMetadata");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("mil.nga.geopackage.user.UserTable");
        argTypes[1] = Class.forName("mil.nga.geopackage.extension.related.dublin.DublinCoreType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = enum0;
        callMethod(klass, "hasColumn", argTypes, null, args);
    }

};


