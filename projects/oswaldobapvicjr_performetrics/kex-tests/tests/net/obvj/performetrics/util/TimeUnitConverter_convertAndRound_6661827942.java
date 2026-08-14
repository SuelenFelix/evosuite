package net.obvj.performetrics.util;

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
import static net.obvj.performetrics.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class TimeUnitConverter_convertAndRound_6661827942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2792;
     Object enum10;
     Object enum11;
     Object term2835;

    public TimeUnitConverter_convertAndRound_6661827942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2792 = new Long(5262507301787091109L);
        Class<? extends Object> term2838 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term2837 = ((Class) term2838).getDeclaredField((String) "MICROSECONDS");
        ((Field) term2837).setAccessible(true);
        enum10 = ((Field) term2837).get((Object) null);
        Class<? extends Object> term3026 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term3025 = ((Class) term3026).getDeclaredField((String) "HOURS");
        ((Field) term3025).setAccessible(true);
        enum11 = ((Field) term3025).get((Object) null);
        term2835 = new Integer(-1275173084);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.TimeUnitConverter");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("java.util.concurrent.TimeUnit");
        argTypes[2] = Class.forName("java.util.concurrent.TimeUnit");
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term2792;
        args[1] = enum10;
        args[2] = enum11;
        args[3] = term2835;
        callMethod(klass, "convertAndRound", argTypes, null, args);
    }

};


