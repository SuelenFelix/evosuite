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
import java.lang.Integer;

public class UnionFind_getParent_846341605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3420;
     Object term3433;

    public UnionFind_getParent_846341605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3420 = newInstance(Class.forName("org.graph4j.util.UnionFind"));
        int[] term3423 = (int[]) newIntArray(8);
        setIntField(term3420, term3420.getClass(), "numVertices", -1592307668);
        setBooleanField(term3420, term3420.getClass(), "pathCompression", true);
        setIntElement(term3423, 0, -203832871);
        setIntElement(term3423, 1, 1151963130);
        setIntElement(term3423, 2, -1855819749);
        setIntElement(term3423, 3, 1059048043);
        setIntElement(term3423, 4, 537273345);
        setIntElement(term3423, 5, -346107257);
        setIntElement(term3423, 6, -1577393360);
        setIntElement(term3423, 7, 1112256038);
        setField(term3420, term3420.getClass(), "parent", term3423);
        setIntField(term3420, term3420.getClass(), "numSets", -441333794);
        term3433 = new Integer(1504698817);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.UnionFind");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3433;
        callMethod(klass, "getParent", argTypes, term3420, args);
    }

};


