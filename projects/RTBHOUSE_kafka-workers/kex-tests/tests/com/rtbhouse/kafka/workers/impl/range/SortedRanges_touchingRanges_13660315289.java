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

public class SortedRanges_touchingRanges_13660315289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44;

    public SortedRanges_touchingRanges_13660315289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44 = newInstance(Class.forName("com.rtbhouse.kafka.workers.impl.range.SortedRanges"));
        Object term45 = newInstance(Class.forName("java.util.TreeSet"));
        Object term46 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term46, term46.getClass(), "comparator", null);
        setField(term46, term46.getClass(), "root", null);
        setIntField(term46, term46.getClass(), "size", 0);
        setIntField(term46, term46.getClass(), "modCount", 0);
        setField(term46, term46.getClass(), "entrySet", null);
        setField(term46, term46.getClass(), "navigableKeySet", null);
        setField(term46, term46.getClass(), "descendingMap", null);
        setField(term46, term46.getClass(), "keySet", null);
        setField(term46, term46.getClass(), "values", null);
        setField(term45, term45.getClass(), "m", term46);
        setField(term44, term44.getClass(), "ranges", term45);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.range.SortedRanges");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.rtbhouse.kafka.workers.impl.range.ClosedRange");
        argTypes[1] = Class.forName("com.rtbhouse.kafka.workers.impl.range.ClosedRange");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "touchingRanges", argTypes, term44, args);
    }

};


