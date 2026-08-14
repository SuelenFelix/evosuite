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

public class UnmodifiableCounter_elapsedTime_8739635321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214847;

    public UnmodifiableCounter_elapsedTime_8739635321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term214847 = newInstance(Class.forName("net.obvj.performetrics.UnmodifiableCounter"));
        setField(term214847, term214847.getClass(), "counter", null);
        setField(term214847, term214847.getClass(), "type", null);
        setField(term214847, term214847.getClass(), "conversionMode", null);
        setLongField(term214847, term214847.getClass(), "unitsBefore", 0L);
        setLongField(term214847, term214847.getClass(), "unitsAfter", 0L);
        setBooleanField(term214847, term214847.getClass(), "unitsAfterSet", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.UnmodifiableCounter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.concurrent.TimeUnit");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "elapsedTime", argTypes, term214847, args);
    }

};


