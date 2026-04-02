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

public class SortedRanges_removeElementsLowerOrEqual_119310961613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69;
     Object term74;

    public SortedRanges_removeElementsLowerOrEqual_119310961613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69 = newInstance(Class.forName("com.rtbhouse.kafka.workers.impl.range.SortedRanges"));
        Object term70 = newInstance(Class.forName("java.util.TreeSet"));
        Object term71 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term71, term71.getClass(), "comparator", null);
        setField(term71, term71.getClass(), "root", null);
        setIntField(term71, term71.getClass(), "size", 0);
        setIntField(term71, term71.getClass(), "modCount", 0);
        setField(term71, term71.getClass(), "entrySet", null);
        setField(term71, term71.getClass(), "navigableKeySet", null);
        setField(term71, term71.getClass(), "descendingMap", null);
        setField(term71, term71.getClass(), "keySet", null);
        setField(term71, term71.getClass(), "values", null);
        setField(term70, term70.getClass(), "m", term71);
        setField(term69, term69.getClass(), "ranges", term70);
        term74 = new Long(-8400487765614892086L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.range.SortedRanges");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term74;
        callMethod(klass, "removeElementsLowerOrEqual", argTypes, term69, args);
    }

};


