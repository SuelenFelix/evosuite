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

public class UnmodifiableCounter_elapsedTime_113137633022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214851;

    public UnmodifiableCounter_elapsedTime_113137633022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term214851 = newInstance(Class.forName("net.obvj.performetrics.UnmodifiableCounter"));
        setField(term214851, term214851.getClass(), "counter", null);
        setField(term214851, term214851.getClass(), "type", null);
        setField(term214851, term214851.getClass(), "conversionMode", null);
        setLongField(term214851, term214851.getClass(), "unitsBefore", 0L);
        setLongField(term214851, term214851.getClass(), "unitsAfter", 0L);
        setBooleanField(term214851, term214851.getClass(), "unitsAfterSet", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.UnmodifiableCounter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.concurrent.TimeUnit");
        argTypes[1] = Class.forName("net.obvj.performetrics.ConversionMode");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "elapsedTime", argTypes, term214851, args);
    }

};


