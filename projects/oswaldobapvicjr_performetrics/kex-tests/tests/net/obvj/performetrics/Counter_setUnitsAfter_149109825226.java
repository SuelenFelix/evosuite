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

public class Counter_setUnitsAfter_149109825226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222433;

    public Counter_setUnitsAfter_149109825226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222433 = newInstance(Class.forName("net.obvj.performetrics.Counter"));
        setField(term222433, term222433.getClass(), "type", null);
        setField(term222433, term222433.getClass(), "conversionMode", null);
        setLongField(term222433, term222433.getClass(), "unitsBefore", 0L);
        setLongField(term222433, term222433.getClass(), "unitsAfter", 0L);
        setBooleanField(term222433, term222433.getClass(), "unitsAfterSet", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.Counter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setUnitsAfter", argTypes, term222433, args);
    }

};


