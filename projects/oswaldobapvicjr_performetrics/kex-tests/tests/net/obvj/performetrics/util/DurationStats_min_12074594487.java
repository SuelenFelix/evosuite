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

public class DurationStats_min_12074594487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60580;

    public DurationStats_min_12074594487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60580 = newInstance(Class.forName("net.obvj.performetrics.util.DurationStats"));
        Object term60583 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term60584 = newInstance(Class.forName("java.time.Duration"));
        Object term60589 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term60590 = newInstance(Class.forName("java.time.Duration"));
        Object term60595 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term60596 = newInstance(Class.forName("java.time.Duration"));
        setIntField(term60580, term60580.getClass(), "flags", 7);
        setIntField(term60580, term60580.getClass(), "count", 344323424);
        setLongField(term60584, term60584.getClass(), "seconds", 0L);
        setIntField(term60584, term60584.getClass(), "nanos", 0);
        setField(term60583, term60583.getClass(), "internalDuration", term60584);
        setLongField(term60583, term60583.getClass(), "effectiveTotalSeconds", 0L);
        setIntField(term60583, term60583.getClass(), "effectiveNanoseconds", 0);
        setField(term60580, term60580.getClass(), "sum", term60583);
        setLongField(term60590, term60590.getClass(), "seconds", 244800L);
        setIntField(term60590, term60590.getClass(), "nanos", 0);
        setField(term60589, term60589.getClass(), "internalDuration", term60590);
        setLongField(term60589, term60589.getClass(), "effectiveTotalSeconds", -7738503207562305297L);
        setIntField(term60589, term60589.getClass(), "effectiveNanoseconds", 9726679);
        setField(term60580, term60580.getClass(), "min", term60589);
        setLongField(term60596, term60596.getClass(), "seconds", 54000L);
        setIntField(term60596, term60596.getClass(), "nanos", 0);
        setField(term60595, term60595.getClass(), "internalDuration", term60596);
        setLongField(term60595, term60595.getClass(), "effectiveTotalSeconds", 3825396310311739952L);
        setIntField(term60595, term60595.getClass(), "effectiveNanoseconds", -25637976);
        setField(term60580, term60580.getClass(), "max", term60595);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.DurationStats");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "min", argTypes, term60580, args);
    }

};


