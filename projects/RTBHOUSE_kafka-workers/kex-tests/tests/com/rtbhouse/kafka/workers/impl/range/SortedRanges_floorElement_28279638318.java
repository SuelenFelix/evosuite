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

public class SortedRanges_floorElement_28279638318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84;
     Object term89;

    public SortedRanges_floorElement_28279638318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84 = newInstance(Class.forName("com.rtbhouse.kafka.workers.impl.range.SortedRanges"));
        Object term85 = newInstance(Class.forName("java.util.TreeSet"));
        Object term86 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term86, term86.getClass(), "comparator", null);
        setField(term86, term86.getClass(), "root", null);
        setIntField(term86, term86.getClass(), "size", 0);
        setIntField(term86, term86.getClass(), "modCount", 0);
        setField(term86, term86.getClass(), "entrySet", null);
        setField(term86, term86.getClass(), "navigableKeySet", null);
        setField(term86, term86.getClass(), "descendingMap", null);
        setField(term86, term86.getClass(), "keySet", null);
        setField(term86, term86.getClass(), "values", null);
        setField(term85, term85.getClass(), "m", term86);
        setField(term84, term84.getClass(), "ranges", term85);
        term89 = new Long(5270370404989704783L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.range.SortedRanges");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term89;
        callMethod(klass, "floorElement", argTypes, term84, args);
    }

};


