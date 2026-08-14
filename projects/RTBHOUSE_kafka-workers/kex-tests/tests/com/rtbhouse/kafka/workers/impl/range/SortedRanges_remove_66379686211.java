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

public class SortedRanges_remove_66379686211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56;
     Object term61;

    public SortedRanges_remove_66379686211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56 = newInstance(Class.forName("com.rtbhouse.kafka.workers.impl.range.SortedRanges"));
        Object term57 = newInstance(Class.forName("java.util.TreeSet"));
        Object term58 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term58, term58.getClass(), "comparator", null);
        setField(term58, term58.getClass(), "root", null);
        setIntField(term58, term58.getClass(), "size", 0);
        setIntField(term58, term58.getClass(), "modCount", 0);
        setField(term58, term58.getClass(), "entrySet", null);
        setField(term58, term58.getClass(), "navigableKeySet", null);
        setField(term58, term58.getClass(), "descendingMap", null);
        setField(term58, term58.getClass(), "keySet", null);
        setField(term58, term58.getClass(), "values", null);
        setField(term57, term57.getClass(), "m", term58);
        setField(term56, term56.getClass(), "ranges", term57);
        term61 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.range.SortedRanges");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term61;
        callMethod(klass, "remove", argTypes, term56, args);
    }

};


