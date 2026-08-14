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

public class UnmodifiableCounter_setUnitsAfter_112876356517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214829;
     Object term214833;

    public UnmodifiableCounter_setUnitsAfter_112876356517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term214829 = newInstance(Class.forName("net.obvj.performetrics.UnmodifiableCounter"));
        setField(term214829, term214829.getClass(), "counter", null);
        setField(term214829, term214829.getClass(), "type", null);
        setField(term214829, term214829.getClass(), "conversionMode", null);
        setLongField(term214829, term214829.getClass(), "unitsBefore", 0L);
        setLongField(term214829, term214829.getClass(), "unitsAfter", 0L);
        setBooleanField(term214829, term214829.getClass(), "unitsAfterSet", false);
        term214833 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.UnmodifiableCounter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term214833;
        callMethod(klass, "setUnitsAfter", argTypes, term214829, args);
    }

};


