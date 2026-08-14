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

public class EdgeArray_edges_19122328167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1311;

    public EdgeArray_edges_19122328167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1311 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term1312 = (Object[]) newArray("[I", 4);
        int[] term1313 = (int[]) newIntArray(2);
        int[] term1316 = (int[]) newIntArray(2);
        int[] term1319 = (int[]) newIntArray(5);
        int[] term1325 = (int[]) newIntArray(0);
        setField(term1311, term1311.getClass(), "graph", null);
        setIntElement(term1313, 0, -1455526612);
        setIntElement(term1313, 1, -941356098);
        setElement(term1312, 0, term1313);
        setIntElement(term1316, 0, -201517446);
        setIntElement(term1316, 1, -97742366);
        setElement(term1312, 1, term1316);
        setIntElement(term1319, 0, 1638851942);
        setIntElement(term1319, 1, 1374790203);
        setIntElement(term1319, 2, 1160010161);
        setIntElement(term1319, 3, -423900705);
        setIntElement(term1319, 4, -525570815);
        setElement(term1312, 2, term1319);
        setElement(term1312, 3, term1325);
        setField(term1311, term1311.getClass(), "edges", term1312);
        setIntField(term1311, term1311.getClass(), "numEdges", 754055848);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "edges", argTypes, term1311, args);
    }

};


