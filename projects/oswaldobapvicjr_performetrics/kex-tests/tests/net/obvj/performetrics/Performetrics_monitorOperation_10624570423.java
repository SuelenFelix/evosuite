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

public class Performetrics_monitorOperation_10624570423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205898;

    public Performetrics_monitorOperation_10624570423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term205982 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term205981 = ((Class) term205982).getDeclaredField((String) "USER_TIME");
        ((Field) term205981).setAccessible(true);
        Object enum737 = ((Field) term205981).get((Object) null);
        Class<? extends Object> term206191 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term206190 = ((Class) term206191).getDeclaredField((String) "CPU_TIME");
        ((Field) term206190).setAccessible(true);
        Object enum738 = ((Field) term206190).get((Object) null);
        Class<? extends Object> term206397 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term206396 = ((Class) term206397).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term206396).setAccessible(true);
        Object enum739 = ((Field) term206396).get((Object) null);
        term205898 = (Object[]) newArray("net.obvj.performetrics.Counter$Type", 9);
        setElement(term205898, 0, enum737);
        setElement(term205898, 1, enum738);
        setElement(term205898, 2, enum739);
        setElement(term205898, 3, enum737);
        setElement(term205898, 4, enum739);
        setElement(term205898, 5, enum738);
        setElement(term205898, 6, enum737);
        setElement(term205898, 7, enum739);
        setElement(term205898, 8, enum737);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.Performetrics");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Runnable");
        argTypes[1] = Array.newInstance(Class.forName("net.obvj.performetrics.Counter$Type"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term205898;
        callMethod(klass, "monitorOperation", argTypes, null, args);
    }

};


