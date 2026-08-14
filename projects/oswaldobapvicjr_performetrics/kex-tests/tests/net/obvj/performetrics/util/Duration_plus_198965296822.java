package net.obvj.performetrics.util;

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
import static net.obvj.performetrics.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Duration_plus_198965296822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2027;
     Object term2033;

    public Duration_plus_198965296822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2027 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term2028 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term2028, term2028.getClass(), "seconds", 230400L);
        setIntField(term2028, term2028.getClass(), "nanos", 0);
        setField(term2027, term2027.getClass(), "internalDuration", term2028);
        setLongField(term2027, term2027.getClass(), "effectiveTotalSeconds", 5127676408959197577L);
        setIntField(term2027, term2027.getClass(), "effectiveNanoseconds", -1456670397);
        term2033 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term2034 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term2034, term2034.getClass(), "seconds", 262800L);
        setIntField(term2034, term2034.getClass(), "nanos", 0);
        setField(term2033, term2033.getClass(), "internalDuration", term2034);
        setLongField(term2033, term2033.getClass(), "effectiveTotalSeconds", -6573104506744284592L);
        setIntField(term2033, term2033.getClass(), "effectiveNanoseconds", 1622346318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.Duration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.util.Duration");
        Object[] args = new Object[1];
        args[0] = term2033;
        callMethod(klass, "plus", argTypes, term2027, args);
    }

};


