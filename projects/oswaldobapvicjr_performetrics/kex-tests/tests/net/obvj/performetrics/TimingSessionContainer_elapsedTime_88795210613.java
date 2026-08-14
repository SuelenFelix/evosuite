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

public class TimingSessionContainer_elapsedTime_88795210613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum401;
     Object enum402;
     Object enum403;

    public TimingSessionContainer_elapsedTime_88795210613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term114447 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term114446 = ((Class) term114447).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term114446).setAccessible(true);
        enum401 = ((Field) term114446).get((Object) null);
        Class<? extends Object> term114662 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term114661 = ((Class) term114662).getDeclaredField((String) "MICROSECONDS");
        ((Field) term114661).setAccessible(true);
        enum402 = ((Field) term114661).get((Object) null);
        Class<? extends Object> term114850 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term114849 = ((Class) term114850).getDeclaredField((String) "FAST");
        ((Field) term114849).setAccessible(true);
        enum403 = ((Field) term114849).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.TimingSessionContainer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("net.obvj.performetrics.Counter$Type");
        argTypes[1] = Class.forName("java.util.concurrent.TimeUnit");
        argTypes[2] = Class.forName("net.obvj.performetrics.ConversionMode");
        Object[] args = new Object[3];
        args[0] = enum401;
        args[1] = enum402;
        args[2] = enum403;
        callMethod(klass, "elapsedTime", argTypes, null, args);
    }

};


