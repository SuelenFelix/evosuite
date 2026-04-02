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

public class SortedRanges_iterator_5095495477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34;

    public SortedRanges_iterator_5095495477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34 = newInstance(Class.forName("com.rtbhouse.kafka.workers.impl.range.SortedRanges"));
        Object term35 = newInstance(Class.forName("java.util.TreeSet"));
        Object term36 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term36, term36.getClass(), "comparator", null);
        setField(term36, term36.getClass(), "root", null);
        setIntField(term36, term36.getClass(), "size", 0);
        setIntField(term36, term36.getClass(), "modCount", 0);
        setField(term36, term36.getClass(), "entrySet", null);
        setField(term36, term36.getClass(), "navigableKeySet", null);
        setField(term36, term36.getClass(), "descendingMap", null);
        setField(term36, term36.getClass(), "keySet", null);
        setField(term36, term36.getClass(), "values", null);
        setField(term35, term35.getClass(), "m", term36);
        setField(term34, term34.getClass(), "ranges", term35);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.range.SortedRanges");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "iterator", argTypes, term34, args);
    }

};


