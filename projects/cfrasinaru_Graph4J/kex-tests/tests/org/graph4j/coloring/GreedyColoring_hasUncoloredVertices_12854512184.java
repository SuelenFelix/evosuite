package org.graph4j.coloring;

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
import static org.graph4j.coloring.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GreedyColoring_hasUncoloredVertices_12854512184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4324;

    public GreedyColoring_hasUncoloredVertices_12854512184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4324 = newInstance(Class.forName("org.graph4j.coloring.GreedyColoring"));
        int[] term4326 = (int[]) newIntArray(8);
        int[] term4335 = (int[]) newIntArray(8);
        Object term4344 = newInstance(Class.forName("java.util.BitSet"));
        long[] term4345 = (long[]) newLongArray(1);
        setIntField(term4324, term4324.getClass(), "pos", 1611620166);
        setIntElement(term4326, 0, 249657454);
        setIntElement(term4326, 1, 1734630901);
        setIntElement(term4326, 2, -703815246);
        setIntElement(term4326, 3, 157300746);
        setIntElement(term4326, 4, -1600748613);
        setIntElement(term4326, 5, -1509192782);
        setIntElement(term4326, 6, -867925573);
        setIntElement(term4326, 7, 478422495);
        setField(term4324, term4324.getClass(), "vertexOrdering", term4326);
        setIntElement(term4335, 0, 1727771237);
        setIntElement(term4335, 1, 2033663549);
        setIntElement(term4335, 2, 1766479154);
        setIntElement(term4335, 3, 533171496);
        setIntElement(term4335, 4, 1369020869);
        setIntElement(term4335, 5, -1428947021);
        setIntElement(term4335, 6, -134324004);
        setIntElement(term4335, 7, -1813266173);
        setField(term4324, term4324.getClass(), "colors", term4335);
        setField(term4344, term4344.getClass(), "words", term4345);
        setIntField(term4344, term4344.getClass(), "wordsInUse", -1201819537);
        setBooleanField(term4344, term4344.getClass(), "sizeIsSticky", false);
        setField(term4324, term4324.getClass(), "used", term4344);
        setIntField(term4324, term4324.getClass(), "numColors", 2135922049);
        setIntField(term4324, term4324.getClass(), "maxColor", -263876378);
        setField(term4324, term4324.getClass(), "recolor", null);
        setField(term4324, term4324.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.GreedyColoring");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasUncoloredVertices", argTypes, term4324, args);
    }

};


