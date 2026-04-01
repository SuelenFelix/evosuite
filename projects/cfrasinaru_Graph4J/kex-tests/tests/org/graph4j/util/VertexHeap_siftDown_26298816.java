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

public class VertexHeap_siftDown_26298816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60296;
     Object term60303;

    public VertexHeap_siftDown_26298816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60296 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term60297 = (int[]) newIntArray(2);
        int[] term60300 = (int[]) newIntArray(1);
        setField(term60296, term60296.getClass(), "graph", null);
        setField(term60296, term60296.getClass(), "comparator", null);
        setIntElement(term60297, 0, 1642371312);
        setIntElement(term60297, 1, 1331115116);
        setField(term60296, term60296.getClass(), "keys", term60297);
        setIntElement(term60300, 0, 744237210);
        setField(term60296, term60296.getClass(), "positions", term60300);
        setIntField(term60296, term60296.getClass(), "size", 1971480321);
        term60303 = new Integer(1363084633);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term60303;
        callMethod(klass, "siftDown", argTypes, term60296, args);
    }

};


