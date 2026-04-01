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

public class TriangleCounter_naiveCountSimple_3486573642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45;
     Object term46;

    public TriangleCounter_naiveCountSimple_3486573642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45 = newInstance(Class.forName("org.graph4j.measures.TriangleCounter"));
        setField(term45, term45.getClass(), "graph", null);
        term46 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        int[] term47 = (int[]) newIntArray(4);
        Object term54 = newInstance(Class.forName("java.util.BitSet"));
        long[] term55 = (long[]) newLongArray(1);
        setField(term46, term46.getClass(), "graph", null);
        setIntElement(term47, 0, 1227103734);
        setIntElement(term47, 1, -1339778481);
        setIntElement(term47, 2, 1725571209);
        setIntElement(term47, 3, -522618178);
        setField(term46, term46.getClass(), "vertices", term47);
        setIntField(term46, term46.getClass(), "numVertices", 1134449235);
        setIntField(term46, term46.getClass(), "first", -883034806);
        setField(term54, term54.getClass(), "words", term55);
        setIntField(term54, term54.getClass(), "wordsInUse", 1585847225);
        setBooleanField(term54, term54.getClass(), "sizeIsSticky", false);
        setField(term46, term46.getClass(), "bitset", term54);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.measures.TriangleCounter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexList");
        Object[] args = new Object[1];
        args[0] = term46;
        callMethod(klass, "naiveCountSimple", argTypes, term45, args);
    }

};


