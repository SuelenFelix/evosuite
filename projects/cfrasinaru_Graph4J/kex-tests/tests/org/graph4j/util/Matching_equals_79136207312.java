package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Matching_equals_79136207312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107455;
     Object term107465;

    public Matching_equals_79136207312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term107460 = new HashMap();
        Set<Object> term107467 =  ((Map) term107460).keySet();
        HashSet term107459 = new HashSet((Collection<? extends Object>) term107467);
        term107455 = newInstance(Class.forName("org.graph4j.util.Matching"));
        int[] term107456 = (int[]) newIntArray(1);
        setField(term107455, term107455.getClass(), "graph", null);
        setIntElement(term107456, 0, -723584432);
        setField(term107455, term107455.getClass(), "mates", term107456);
        setIntField(term107455, term107455.getClass(), "size", 878546155);
        setField(term107455, term107455.getClass(), "edges", term107459);
        term107465 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Matching");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term107465;
        callMethod(klass, "equals", argTypes, term107455, args);
    }

};


