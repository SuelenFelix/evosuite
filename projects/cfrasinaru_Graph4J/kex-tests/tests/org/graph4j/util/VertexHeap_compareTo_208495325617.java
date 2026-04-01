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

public class VertexHeap_compareTo_208495325617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60308;
     Object term60318;
     Object term60320;

    public VertexHeap_compareTo_208495325617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60308 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term60309 = (int[]) newIntArray(3);
        int[] term60313 = (int[]) newIntArray(3);
        setField(term60308, term60308.getClass(), "graph", null);
        setField(term60308, term60308.getClass(), "comparator", null);
        setIntElement(term60309, 0, -692367029);
        setIntElement(term60309, 1, 1212696537);
        setIntElement(term60309, 2, 1781872751);
        setField(term60308, term60308.getClass(), "keys", term60309);
        setIntElement(term60313, 0, -1949151824);
        setIntElement(term60313, 1, 120099411);
        setIntElement(term60313, 2, -1103544663);
        setField(term60308, term60308.getClass(), "positions", term60313);
        setIntField(term60308, term60308.getClass(), "size", 113634266);
        term60318 = new Integer(510970949);
        term60320 = new Integer(1646304251);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term60318;
        args[1] = term60320;
        callMethod(klass, "compareTo", argTypes, term60308, args);
    }

};


