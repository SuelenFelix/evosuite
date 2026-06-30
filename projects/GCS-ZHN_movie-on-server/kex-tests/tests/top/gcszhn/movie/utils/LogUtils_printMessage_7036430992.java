package top.gcszhn.movie.utils;

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
import static top.gcszhn.movie.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class LogUtils_printMessage_7036430992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum3;

    public LogUtils_printMessage_7036430992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3308 = Class.forName((String) "top.gcszhn.movie.utils.LogUtils$Level");
        Field term3307 = ((Class) term3308).getDeclaredField((String) "ERROR");
        ((Field) term3307).setAccessible(true);
        enum3 = ((Field) term3307).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("top.gcszhn.movie.utils.LogUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("top.gcszhn.movie.utils.LogUtils$Level");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = "jJCZpVmanW";
        args[1] = enum3;
        args[2] = "EGtDIRbSSb";
        callMethod(klass, "printMessage", argTypes, null, args);
    }

};


