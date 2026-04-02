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

public class SortedRanges_getMinExistingElement_15360876944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16;

    public SortedRanges_getMinExistingElement_15360876944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16 = newInstance(Class.forName("com.rtbhouse.kafka.workers.impl.range.SortedRanges"));
        Object term17 = newInstance(Class.forName("java.util.TreeSet"));
        Object term18 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term18, term18.getClass(), "comparator", null);
        setField(term18, term18.getClass(), "root", null);
        setIntField(term18, term18.getClass(), "size", 0);
        setIntField(term18, term18.getClass(), "modCount", 0);
        setField(term18, term18.getClass(), "entrySet", null);
        setField(term18, term18.getClass(), "navigableKeySet", null);
        setField(term18, term18.getClass(), "descendingMap", null);
        setField(term18, term18.getClass(), "keySet", null);
        setField(term18, term18.getClass(), "values", null);
        setField(term17, term17.getClass(), "m", term18);
        setField(term16, term16.getClass(), "ranges", term17);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.range.SortedRanges");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.rtbhouse.kafka.workers.impl.range.ClosedRange");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getMinExistingElement", argTypes, term16, args);
    }

};


