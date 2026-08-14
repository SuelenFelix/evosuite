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

public class Matching_edges_6459532455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4440;

    public Matching_edges_6459532455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4449 = new HashMap();
        Set<Object> term4464 =  ((Map) term4449).keySet();
        HashSet term4448 = new HashSet((Collection<? extends Object>) term4464);
        term4440 = newInstance(Class.forName("org.graph4j.util.Matching"));
        int[] term4441 = (int[]) newIntArray(5);
        setField(term4440, term4440.getClass(), "graph", null);
        setIntElement(term4441, 0, -945759470);
        setIntElement(term4441, 1, 657342039);
        setIntElement(term4441, 2, 1483999606);
        setIntElement(term4441, 3, 1871761182);
        setIntElement(term4441, 4, 233983728);
        setField(term4440, term4440.getClass(), "mates", term4441);
        setIntField(term4440, term4440.getClass(), "size", -1650132476);
        setField(term4440, term4440.getClass(), "edges", term4448);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Matching");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "edges", argTypes, term4440, args);
    }

};


