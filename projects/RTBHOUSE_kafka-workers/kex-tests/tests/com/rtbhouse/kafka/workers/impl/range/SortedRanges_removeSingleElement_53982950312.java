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

public class SortedRanges_removeSingleElement_53982950312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62;
     Object term67;

    public SortedRanges_removeSingleElement_53982950312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62 = newInstance(Class.forName("com.rtbhouse.kafka.workers.impl.range.SortedRanges"));
        Object term63 = newInstance(Class.forName("java.util.TreeSet"));
        Object term64 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term64, term64.getClass(), "comparator", null);
        setField(term64, term64.getClass(), "root", null);
        setIntField(term64, term64.getClass(), "size", 0);
        setIntField(term64, term64.getClass(), "modCount", 0);
        setField(term64, term64.getClass(), "entrySet", null);
        setField(term64, term64.getClass(), "navigableKeySet", null);
        setField(term64, term64.getClass(), "descendingMap", null);
        setField(term64, term64.getClass(), "keySet", null);
        setField(term64, term64.getClass(), "values", null);
        setField(term63, term63.getClass(), "m", term64);
        setField(term62, term62.getClass(), "ranges", term63);
        term67 = new Long(-8257434502486459194L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.range.SortedRanges");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term67;
        callMethod(klass, "removeSingleElement", argTypes, term62, args);
    }

};


