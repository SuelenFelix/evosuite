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

public class SortedRanges_add_18943249628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39;

    public SortedRanges_add_18943249628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39 = newInstance(Class.forName("com.rtbhouse.kafka.workers.impl.range.SortedRanges"));
        Object term40 = newInstance(Class.forName("java.util.TreeSet"));
        Object term41 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term41, term41.getClass(), "comparator", null);
        setField(term41, term41.getClass(), "root", null);
        setIntField(term41, term41.getClass(), "size", 0);
        setIntField(term41, term41.getClass(), "modCount", 0);
        setField(term41, term41.getClass(), "entrySet", null);
        setField(term41, term41.getClass(), "navigableKeySet", null);
        setField(term41, term41.getClass(), "descendingMap", null);
        setField(term41, term41.getClass(), "keySet", null);
        setField(term41, term41.getClass(), "values", null);
        setField(term40, term40.getClass(), "m", term41);
        setField(term39, term39.getClass(), "ranges", term40);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.range.SortedRanges");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.rtbhouse.kafka.workers.impl.range.ClosedRange");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "add", argTypes, term39, args);
    }

};


