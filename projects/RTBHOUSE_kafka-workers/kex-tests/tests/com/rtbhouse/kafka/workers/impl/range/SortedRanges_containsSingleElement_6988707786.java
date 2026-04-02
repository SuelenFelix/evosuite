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

public class SortedRanges_containsSingleElement_6988707786 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27;
     Object term32;

    public SortedRanges_containsSingleElement_6988707786() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27 = newInstance(Class.forName("com.rtbhouse.kafka.workers.impl.range.SortedRanges"));
        Object term28 = newInstance(Class.forName("java.util.TreeSet"));
        Object term29 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term29, term29.getClass(), "comparator", null);
        setField(term29, term29.getClass(), "root", null);
        setIntField(term29, term29.getClass(), "size", 0);
        setIntField(term29, term29.getClass(), "modCount", 0);
        setField(term29, term29.getClass(), "entrySet", null);
        setField(term29, term29.getClass(), "navigableKeySet", null);
        setField(term29, term29.getClass(), "descendingMap", null);
        setField(term29, term29.getClass(), "keySet", null);
        setField(term29, term29.getClass(), "values", null);
        setField(term28, term28.getClass(), "m", term29);
        setField(term27, term27.getClass(), "ranges", term28);
        term32 = new Long(2442117782898005296L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.range.SortedRanges");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term32;
        callMethod(klass, "containsSingleElement", argTypes, term27, args);
    }

};


