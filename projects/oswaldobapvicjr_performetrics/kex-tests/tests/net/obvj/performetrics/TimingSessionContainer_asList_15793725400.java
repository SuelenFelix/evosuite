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
import java.lang.Object;
import java.lang.String;

public class TimingSessionContainer_asList_15793725400 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112111;

    public TimingSessionContainer_asList_15793725400() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term112173 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term112172 = ((Class) term112173).getDeclaredField((String) "USER_TIME");
        ((Field) term112172).setAccessible(true);
        Object enum391 = ((Field) term112172).get((Object) null);
        Class<? extends Object> term112382 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term112381 = ((Class) term112382).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term112381).setAccessible(true);
        Object enum392 = ((Field) term112381).get((Object) null);
        term112111 = (Object[]) newArray("net.obvj.performetrics.Counter$Type", 2);
        setElement(term112111, 0, enum391);
        setElement(term112111, 1, enum392);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.TimingSessionContainer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("net.obvj.performetrics.Counter$Type"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term112111;
        callMethod(klass, "asList", argTypes, null, args);
    }

};


