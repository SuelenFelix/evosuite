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
     Object term107259;

    public Matching_size_7618144844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term107264 = new HashMap();
        Set<Object> term107270 =  ((Map) term107264).keySet();
        HashSet term107263 = new HashSet((Collection<? extends Object>) term107270);
        term107259 = newInstance(Class.forName("org.graph4j.util.Matching"));
        int[] term107260 = (int[]) newIntArray(1);
        setField(term107259, term107259.getClass(), "graph", null);
        setIntElement(term107260, 0, 488837209);
        setField(term107259, term107259.getClass(), "mates", term107260);
        setIntField(term107259, term107259.getClass(), "size", -1305788278);
        setField(term107259, term107259.getClass(), "edges", term107263);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Matching");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "size", argTypes, term107259, args);
    }

};


