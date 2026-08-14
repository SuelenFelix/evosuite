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

public class Stopwatch_init_18190327441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24659;

    public Stopwatch_init_18190327441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24771 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term24770 = ((Class) term24771).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term24770).setAccessible(true);
        Object enum87 = ((Field) term24770).get((Object) null);
        Class<? extends Object> term24998 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term24997 = ((Class) term24998).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term24997).setAccessible(true);
        Object enum88 = ((Field) term24997).get((Object) null);
        Class<? extends Object> term25213 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term25212 = ((Class) term25213).getDeclaredField((String) "USER_TIME");
        ((Field) term25212).setAccessible(true);
        Object enum89 = ((Field) term25212).get((Object) null);
        Class<? extends Object> term25422 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term25421 = ((Class) term25422).getDeclaredField((String) "CPU_TIME");
        ((Field) term25421).setAccessible(true);
        Object enum90 = ((Field) term25421).get((Object) null);
        term24659 = (Object[]) newArray("net.obvj.performetrics.Counter$Type", 8);
        setElement(term24659, 0, enum87);
        setElement(term24659, 1, enum88);
        setElement(term24659, 2, enum88);
        setElement(term24659, 3, enum89);
        setElement(term24659, 4, enum88);
        setElement(term24659, 5, enum88);
        setElement(term24659, 6, enum90);
        setElement(term24659, 7, enum87);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.Stopwatch");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("net.obvj.performetrics.Counter$Type"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term24659;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


