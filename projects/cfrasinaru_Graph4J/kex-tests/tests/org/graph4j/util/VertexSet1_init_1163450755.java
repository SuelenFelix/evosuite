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

public class VertexSet1_init_1163450755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71361;

    public VertexSet1_init_1163450755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71361 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term71362 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term71363 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term71367 = (int[]) newIntArray(7);
        Object term71377 = newInstance(Class.forName("java.util.BitSet"));
        long[] term71378 = (long[]) newLongArray(1);
        setField(term71362, term71362.getClass(), "table", term71363);
        setIntField(term71362, term71362.getClass(), "count", -777621571);
        setIntField(term71362, term71362.getClass(), "threshold", 15);
        setFloatField(term71362, term71362.getClass(), "loadFactor", 0.75F);
        setField(term71361, term71361.getClass(), "posMap", term71362);
        setField(term71361, term71361.getClass(), "graph", null);
        setIntElement(term71367, 0, -1228407222);
        setIntElement(term71367, 1, -138743806);
        setIntElement(term71367, 2, 1701079619);
        setIntElement(term71367, 3, -1822505135);
        setIntElement(term71367, 4, 1664287048);
        setIntElement(term71367, 5, 877573537);
        setIntElement(term71367, 6, -785822775);
        setField(term71361, term71361.getClass(), "vertices", term71367);
        setIntField(term71361, term71361.getClass(), "numVertices", -1481927507);
        setIntField(term71361, term71361.getClass(), "first", -1877062491);
        setField(term71377, term71377.getClass(), "words", term71378);
        setIntField(term71377, term71377.getClass(), "wordsInUse", 807661218);
        setBooleanField(term71377, term71377.getClass(), "sizeIsSticky", true);
        setField(term71361, term71361.getClass(), "bitset", term71377);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet1");
        Object[] args = new Object[1];
        args[0] = term71361;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


