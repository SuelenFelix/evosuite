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

public class Matching_add_2328173881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107162;
     Object term107186;
     Object term107188;

    public Matching_add_2328173881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term107166 = new HashMap();
        Set<Object> term107190 =  ((Map) term107166).keySet();
        HashSet term107165 = new HashSet((Collection<? extends Object>) term107190);
        term107162 = newInstance(Class.forName("org.graph4j.util.Matching"));
        int[] term107163 = (int[]) newIntArray(0);
        setField(term107162, term107162.getClass(), "graph", null);
        setField(term107162, term107162.getClass(), "mates", term107163);
        setIntField(term107162, term107162.getClass(), "size", -572528273);
        setField(term107162, term107162.getClass(), "edges", term107165);
        term107186 = new Integer(-1975388787);
        term107188 = new Integer(-2072603449);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Matching");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term107186;
        args[1] = term107188;
        callMethod(klass, "add", argTypes, term107162, args);
    }

};


