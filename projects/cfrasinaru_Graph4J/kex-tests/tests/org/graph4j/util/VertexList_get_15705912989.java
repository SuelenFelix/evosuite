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

public class VertexList_get_15705912989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2476;
     Object term2493;

    public VertexList_get_15705912989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2476 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        int[] term2477 = (int[]) newIntArray(8);
        Object term2488 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2489 = (long[]) newLongArray(1);
        setField(term2476, term2476.getClass(), "graph", null);
        setIntElement(term2477, 0, -1421649118);
        setIntElement(term2477, 1, -511248284);
        setIntElement(term2477, 2, 788630042);
        setIntElement(term2477, 3, 1430066560);
        setIntElement(term2477, 4, 836734074);
        setIntElement(term2477, 5, -1747711865);
        setIntElement(term2477, 6, 682812715);
        setIntElement(term2477, 7, -1092883950);
        setField(term2476, term2476.getClass(), "vertices", term2477);
        setIntField(term2476, term2476.getClass(), "numVertices", 950385621);
        setIntField(term2476, term2476.getClass(), "first", -232352320);
        setField(term2488, term2488.getClass(), "words", term2489);
        setIntField(term2488, term2488.getClass(), "wordsInUse", -232333014);
        setBooleanField(term2488, term2488.getClass(), "sizeIsSticky", false);
        setField(term2476, term2476.getClass(), "bitset", term2488);
        term2493 = new Integer(-139694079);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2493;
        callMethod(klass, "get", argTypes, term2476, args);
    }

};


