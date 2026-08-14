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

public class VertexSet_intersection_64245165817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8336;
     Object term8354;

    public VertexSet_intersection_64245165817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8336 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term8337 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8338 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term8342 = (int[]) newIntArray(4);
        Object term8349 = newInstance(Class.forName("java.util.BitSet"));
        long[] term8350 = (long[]) newLongArray(1);
        setField(term8337, term8337.getClass(), "table", term8338);
        setIntField(term8337, term8337.getClass(), "count", 461068473);
        setIntField(term8337, term8337.getClass(), "threshold", 15);
        setFloatField(term8337, term8337.getClass(), "loadFactor", 0.75F);
        setField(term8336, term8336.getClass(), "posMap", term8337);
        setField(term8336, term8336.getClass(), "graph", null);
        setIntElement(term8342, 0, -1833298266);
        setIntElement(term8342, 1, 746372422);
        setIntElement(term8342, 2, 1921465988);
        setIntElement(term8342, 3, -164438599);
        setField(term8336, term8336.getClass(), "vertices", term8342);
        setIntField(term8336, term8336.getClass(), "numVertices", -444441955);
        setIntField(term8336, term8336.getClass(), "first", -544005591);
        setField(term8349, term8349.getClass(), "words", term8350);
        setIntField(term8349, term8349.getClass(), "wordsInUse", -1379603462);
        setBooleanField(term8349, term8349.getClass(), "sizeIsSticky", true);
        setField(term8336, term8336.getClass(), "bitset", term8349);
        term8354 = (int[]) newIntArray(6);
        setIntElement(term8354, 0, -1304965721);
        setIntElement(term8354, 1, 1661411651);
        setIntElement(term8354, 2, 175517901);
        setIntElement(term8354, 3, 335030203);
        setIntElement(term8354, 4, -474014477);
        setIntElement(term8354, 5, 1610419467);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term8354;
        callMethod(klass, "intersection", argTypes, term8336, args);
    }

};


