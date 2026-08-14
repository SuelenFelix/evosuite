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

public class DurationStats_average_1276110056 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60559;

    public DurationStats_average_1276110056() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60559 = newInstance(Class.forName("net.obvj.performetrics.util.DurationStats"));
        Object term60562 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term60563 = newInstance(Class.forName("java.time.Duration"));
        Object term60568 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term60569 = newInstance(Class.forName("java.time.Duration"));
        Object term60574 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term60575 = newInstance(Class.forName("java.time.Duration"));
        setIntField(term60559, term60559.getClass(), "flags", 7);
        setIntField(term60559, term60559.getClass(), "count", -1222006000);
        setLongField(term60563, term60563.getClass(), "seconds", 0L);
        setIntField(term60563, term60563.getClass(), "nanos", 0);
        setField(term60562, term60562.getClass(), "internalDuration", term60563);
        setLongField(term60562, term60562.getClass(), "effectiveTotalSeconds", 0L);
        setIntField(term60562, term60562.getClass(), "effectiveNanoseconds", 0);
        setField(term60559, term60559.getClass(), "sum", term60562);
        setLongField(term60569, term60569.getClass(), "seconds", 270000L);
        setIntField(term60569, term60569.getClass(), "nanos", 0);
        setField(term60568, term60568.getClass(), "internalDuration", term60569);
        setLongField(term60568, term60568.getClass(), "effectiveTotalSeconds", -2644215923136513282L);
        setIntField(term60568, term60568.getClass(), "effectiveNanoseconds", 2095798786);
        setField(term60559, term60559.getClass(), "min", term60568);
        setLongField(term60575, term60575.getClass(), "seconds", 284400L);
        setIntField(term60575, term60575.getClass(), "nanos", 0);
        setField(term60574, term60574.getClass(), "internalDuration", term60575);
        setLongField(term60574, term60574.getClass(), "effectiveTotalSeconds", -1468719814009985452L);
        setIntField(term60574, term60574.getClass(), "effectiveNanoseconds", -1565502840);
        setField(term60559, term60559.getClass(), "max", term60574);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.DurationStats");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "average", argTypes, term60559, args);
    }

};


