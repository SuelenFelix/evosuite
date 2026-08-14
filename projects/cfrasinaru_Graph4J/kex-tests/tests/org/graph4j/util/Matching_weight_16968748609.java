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
     Object term4557;

    public Matching_weight_16968748609() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4566 = new HashMap();
        Set<Object> term4579 =  ((Map) term4566).keySet();
        HashSet term4565 = new HashSet((Collection<? extends Object>) term4579);
        term4557 = newInstance(Class.forName("org.graph4j.util.Matching"));
        int[] term4558 = (int[]) newIntArray(5);
        setField(term4557, term4557.getClass(), "graph", null);
        setIntElement(term4558, 0, -1981494102);
        setIntElement(term4558, 1, -2064148945);
        setIntElement(term4558, 2, 494400151);
        setIntElement(term4558, 3, 1588058685);
        setIntElement(term4558, 4, 1677707412);
        setField(term4557, term4557.getClass(), "mates", term4558);
        setIntField(term4557, term4557.getClass(), "size", -297367861);
        setField(term4557, term4557.getClass(), "edges", term4565);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Matching");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "weight", argTypes, term4557, args);
    }

};


