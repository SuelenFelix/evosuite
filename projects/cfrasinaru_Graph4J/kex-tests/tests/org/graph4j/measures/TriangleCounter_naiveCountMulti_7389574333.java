package org.graph4j.measures;

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
import static org.graph4j.measures.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TriangleCounter_naiveCountMulti_7389574333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64;
     Object term65;

    public TriangleCounter_naiveCountMulti_7389574333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64 = newInstance(Class.forName("org.graph4j.measures.TriangleCounter"));
        setField(term64, term64.getClass(), "graph", null);
        term65 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        int[] term66 = (int[]) newIntArray(3);
        Object term72 = newInstance(Class.forName("java.util.BitSet"));
        long[] term73 = (long[]) newLongArray(1);
        setField(term65, term65.getClass(), "graph", null);
        setIntElement(term66, 0, 597278769);
        setIntElement(term66, 1, -1685132342);
        setIntElement(term66, 2, -1456670397);
        setField(term65, term65.getClass(), "vertices", term66);
        setIntField(term65, term65.getClass(), "numVertices", 1622346318);
        setIntField(term65, term65.getClass(), "first", 1048535127);
        setField(term72, term72.getClass(), "words", term73);
        setIntField(term72, term72.getClass(), "wordsInUse", -655067527);
        setBooleanField(term72, term72.getClass(), "sizeIsSticky", false);
        setField(term65, term65.getClass(), "bitset", term72);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.measures.TriangleCounter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexList");
        Object[] args = new Object[1];
        args[0] = term65;
        callMethod(klass, "naiveCountMulti", argTypes, term64, args);
    }

};


