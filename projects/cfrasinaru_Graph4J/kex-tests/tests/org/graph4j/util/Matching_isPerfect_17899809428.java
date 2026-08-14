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
     Object term4534;

    public Matching_isPerfect_17899809428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4538 = new HashMap();
        Set<Object> term4556 =  ((Map) term4538).keySet();
        HashSet term4537 = new HashSet((Collection<? extends Object>) term4556);
        term4534 = newInstance(Class.forName("org.graph4j.util.Matching"));
        int[] term4535 = (int[]) newIntArray(0);
        setField(term4534, term4534.getClass(), "graph", null);
        setField(term4534, term4534.getClass(), "mates", term4535);
        setIntField(term4534, term4534.getClass(), "size", 1703814701);
        setField(term4534, term4534.getClass(), "edges", term4537);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Matching");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPerfect", argTypes, term4534, args);
    }

};


