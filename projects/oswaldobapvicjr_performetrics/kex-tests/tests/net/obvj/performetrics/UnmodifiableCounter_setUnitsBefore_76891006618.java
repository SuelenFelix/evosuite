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

public class UnmodifiableCounter_setUnitsBefore_76891006618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214835;

    public UnmodifiableCounter_setUnitsBefore_76891006618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term214835 = newInstance(Class.forName("net.obvj.performetrics.UnmodifiableCounter"));
        setField(term214835, term214835.getClass(), "counter", null);
        setField(term214835, term214835.getClass(), "type", null);
        setField(term214835, term214835.getClass(), "conversionMode", null);
        setLongField(term214835, term214835.getClass(), "unitsBefore", 0L);
        setLongField(term214835, term214835.getClass(), "unitsAfter", 0L);
        setBooleanField(term214835, term214835.getClass(), "unitsAfterSet", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.UnmodifiableCounter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setUnitsBefore", argTypes, term214835, args);
    }

};


