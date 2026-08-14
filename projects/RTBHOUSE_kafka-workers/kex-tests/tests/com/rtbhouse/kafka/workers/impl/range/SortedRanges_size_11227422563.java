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

public class SortedRanges_size_11227422563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11;

    public SortedRanges_size_11227422563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11 = newInstance(Class.forName("com.rtbhouse.kafka.workers.impl.range.SortedRanges"));
        Object term12 = newInstance(Class.forName("java.util.TreeSet"));
        Object term13 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term13, term13.getClass(), "comparator", null);
        setField(term13, term13.getClass(), "root", null);
        setIntField(term13, term13.getClass(), "size", 0);
        setIntField(term13, term13.getClass(), "modCount", 0);
        setField(term13, term13.getClass(), "entrySet", null);
        setField(term13, term13.getClass(), "navigableKeySet", null);
        setField(term13, term13.getClass(), "descendingMap", null);
        setField(term13, term13.getClass(), "keySet", null);
        setField(term13, term13.getClass(), "values", null);
        setField(term12, term12.getClass(), "m", term13);
        setField(term11, term11.getClass(), "ranges", term12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.range.SortedRanges");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "size", argTypes, term11, args);
    }

};


