package com.rtbhouse.kafka.workers.impl.range;

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
import static com.rtbhouse.kafka.workers.impl.range.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SortedRanges_clear_63957115217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79;

    public SortedRanges_clear_63957115217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79 = newInstance(Class.forName("com.rtbhouse.kafka.workers.impl.range.SortedRanges"));
        Object term80 = newInstance(Class.forName("java.util.TreeSet"));
        Object term81 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term81, term81.getClass(), "comparator", null);
        setField(term81, term81.getClass(), "root", null);
        setIntField(term81, term81.getClass(), "size", 0);
        setIntField(term81, term81.getClass(), "modCount", 0);
        setField(term81, term81.getClass(), "entrySet", null);
        setField(term81, term81.getClass(), "navigableKeySet", null);
        setField(term81, term81.getClass(), "descendingMap", null);
        setField(term81, term81.getClass(), "keySet", null);
        setField(term81, term81.getClass(), "values", null);
        setField(term80, term80.getClass(), "m", term81);
        setField(term79, term79.getClass(), "ranges", term80);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.range.SortedRanges");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clear", argTypes, term79, args);
    }

};


