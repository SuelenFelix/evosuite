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
     Object term4312;
     Object term4338;
     Object term4340;

    public Matching_add_2328173881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4320 = new HashMap();
        Set<Object> term4346 =  ((Map) term4320).keySet();
        HashSet term4319 = new HashSet((Collection<? extends Object>) term4346);
        term4312 = newInstance(Class.forName("org.graph4j.util.Matching"));
        int[] term4313 = (int[]) newIntArray(4);
        setField(term4312, term4312.getClass(), "graph", null);
        setIntElement(term4313, 0, 318982923);
        setIntElement(term4313, 1, -154210001);
        setIntElement(term4313, 2, 621910137);
        setIntElement(term4313, 3, 241533020);
        setField(term4312, term4312.getClass(), "mates", term4313);
        setIntField(term4312, term4312.getClass(), "size", 2081679151);
        setField(term4312, term4312.getClass(), "edges", term4319);
        term4338 = new Integer(-529831900);
        term4340 = new Integer(1574493440);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Matching");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4338;
        args[1] = term4340;
        callMethod(klass, "add", argTypes, term4312, args);
    }

};


