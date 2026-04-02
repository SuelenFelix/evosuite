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

public class SortedRanges_getFirst_11872410651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public SortedRanges_getFirst_11872410651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.rtbhouse.kafka.workers.impl.range.SortedRanges"));
        Object term2 = newInstance(Class.forName("java.util.TreeSet"));
        Object term3 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term3, term3.getClass(), "comparator", null);
        setField(term3, term3.getClass(), "root", null);
        setIntField(term3, term3.getClass(), "size", 0);
        setIntField(term3, term3.getClass(), "modCount", 0);
        setField(term3, term3.getClass(), "entrySet", null);
        setField(term3, term3.getClass(), "navigableKeySet", null);
        setField(term3, term3.getClass(), "descendingMap", null);
        setField(term3, term3.getClass(), "keySet", null);
        setField(term3, term3.getClass(), "values", null);
        setField(term2, term2.getClass(), "m", term3);
        setField(term1, term1.getClass(), "ranges", term2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.range.SortedRanges");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirst", argTypes, term1, args);
    }

};


