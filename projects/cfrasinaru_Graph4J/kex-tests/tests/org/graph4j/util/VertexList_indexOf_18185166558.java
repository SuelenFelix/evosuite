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

public class VertexList_indexOf_18185166558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66407;
     Object term66419;
     Object term66421;

    public VertexList_indexOf_18185166558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66407 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        int[] term66408 = (int[]) newIntArray(3);
        Object term66414 = newInstance(Class.forName("java.util.BitSet"));
        long[] term66415 = (long[]) newLongArray(1);
        setField(term66407, term66407.getClass(), "graph", null);
        setIntElement(term66408, 0, -645880633);
        setIntElement(term66408, 1, 1698626232);
        setIntElement(term66408, 2, -576137583);
        setField(term66407, term66407.getClass(), "vertices", term66408);
        setIntField(term66407, term66407.getClass(), "numVertices", 1796558091);
        setIntField(term66407, term66407.getClass(), "first", 586321169);
        setField(term66414, term66414.getClass(), "words", term66415);
        setIntField(term66414, term66414.getClass(), "wordsInUse", 807581958);
        setBooleanField(term66414, term66414.getClass(), "sizeIsSticky", true);
        setField(term66407, term66407.getClass(), "bitset", term66414);
        term66419 = new Integer(1362834596);
        term66421 = new Integer(1654459583);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term66419;
        args[1] = term66421;
        callMethod(klass, "indexOf", argTypes, term66407, args);
    }

};


