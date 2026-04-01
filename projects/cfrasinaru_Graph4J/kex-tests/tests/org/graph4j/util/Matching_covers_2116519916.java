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

public class Matching_covers_2116519916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107296;
     Object term107322;

    public Matching_covers_2116519916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term107304 = new HashMap();
        Set<Object> term107328 =  ((Map) term107304).keySet();
        HashSet term107303 = new HashSet((Collection<? extends Object>) term107328);
        term107296 = newInstance(Class.forName("org.graph4j.util.Matching"));
        int[] term107297 = (int[]) newIntArray(4);
        setField(term107296, term107296.getClass(), "graph", null);
        setIntElement(term107297, 0, 1651913796);
        setIntElement(term107297, 1, -935670376);
        setIntElement(term107297, 2, -1321941334);
        setIntElement(term107297, 3, -2072279811);
        setField(term107296, term107296.getClass(), "mates", term107297);
        setIntField(term107296, term107296.getClass(), "size", 424420422);
        setField(term107296, term107296.getClass(), "edges", term107303);
        term107322 = new Integer(-1146173809);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Matching");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term107322;
        callMethod(klass, "covers", argTypes, term107296, args);
    }

};


