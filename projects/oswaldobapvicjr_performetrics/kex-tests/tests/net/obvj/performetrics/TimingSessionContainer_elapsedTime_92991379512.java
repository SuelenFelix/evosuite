package net.obvj.performetrics;

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
import static net.obvj.performetrics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class TimingSessionContainer_elapsedTime_92991379512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum399;
     Object enum400;

    public TimingSessionContainer_elapsedTime_92991379512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term114017 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term114016 = ((Class) term114017).getDeclaredField((String) "CPU_TIME");
        ((Field) term114016).setAccessible(true);
        enum399 = ((Field) term114016).get((Object) null);
        Class<? extends Object> term114223 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term114222 = ((Class) term114223).getDeclaredField((String) "DAYS");
        ((Field) term114222).setAccessible(true);
        enum400 = ((Field) term114222).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.TimingSessionContainer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("net.obvj.performetrics.Counter$Type");
        argTypes[1] = Class.forName("java.util.concurrent.TimeUnit");
        Object[] args = new Object[2];
        args[0] = enum399;
        args[1] = enum400;
        callMethod(klass, "elapsedTime", argTypes, null, args);
    }

};


