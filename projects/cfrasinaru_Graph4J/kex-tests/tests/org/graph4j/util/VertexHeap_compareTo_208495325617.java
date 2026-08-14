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
     Object term717;
     Object term728;
     Object term730;

    public VertexHeap_compareTo_208495325617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term717 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term718 = (int[]) newIntArray(1);
        int[] term720 = (int[]) newIntArray(6);
        setField(term717, term717.getClass(), "graph", null);
        setField(term717, term717.getClass(), "comparator", null);
        setIntElement(term718, 0, 1270666529);
        setField(term717, term717.getClass(), "keys", term718);
        setIntElement(term720, 0, -1146679443);
        setIntElement(term720, 1, -860131894);
        setIntElement(term720, 2, -1022990421);
        setIntElement(term720, 3, 1045547089);
        setIntElement(term720, 4, -1122880881);
        setIntElement(term720, 5, -542712742);
        setField(term717, term717.getClass(), "positions", term720);
        setIntField(term717, term717.getClass(), "size", -1254072822);
        term728 = new Integer(-1111249833);
        term730 = new Integer(-1692331299);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term728;
        args[1] = term730;
        callMethod(klass, "compareTo", argTypes, term717, args);
    }

};


