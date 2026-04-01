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

public class Matching_isPerfect_17899809428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107358;

    public Matching_isPerfect_17899809428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term107362 = new HashMap();
        Set<Object> term107380 =  ((Map) term107362).keySet();
        HashSet term107361 = new HashSet((Collection<? extends Object>) term107380);
        term107358 = newInstance(Class.forName("org.graph4j.util.Matching"));
        int[] term107359 = (int[]) newIntArray(0);
        setField(term107358, term107358.getClass(), "graph", null);
        setField(term107358, term107358.getClass(), "mates", term107359);
        setIntField(term107358, term107358.getClass(), "size", 889022648);
        setField(term107358, term107358.getClass(), "edges", term107361);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Matching");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPerfect", argTypes, term107358, args);
    }

};


