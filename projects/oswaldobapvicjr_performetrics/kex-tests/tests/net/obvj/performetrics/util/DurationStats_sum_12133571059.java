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

public class DurationStats_sum_12133571059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60622;

    public DurationStats_sum_12133571059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60622 = newInstance(Class.forName("net.obvj.performetrics.util.DurationStats"));
        Object term60625 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term60626 = newInstance(Class.forName("java.time.Duration"));
        Object term60631 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term60632 = newInstance(Class.forName("java.time.Duration"));
        Object term60637 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term60638 = newInstance(Class.forName("java.time.Duration"));
        setIntField(term60622, term60622.getClass(), "flags", 7);
        setIntField(term60622, term60622.getClass(), "count", -430151637);
        setLongField(term60626, term60626.getClass(), "seconds", 0L);
        setIntField(term60626, term60626.getClass(), "nanos", 0);
        setField(term60625, term60625.getClass(), "internalDuration", term60626);
        setLongField(term60625, term60625.getClass(), "effectiveTotalSeconds", 0L);
        setIntField(term60625, term60625.getClass(), "effectiveNanoseconds", 0);
        setField(term60622, term60622.getClass(), "sum", term60625);
        setLongField(term60632, term60632.getClass(), "seconds", 306000L);
        setIntField(term60632, term60632.getClass(), "nanos", 0);
        setField(term60631, term60631.getClass(), "internalDuration", term60632);
        setLongField(term60631, term60631.getClass(), "effectiveTotalSeconds", 5953383087795962419L);
        setIntField(term60631, term60631.getClass(), "effectiveNanoseconds", -1697741339);
        setField(term60622, term60622.getClass(), "min", term60631);
        setLongField(term60638, term60638.getClass(), "seconds", 331200L);
        setIntField(term60638, term60638.getClass(), "nanos", 0);
        setField(term60637, term60637.getClass(), "internalDuration", term60638);
        setLongField(term60637, term60637.getClass(), "effectiveTotalSeconds", 7994303628307559416L);
        setIntField(term60637, term60637.getClass(), "effectiveNanoseconds", 98922530);
        setField(term60622, term60622.getClass(), "max", term60637);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.DurationStats");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "sum", argTypes, term60622, args);
    }

};


