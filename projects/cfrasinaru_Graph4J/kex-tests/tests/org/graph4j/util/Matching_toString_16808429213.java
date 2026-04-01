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
     Object term107468;

    public Matching_toString_16808429213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term107473 = new HashMap();
        Set<Object> term107494 =  ((Map) term107473).keySet();
        HashSet term107472 = new HashSet((Collection<? extends Object>) term107494);
        term107468 = newInstance(Class.forName("org.graph4j.util.Matching"));
        int[] term107469 = (int[]) newIntArray(1);
        setField(term107468, term107468.getClass(), "graph", null);
        setIntElement(term107469, 0, -390900435);
        setField(term107468, term107468.getClass(), "mates", term107469);
        setIntField(term107468, term107468.getClass(), "size", 334696447);
        setField(term107468, term107468.getClass(), "edges", term107472);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Matching");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term107468, args);
    }

};


