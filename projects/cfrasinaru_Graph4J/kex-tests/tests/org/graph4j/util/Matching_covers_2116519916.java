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
     Object term4465;
     Object term4499;

    public Matching_covers_2116519916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4477 = new HashMap();
        Set<Object> term4509 =  ((Map) term4477).keySet();
        HashSet term4476 = new HashSet((Collection<? extends Object>) term4509);
        term4465 = newInstance(Class.forName("org.graph4j.util.Matching"));
        int[] term4466 = (int[]) newIntArray(8);
        setField(term4465, term4465.getClass(), "graph", null);
        setIntElement(term4466, 0, -1382661134);
        setIntElement(term4466, 1, -1042022818);
        setIntElement(term4466, 2, 317372051);
        setIntElement(term4466, 3, 892170444);
        setIntElement(term4466, 4, -82417507);
        setIntElement(term4466, 5, -511400358);
        setIntElement(term4466, 6, -742178468);
        setIntElement(term4466, 7, 694989162);
        setField(term4465, term4465.getClass(), "mates", term4466);
        setIntField(term4465, term4465.getClass(), "size", -65504209);
        setField(term4465, term4465.getClass(), "edges", term4476);
        term4499 = new Integer(-826239685);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Matching");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4499;
        callMethod(klass, "covers", argTypes, term4465, args);
    }

};


