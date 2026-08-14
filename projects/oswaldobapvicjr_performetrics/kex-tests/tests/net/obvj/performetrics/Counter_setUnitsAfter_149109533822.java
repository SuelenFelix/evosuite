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
import java.lang.Long;

public class Counter_setUnitsAfter_149109533822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222415;
     Object term222419;

    public Counter_setUnitsAfter_149109533822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222415 = newInstance(Class.forName("net.obvj.performetrics.Counter"));
        setField(term222415, term222415.getClass(), "type", null);
        setField(term222415, term222415.getClass(), "conversionMode", null);
        setLongField(term222415, term222415.getClass(), "unitsBefore", 0L);
        setLongField(term222415, term222415.getClass(), "unitsAfter", 0L);
        setBooleanField(term222415, term222415.getClass(), "unitsAfterSet", false);
        term222419 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.Counter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term222419;
        callMethod(klass, "setUnitsAfter", argTypes, term222415, args);
    }

};


