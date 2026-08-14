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

public class TimingSessionContainer_elapsedTime_5489559210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum396;
     Object enum397;

    public TimingSessionContainer_elapsedTime_5489559210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term113309 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term113308 = ((Class) term113309).getDeclaredField((String) "HOURS");
        ((Field) term113308).setAccessible(true);
        enum396 = ((Field) term113308).get((Object) null);
        Class<? extends Object> term113476 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term113475 = ((Class) term113476).getDeclaredField((String) "DOUBLE_PRECISION");
        ((Field) term113475).setAccessible(true);
        enum397 = ((Field) term113475).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.TimingSessionContainer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.concurrent.TimeUnit");
        argTypes[1] = Class.forName("net.obvj.performetrics.ConversionMode");
        Object[] args = new Object[2];
        args[0] = enum396;
        args[1] = enum397;
        callMethod(klass, "elapsedTime", argTypes, null, args);
    }

};


