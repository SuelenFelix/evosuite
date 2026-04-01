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
     Object term70824;

    public VertexHeap_VertexHeapIterator_init_20044775950() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70824 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term70825 = (int[]) newIntArray(2);
        int[] term70828 = (int[]) newIntArray(6);
        setField(term70824, term70824.getClass(), "graph", null);
        setField(term70824, term70824.getClass(), "comparator", null);
        setIntElement(term70825, 0, 1381817068);
        setIntElement(term70825, 1, -1332097447);
        setField(term70824, term70824.getClass(), "keys", term70825);
        setIntElement(term70828, 0, 453720647);
        setIntElement(term70828, 1, 732312504);
        setIntElement(term70828, 2, -883503334);
        setIntElement(term70828, 3, -1620662863);
        setIntElement(term70828, 4, -176182914);
        setIntElement(term70828, 5, -623380087);
        setField(term70824, term70824.getClass(), "positions", term70828);
        setIntField(term70824, term70824.getClass(), "size", 1503970273);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap$VertexHeapIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexHeap");
        Object[] args = new Object[1];
        args[0] = term70824;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


