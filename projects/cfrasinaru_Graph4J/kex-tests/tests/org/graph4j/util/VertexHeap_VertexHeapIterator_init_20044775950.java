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

public class VertexHeap_VertexHeapIterator_init_20044775950 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2682;

    public VertexHeap_VertexHeapIterator_init_20044775950() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2682 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term2683 = (int[]) newIntArray(8);
        int[] term2692 = (int[]) newIntArray(9);
        setField(term2682, term2682.getClass(), "graph", null);
        setField(term2682, term2682.getClass(), "comparator", null);
        setIntElement(term2683, 0, 1902784843);
        setIntElement(term2683, 1, 2021136615);
        setIntElement(term2683, 2, 1778570695);
        setIntElement(term2683, 3, -1142164411);
        setIntElement(term2683, 4, -1619435313);
        setIntElement(term2683, 5, 1013801066);
        setIntElement(term2683, 6, 1512541853);
        setIntElement(term2683, 7, -965421502);
        setField(term2682, term2682.getClass(), "keys", term2683);
        setIntElement(term2692, 0, 1319026002);
        setIntElement(term2692, 1, -1368173231);
        setIntElement(term2692, 2, 1956006038);
        setIntElement(term2692, 3, -1062304878);
        setIntElement(term2692, 4, -1377876610);
        setIntElement(term2692, 5, -1456184732);
        setIntElement(term2692, 6, 1689228897);
        setIntElement(term2692, 7, 892205855);
        setIntElement(term2692, 8, 1955560079);
        setField(term2682, term2682.getClass(), "positions", term2692);
        setIntField(term2682, term2682.getClass(), "size", -1330529019);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap$VertexHeapIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexHeap");
        Object[] args = new Object[1];
        args[0] = term2682;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


