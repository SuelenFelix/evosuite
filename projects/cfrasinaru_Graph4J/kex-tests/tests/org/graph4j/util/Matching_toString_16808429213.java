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

public class Matching_toString_16808429213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4671;

    public Matching_toString_16808429213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4678 = new HashMap();
        Set<Object> term4695 =  ((Map) term4678).keySet();
        HashSet term4677 = new HashSet((Collection<? extends Object>) term4695);
        term4671 = newInstance(Class.forName("org.graph4j.util.Matching"));
        int[] term4672 = (int[]) newIntArray(3);
        setField(term4671, term4671.getClass(), "graph", null);
        setIntElement(term4672, 0, 1286440081);
        setIntElement(term4672, 1, -928538452);
        setIntElement(term4672, 2, -1313207353);
        setField(term4671, term4671.getClass(), "mates", term4672);
        setIntField(term4671, term4671.getClass(), "size", 402612318);
        setField(term4671, term4671.getClass(), "edges", term4677);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Matching");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4671, args);
    }

};


