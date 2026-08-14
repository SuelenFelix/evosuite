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

public class DurationStats_accept_1179102823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60526;
     Object term60547;

    public DurationStats_accept_1179102823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60526 = newInstance(Class.forName("net.obvj.performetrics.util.DurationStats"));
        Object term60529 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term60530 = newInstance(Class.forName("java.time.Duration"));
        Object term60535 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term60536 = newInstance(Class.forName("java.time.Duration"));
        Object term60541 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term60542 = newInstance(Class.forName("java.time.Duration"));
        setIntField(term60526, term60526.getClass(), "flags", 7);
        setIntField(term60526, term60526.getClass(), "count", -343325701);
        setLongField(term60530, term60530.getClass(), "seconds", 0L);
        setIntField(term60530, term60530.getClass(), "nanos", 0);
        setField(term60529, term60529.getClass(), "internalDuration", term60530);
        setLongField(term60529, term60529.getClass(), "effectiveTotalSeconds", 0L);
        setIntField(term60529, term60529.getClass(), "effectiveNanoseconds", 0);
        setField(term60526, term60526.getClass(), "sum", term60529);
        setLongField(term60536, term60536.getClass(), "seconds", 226800L);
        setIntField(term60536, term60536.getClass(), "nanos", 0);
        setField(term60535, term60535.getClass(), "internalDuration", term60536);
        setLongField(term60535, term60535.getClass(), "effectiveTotalSeconds", -3842548265506930260L);
        setIntField(term60535, term60535.getClass(), "effectiveNanoseconds", 107945604);
        setField(term60526, term60526.getClass(), "min", term60535);
        setLongField(term60542, term60542.getClass(), "seconds", 90000L);
        setIntField(term60542, term60542.getClass(), "nanos", 0);
        setField(term60541, term60541.getClass(), "internalDuration", term60542);
        setLongField(term60541, term60541.getClass(), "effectiveTotalSeconds", -5788180182343976541L);
        setIntField(term60541, term60541.getClass(), "effectiveNanoseconds", -1963464809);
        setField(term60526, term60526.getClass(), "max", term60541);
        term60547 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term60548 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term60548, term60548.getClass(), "seconds", 208800L);
        setIntField(term60548, term60548.getClass(), "nanos", 0);
        setField(term60547, term60547.getClass(), "internalDuration", term60548);
        setLongField(term60547, term60547.getClass(), "effectiveTotalSeconds", 2936323121573284007L);
        setIntField(term60547, term60547.getClass(), "effectiveNanoseconds", 71190297);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.DurationStats");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.util.Duration");
        Object[] args = new Object[1];
        args[0] = term60547;
        callMethod(klass, "accept", argTypes, term60526, args);
    }

};


