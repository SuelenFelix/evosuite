package mil.nga.geopackage.contents;

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
import static mil.nga.geopackage.contents.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;

public class ContentsDataType_isType_36322636811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum4;
     Object term1258;

    public ContentsDataType_isType_36322636811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1271 = Class.forName((String) "mil.nga.geopackage.contents.ContentsDataType");
        Field term1270 = ((Class) term1271).getDeclaredField((String) "FEATURES");
        ((Field) term1270).setAccessible(true);
        enum4 = ((Field) term1270).get((Object) null);
        term1258 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.contents.ContentsDataType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("mil.nga.geopackage.contents.ContentsDataType");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = "MjGYSRKTNF";
        args[1] = enum4;
        args[2] = term1258;
        callMethod(klass, "isType", argTypes, null, args);
    }

};


