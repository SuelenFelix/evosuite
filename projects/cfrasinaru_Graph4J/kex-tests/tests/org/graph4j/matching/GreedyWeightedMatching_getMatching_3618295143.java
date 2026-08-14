package org.graph4j.matching;

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
import static org.graph4j.matching.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class GreedyWeightedMatching_getMatching_3618295143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1163;

    public GreedyWeightedMatching_getMatching_3618295143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1168 = new HashMap();
        Set<Object> term1175 =  ((Map) term1168).keySet();
        HashSet term1167 = new HashSet((Collection<? extends Object>) term1175);
        term1163 = newInstance(Class.forName("org.graph4j.matching.GreedyWeightedMatching"));
        Object term1164 = newInstance(Class.forName("org.graph4j.util.Matching"));
        int[] term1165 = (int[]) newIntArray(0);
        setField(term1163, term1163.getClass(), "comparator", null);
        setField(term1164, term1164.getClass(), "graph", null);
        setField(term1164, term1164.getClass(), "mates", term1165);
        setIntField(term1164, term1164.getClass(), "size", 1289741214);
        setField(term1164, term1164.getClass(), "edges", term1167);
        setField(term1163, term1163.getClass(), "matching", term1164);
        setField(term1163, term1163.getClass(), "graph", null);
        setBooleanField(term1163, term1163.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.matching.GreedyWeightedMatching");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMatching", argTypes, term1163, args);
    }

};


