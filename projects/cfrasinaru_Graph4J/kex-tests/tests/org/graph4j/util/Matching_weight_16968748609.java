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

public class Matching_weight_16968748609 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107381;

    public Matching_weight_16968748609() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term107390 = new HashMap();
        Set<Object> term107413 =  ((Map) term107390).keySet();
        HashSet term107389 = new HashSet((Collection<? extends Object>) term107413);
        term107381 = newInstance(Class.forName("org.graph4j.util.Matching"));
        int[] term107382 = (int[]) newIntArray(5);
        setField(term107381, term107381.getClass(), "graph", null);
        setIntElement(term107382, 0, 27470179);
        setIntElement(term107382, 1, 809443159);
        setIntElement(term107382, 2, 1889731371);
        setIntElement(term107382, 3, 576807184);
        setIntElement(term107382, 4, -931635900);
        setField(term107381, term107381.getClass(), "mates", term107382);
        setIntField(term107381, term107381.getClass(), "size", 1716832300);
        setField(term107381, term107381.getClass(), "edges", term107389);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Matching");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "weight", argTypes, term107381, args);
    }

};


