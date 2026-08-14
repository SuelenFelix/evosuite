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

public class UnmodifiableCounter_getUnitsAfter_204314430316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214825;

    public UnmodifiableCounter_getUnitsAfter_204314430316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term214825 = newInstance(Class.forName("net.obvj.performetrics.UnmodifiableCounter"));
        setField(term214825, term214825.getClass(), "counter", null);
        setField(term214825, term214825.getClass(), "type", null);
        setField(term214825, term214825.getClass(), "conversionMode", null);
        setLongField(term214825, term214825.getClass(), "unitsBefore", 0L);
        setLongField(term214825, term214825.getClass(), "unitsAfter", 0L);
        setBooleanField(term214825, term214825.getClass(), "unitsAfterSet", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.UnmodifiableCounter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUnitsAfter", argTypes, term214825, args);
    }

};


