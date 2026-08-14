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

public class Matching_size_7618144844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4413;

    public Matching_size_7618144844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4424 = new HashMap();
        Set<Object> term4439 =  ((Map) term4424).keySet();
        HashSet term4423 = new HashSet((Collection<? extends Object>) term4439);
        term4413 = newInstance(Class.forName("org.graph4j.util.Matching"));
        int[] term4414 = (int[]) newIntArray(7);
        setField(term4413, term4413.getClass(), "graph", null);
        setIntElement(term4414, 0, -1654552020);
        setIntElement(term4414, 1, -1049546692);
        setIntElement(term4414, 2, 1397781598);
        setIntElement(term4414, 3, -44720365);
        setIntElement(term4414, 4, 1963632911);
        setIntElement(term4414, 5, -1100497683);
        setIntElement(term4414, 6, 155423433);
        setField(term4413, term4413.getClass(), "mates", term4414);
        setIntField(term4413, term4413.getClass(), "size", -815471632);
        setField(term4413, term4413.getClass(), "edges", term4423);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Matching");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "size", argTypes, term4413, args);
    }

};


