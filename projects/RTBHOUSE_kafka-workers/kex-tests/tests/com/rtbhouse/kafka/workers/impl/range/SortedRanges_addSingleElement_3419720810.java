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
import java.lang.Long;

public class SortedRanges_addSingleElement_3419720810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49;
     Object term54;

    public SortedRanges_addSingleElement_3419720810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49 = newInstance(Class.forName("com.rtbhouse.kafka.workers.impl.range.SortedRanges"));
        Object term50 = newInstance(Class.forName("java.util.TreeSet"));
        Object term51 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term51, term51.getClass(), "comparator", null);
        setField(term51, term51.getClass(), "root", null);
        setIntField(term51, term51.getClass(), "size", 0);
        setIntField(term51, term51.getClass(), "modCount", 0);
        setField(term51, term51.getClass(), "entrySet", null);
        setField(term51, term51.getClass(), "navigableKeySet", null);
        setField(term51, term51.getClass(), "descendingMap", null);
        setField(term51, term51.getClass(), "keySet", null);
        setField(term51, term51.getClass(), "values", null);
        setField(term50, term50.getClass(), "m", term51);
        setField(term49, term49.getClass(), "ranges", term50);
        term54 = new Long(6375119433582206027L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.range.SortedRanges");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term54;
        callMethod(klass, "addSingleElement", argTypes, term49, args);
    }

};


