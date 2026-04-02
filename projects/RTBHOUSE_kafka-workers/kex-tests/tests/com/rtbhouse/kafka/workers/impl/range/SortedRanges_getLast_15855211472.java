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

public class SortedRanges_getLast_15855211472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6;

    public SortedRanges_getLast_15855211472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6 = newInstance(Class.forName("com.rtbhouse.kafka.workers.impl.range.SortedRanges"));
        Object term7 = newInstance(Class.forName("java.util.TreeSet"));
        Object term8 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term8, term8.getClass(), "comparator", null);
        setField(term8, term8.getClass(), "root", null);
        setIntField(term8, term8.getClass(), "size", 0);
        setIntField(term8, term8.getClass(), "modCount", 0);
        setField(term8, term8.getClass(), "entrySet", null);
        setField(term8, term8.getClass(), "navigableKeySet", null);
        setField(term8, term8.getClass(), "descendingMap", null);
        setField(term8, term8.getClass(), "keySet", null);
        setField(term8, term8.getClass(), "values", null);
        setField(term7, term7.getClass(), "m", term8);
        setField(term6, term6.getClass(), "ranges", term7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.range.SortedRanges");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLast", argTypes, term6, args);
    }

};


