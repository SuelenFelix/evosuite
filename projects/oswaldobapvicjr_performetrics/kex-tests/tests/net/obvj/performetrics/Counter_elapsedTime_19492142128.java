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

public class Counter_elapsedTime_19492142128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222441;

    public Counter_elapsedTime_19492142128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222441 = newInstance(Class.forName("net.obvj.performetrics.Counter"));
        setField(term222441, term222441.getClass(), "type", null);
        setField(term222441, term222441.getClass(), "conversionMode", null);
        setLongField(term222441, term222441.getClass(), "unitsBefore", 0L);
        setLongField(term222441, term222441.getClass(), "unitsAfter", 0L);
        setBooleanField(term222441, term222441.getClass(), "unitsAfterSet", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.Counter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "elapsedTime", argTypes, term222441, args);
    }

};


