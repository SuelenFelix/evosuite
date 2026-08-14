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

public class Matching_mate_9411543827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4510;
     Object term4525;

    public Matching_mate_9411543827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4520 = new HashMap();
        Set<Object> term4533 =  ((Map) term4520).keySet();
        HashSet term4519 = new HashSet((Collection<? extends Object>) term4533);
        term4510 = newInstance(Class.forName("org.graph4j.util.Matching"));
        int[] term4511 = (int[]) newIntArray(6);
        setField(term4510, term4510.getClass(), "graph", null);
        setIntElement(term4511, 0, -845551243);
        setIntElement(term4511, 1, 370671198);
        setIntElement(term4511, 2, 1426800646);
        setIntElement(term4511, 3, 954234820);
        setIntElement(term4511, 4, 1047346538);
        setIntElement(term4511, 5, 728436340);
        setField(term4510, term4510.getClass(), "mates", term4511);
        setIntField(term4510, term4510.getClass(), "size", 1841731593);
        setField(term4510, term4510.getClass(), "edges", term4519);
        term4525 = new Integer(-1854929057);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Matching");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4525;
        callMethod(klass, "mate", argTypes, term4510, args);
    }

};


