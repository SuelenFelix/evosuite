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

public class Matching_isValid_20843552310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107414;

    public Matching_isValid_20843552310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term107420 = new HashMap();
        Set<Object> term107436 =  ((Map) term107420).keySet();
        HashSet term107419 = new HashSet((Collection<? extends Object>) term107436);
        term107414 = newInstance(Class.forName("org.graph4j.util.Matching"));
        int[] term107415 = (int[]) newIntArray(2);
        setField(term107414, term107414.getClass(), "graph", null);
        setIntElement(term107415, 0, 1141181858);
        setIntElement(term107415, 1, 936701005);
        setField(term107414, term107414.getClass(), "mates", term107415);
        setIntField(term107414, term107414.getClass(), "size", -1415304789);
        setField(term107414, term107414.getClass(), "edges", term107419);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Matching");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isValid", argTypes, term107414, args);
    }

};


