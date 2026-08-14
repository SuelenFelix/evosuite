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

public class VertexSet1_hashCode_145991566419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3132;

    public VertexSet1_hashCode_145991566419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3132 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term3133 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3134 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3138 = (int[]) newIntArray(4);
        Object term3145 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3146 = (long[]) newLongArray(1);
        setField(term3133, term3133.getClass(), "table", term3134);
        setIntField(term3133, term3133.getClass(), "count", 2132934139);
        setIntField(term3133, term3133.getClass(), "threshold", 15);
        setFloatField(term3133, term3133.getClass(), "loadFactor", 0.75F);
        setField(term3132, term3132.getClass(), "posMap", term3133);
        setField(term3132, term3132.getClass(), "graph", null);
        setIntElement(term3138, 0, -1261824381);
        setIntElement(term3138, 1, 1594426218);
        setIntElement(term3138, 2, -2060535464);
        setIntElement(term3138, 3, -1242946317);
        setField(term3132, term3132.getClass(), "vertices", term3138);
        setIntField(term3132, term3132.getClass(), "numVertices", -1541566235);
        setIntField(term3132, term3132.getClass(), "first", -189738995);
        setField(term3145, term3145.getClass(), "words", term3146);
        setIntField(term3145, term3145.getClass(), "wordsInUse", 1943019963);
        setBooleanField(term3145, term3145.getClass(), "sizeIsSticky", true);
        setField(term3132, term3132.getClass(), "bitset", term3145);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term3132, args);
    }

};


