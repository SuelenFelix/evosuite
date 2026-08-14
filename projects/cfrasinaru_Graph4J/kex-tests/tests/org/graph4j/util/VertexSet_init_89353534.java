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

public class VertexSet_init_89353534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8003;

    public VertexSet_init_89353534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8003 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term8004 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8005 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term8009 = (int[]) newIntArray(0);
        Object term8012 = newInstance(Class.forName("java.util.BitSet"));
        long[] term8013 = (long[]) newLongArray(1);
        setField(term8004, term8004.getClass(), "table", term8005);
        setIntField(term8004, term8004.getClass(), "count", -414437174);
        setIntField(term8004, term8004.getClass(), "threshold", 15);
        setFloatField(term8004, term8004.getClass(), "loadFactor", 0.75F);
        setField(term8003, term8003.getClass(), "posMap", term8004);
        setField(term8003, term8003.getClass(), "graph", null);
        setField(term8003, term8003.getClass(), "vertices", term8009);
        setIntField(term8003, term8003.getClass(), "numVertices", -860227615);
        setIntField(term8003, term8003.getClass(), "first", -1696192372);
        setField(term8012, term8012.getClass(), "words", term8013);
        setIntField(term8012, term8012.getClass(), "wordsInUse", 1239525687);
        setBooleanField(term8012, term8012.getClass(), "sizeIsSticky", true);
        setField(term8003, term8003.getClass(), "bitset", term8012);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[1];
        args[0] = term8003;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


