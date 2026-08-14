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
import java.lang.Boolean;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class MaximalCardinalityMatching_getMatching_10326384783 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1182;

    public MaximalCardinalityMatching_getMatching_10326384783() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term1183 = new Boolean(false);
        HashMap term1192 = new HashMap();
        Set<Object> term1202 =  ((Map) term1192).keySet();
        HashSet term1191 = new HashSet((Collection<? extends Object>) term1202);
        term1182 = newInstance(Class.forName("org.graph4j.matching.MaximalCardinalityMatching"));
        Object term1185 = newInstance(Class.forName("org.graph4j.util.Matching"));
        int[] term1186 = (int[]) newIntArray(3);
        setField(term1182, term1182.getClass(), "random", term1183);
        setField(term1182, term1182.getClass(), "comparator", null);
        setField(term1185, term1185.getClass(), "graph", null);
        setIntElement(term1186, 0, -1724487863);
        setIntElement(term1186, 1, -128490829);
        setIntElement(term1186, 2, 202214133);
        setField(term1185, term1185.getClass(), "mates", term1186);
        setIntField(term1185, term1185.getClass(), "size", 1543091617);
        setField(term1185, term1185.getClass(), "edges", term1191);
        setField(term1182, term1182.getClass(), "matching", term1185);
        setField(term1182, term1182.getClass(), "graph", null);
        setBooleanField(term1182, term1182.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.matching.MaximalCardinalityMatching");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMatching", argTypes, term1182, args);
    }

};


