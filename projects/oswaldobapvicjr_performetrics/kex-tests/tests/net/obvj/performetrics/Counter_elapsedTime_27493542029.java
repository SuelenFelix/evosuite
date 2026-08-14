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

public class Counter_elapsedTime_27493542029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222445;

    public Counter_elapsedTime_27493542029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222445 = newInstance(Class.forName("net.obvj.performetrics.Counter"));
        setField(term222445, term222445.getClass(), "type", null);
        setField(term222445, term222445.getClass(), "conversionMode", null);
        setLongField(term222445, term222445.getClass(), "unitsBefore", 0L);
        setLongField(term222445, term222445.getClass(), "unitsAfter", 0L);
        setBooleanField(term222445, term222445.getClass(), "unitsAfterSet", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.Counter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.concurrent.TimeUnit");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "elapsedTime", argTypes, term222445, args);
    }

};


