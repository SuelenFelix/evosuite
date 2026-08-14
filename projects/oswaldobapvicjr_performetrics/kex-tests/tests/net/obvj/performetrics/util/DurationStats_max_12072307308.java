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

public class DurationStats_max_12072307308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60601;

    public DurationStats_max_12072307308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60601 = newInstance(Class.forName("net.obvj.performetrics.util.DurationStats"));
        Object term60604 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term60605 = newInstance(Class.forName("java.time.Duration"));
        Object term60610 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term60611 = newInstance(Class.forName("java.time.Duration"));
        Object term60616 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term60617 = newInstance(Class.forName("java.time.Duration"));
        setIntField(term60601, term60601.getClass(), "flags", 7);
        setIntField(term60601, term60601.getClass(), "count", 1555897383);
        setLongField(term60605, term60605.getClass(), "seconds", 0L);
        setIntField(term60605, term60605.getClass(), "nanos", 0);
        setField(term60604, term60604.getClass(), "internalDuration", term60605);
        setLongField(term60604, term60604.getClass(), "effectiveTotalSeconds", 0L);
        setIntField(term60604, term60604.getClass(), "effectiveNanoseconds", 0);
        setField(term60601, term60601.getClass(), "sum", term60604);
        setLongField(term60611, term60611.getClass(), "seconds", 334800L);
        setIntField(term60611, term60611.getClass(), "nanos", 0);
        setField(term60610, term60610.getClass(), "internalDuration", term60611);
        setLongField(term60610, term60610.getClass(), "effectiveTotalSeconds", -3838084482494604218L);
        setIntField(term60610, term60610.getClass(), "effectiveNanoseconds", 202001407);
        setField(term60601, term60601.getClass(), "min", term60610);
        setLongField(term60617, term60617.getClass(), "seconds", 302400L);
        setIntField(term60617, term60617.getClass(), "nanos", 0);
        setField(term60616, term60616.getClass(), "internalDuration", term60617);
        setLongField(term60616, term60616.getClass(), "effectiveTotalSeconds", 3892018155439224435L);
        setIntField(term60616, term60616.getClass(), "effectiveNanoseconds", 158873461);
        setField(term60601, term60601.getClass(), "max", term60616);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.DurationStats");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "max", argTypes, term60601, args);
    }

};


