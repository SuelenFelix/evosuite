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
     Object term4648;
     Object term4663;

    public Matching_equals_79136207312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4658 = new HashMap();
        Set<Object> term4670 =  ((Map) term4658).keySet();
        HashSet term4657 = new HashSet((Collection<? extends Object>) term4670);
        term4648 = newInstance(Class.forName("org.graph4j.util.Matching"));
        int[] term4649 = (int[]) newIntArray(6);
        setField(term4648, term4648.getClass(), "graph", null);
        setIntElement(term4649, 0, 1086383182);
        setIntElement(term4649, 1, 1425319286);
        setIntElement(term4649, 2, 1729919228);
        setIntElement(term4649, 3, 872351195);
        setIntElement(term4649, 4, -1664328399);
        setIntElement(term4649, 5, 1422430512);
        setField(term4648, term4648.getClass(), "mates", term4649);
        setIntField(term4648, term4648.getClass(), "size", 1796581482);
        setField(term4648, term4648.getClass(), "edges", term4657);
        term4663 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Matching");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4663;
        callMethod(klass, "equals", argTypes, term4648, args);
    }

};


