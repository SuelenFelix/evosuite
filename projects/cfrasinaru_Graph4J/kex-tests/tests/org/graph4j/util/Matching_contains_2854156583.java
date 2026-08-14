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
import java.lang.Integer;

public class Matching_contains_2854156583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4374;
     Object term4399;
     Object term4401;

    public Matching_contains_2854156583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4387 = new HashMap();
        Set<Object> term4412 =  ((Map) term4387).keySet();
        HashSet term4386 = new HashSet((Collection<? extends Object>) term4412);
        term4374 = newInstance(Class.forName("org.graph4j.util.Matching"));
        int[] term4375 = (int[]) newIntArray(9);
        setField(term4374, term4374.getClass(), "graph", null);
        setIntElement(term4375, 0, 385297023);
        setIntElement(term4375, 1, -134092543);
        setIntElement(term4375, 2, -1703642288);
        setIntElement(term4375, 3, 2075139747);
        setIntElement(term4375, 4, 2092881418);
        setIntElement(term4375, 5, 1732410866);
        setIntElement(term4375, 6, 1084102599);
        setIntElement(term4375, 7, -1743503755);
        setIntElement(term4375, 8, 1641342112);
        setField(term4374, term4374.getClass(), "mates", term4375);
        setIntField(term4374, term4374.getClass(), "size", -1551790945);
        setField(term4374, term4374.getClass(), "edges", term4386);
        term4399 = new Integer(638046409);
        term4401 = new Integer(427274898);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Matching");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4399;
        args[1] = term4401;
        callMethod(klass, "contains", argTypes, term4374, args);
    }

};


