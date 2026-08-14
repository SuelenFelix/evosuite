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

public class Counter_setUnitsBefore_113123892520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222405;
     Object term222409;

    public Counter_setUnitsBefore_113123892520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222405 = newInstance(Class.forName("net.obvj.performetrics.Counter"));
        setField(term222405, term222405.getClass(), "type", null);
        setField(term222405, term222405.getClass(), "conversionMode", null);
        setLongField(term222405, term222405.getClass(), "unitsBefore", 0L);
        setLongField(term222405, term222405.getClass(), "unitsAfter", 0L);
        setBooleanField(term222405, term222405.getClass(), "unitsAfterSet", false);
        term222409 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.Counter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term222409;
        callMethod(klass, "setUnitsBefore", argTypes, term222405, args);
    }

};


