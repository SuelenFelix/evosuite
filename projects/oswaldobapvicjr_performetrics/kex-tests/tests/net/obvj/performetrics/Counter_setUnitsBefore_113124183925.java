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

public class Counter_setUnitsBefore_113124183925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222429;

    public Counter_setUnitsBefore_113124183925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222429 = newInstance(Class.forName("net.obvj.performetrics.Counter"));
        setField(term222429, term222429.getClass(), "type", null);
        setField(term222429, term222429.getClass(), "conversionMode", null);
        setLongField(term222429, term222429.getClass(), "unitsBefore", 0L);
        setLongField(term222429, term222429.getClass(), "unitsAfter", 0L);
        setBooleanField(term222429, term222429.getClass(), "unitsAfterSet", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.Counter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setUnitsBefore", argTypes, term222429, args);
    }

};


