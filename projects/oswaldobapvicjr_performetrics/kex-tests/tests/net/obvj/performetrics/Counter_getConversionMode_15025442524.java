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

public class Counter_getConversionMode_15025442524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222425;

    public Counter_getConversionMode_15025442524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222425 = newInstance(Class.forName("net.obvj.performetrics.Counter"));
        setField(term222425, term222425.getClass(), "type", null);
        setField(term222425, term222425.getClass(), "conversionMode", null);
        setLongField(term222425, term222425.getClass(), "unitsBefore", 0L);
        setLongField(term222425, term222425.getClass(), "unitsAfter", 0L);
        setBooleanField(term222425, term222425.getClass(), "unitsAfterSet", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.Counter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConversionMode", argTypes, term222425, args);
    }

};


