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

public class Duration_sum_33151997825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2234;
     Object term2240;

    public Duration_sum_33151997825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2234 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term2235 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term2235, term2235.getClass(), "seconds", 306000L);
        setIntField(term2235, term2235.getClass(), "nanos", 0);
        setField(term2234, term2234.getClass(), "internalDuration", term2235);
        setLongField(term2234, term2234.getClass(), "effectiveTotalSeconds", -2585684163342970173L);
        setIntField(term2234, term2234.getClass(), "effectiveNanoseconds", -655067527);
        term2240 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term2241 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term2241, term2241.getClass(), "seconds", 154800L);
        setIntField(term2241, term2241.getClass(), "nanos", 0);
        setField(term2240, term2240.getClass(), "internalDuration", term2241);
        setLongField(term2240, term2240.getClass(), "effectiveTotalSeconds", 8059786003080744426L);
        setIntField(term2240, term2240.getClass(), "effectiveNanoseconds", -6029667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.Duration");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("net.obvj.performetrics.util.Duration");
        argTypes[1] = Class.forName("net.obvj.performetrics.util.Duration");
        Object[] args = new Object[2];
        args[0] = term2234;
        args[1] = term2240;
        callMethod(klass, "sum", argTypes, null, args);
    }

};


