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

public class DurationStats_max_120723073016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60658;

    public DurationStats_max_120723073016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60658 = newInstance(Class.forName("net.obvj.performetrics.util.DurationStats"));
        setIntField(term60658, term60658.getClass(), "flags", 0);
        setIntField(term60658, term60658.getClass(), "count", 0);
        setField(term60658, term60658.getClass(), "sum", null);
        setField(term60658, term60658.getClass(), "min", null);
        setField(term60658, term60658.getClass(), "max", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.DurationStats");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "max", argTypes, term60658, args);
    }

};


