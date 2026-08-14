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
import java.lang.Object;
import java.lang.Integer;

public class EdgeArray_indexOf_8295956458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1336;
     Object term1345;
     Object term1347;

    public EdgeArray_indexOf_8295956458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1336 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term1337 = (Object[]) newArray("[I", 1);
        int[] term1338 = (int[]) newIntArray(5);
        setField(term1336, term1336.getClass(), "graph", null);
        setIntElement(term1338, 0, -19246901);
        setIntElement(term1338, 1, -370828664);
        setIntElement(term1338, 2, 1168633950);
        setIntElement(term1338, 3, 1607082164);
        setIntElement(term1338, 4, 1890399366);
        setElement(term1337, 0, term1338);
        setField(term1336, term1336.getClass(), "edges", term1337);
        setIntField(term1336, term1336.getClass(), "numEdges", -1867239125);
        term1345 = new Integer(952869601);
        term1347 = new Integer(91958879);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1345;
        args[1] = term1347;
        callMethod(klass, "indexOf", argTypes, term1336, args);
    }

};


