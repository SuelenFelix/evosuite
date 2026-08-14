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

public class VertexHeap_updateAtPos_42180138212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term623;
     Object term635;

    public VertexHeap_updateAtPos_42180138212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term623 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term624 = (int[]) newIntArray(8);
        int[] term633 = (int[]) newIntArray(0);
        setField(term623, term623.getClass(), "graph", null);
        setField(term623, term623.getClass(), "comparator", null);
        setIntElement(term624, 0, -1896376975);
        setIntElement(term624, 1, 729658803);
        setIntElement(term624, 2, 114754804);
        setIntElement(term624, 3, 1687361082);
        setIntElement(term624, 4, 584893196);
        setIntElement(term624, 5, 497269071);
        setIntElement(term624, 6, -1899301124);
        setIntElement(term624, 7, -1882480155);
        setField(term623, term623.getClass(), "keys", term624);
        setField(term623, term623.getClass(), "positions", term633);
        setIntField(term623, term623.getClass(), "size", -1410220680);
        term635 = new Integer(389427431);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term635;
        callMethod(klass, "updateAtPos", argTypes, term623, args);
    }

};


