package org.graph4j.coloring.bw;

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
import static org.graph4j.coloring.bw.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Double;

public class GreedyBandwithColoring_markUsedColor_15892445772 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term958;
     Object term982;
     Object term984;

    public GreedyBandwithColoring_markUsedColor_15892445772() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term958 = newInstance(Class.forName("org.graph4j.coloring.bw.GreedyBandwithColoring"));
        int[] term960 = (int[]) newIntArray(7);
        int[] term968 = (int[]) newIntArray(6);
        Object term975 = newInstance(Class.forName("java.util.BitSet"));
        long[] term976 = (long[]) newLongArray(1);
        setIntField(term958, term958.getClass(), "pos", -146054762);
        setIntElement(term960, 0, 798043553);
        setIntElement(term960, 1, 533197381);
        setIntElement(term960, 2, 1048271679);
        setIntElement(term960, 3, -1529797673);
        setIntElement(term960, 4, -868676396);
        setIntElement(term960, 5, 1922684808);
        setIntElement(term960, 6, -2005784375);
        setField(term958, term958.getClass(), "vertexOrdering", term960);
        setIntElement(term968, 0, -288604325);
        setIntElement(term968, 1, -1268314569);
        setIntElement(term968, 2, 877649659);
        setIntElement(term968, 3, -1332748804);
        setIntElement(term968, 4, 1774507971);
        setIntElement(term968, 5, -1420269858);
        setField(term958, term958.getClass(), "colors", term968);
        setField(term975, term975.getClass(), "words", term976);
        setIntField(term975, term975.getClass(), "wordsInUse", -2119545015);
        setBooleanField(term975, term975.getClass(), "sizeIsSticky", true);
        setField(term958, term958.getClass(), "used", term975);
        setIntField(term958, term958.getClass(), "numColors", 1272542218);
        setIntField(term958, term958.getClass(), "maxColor", 1209799204);
        setField(term958, term958.getClass(), "recolor", null);
        setField(term958, term958.getClass(), "graph", null);
        term982 = new Integer(1094107751);
        term984 = new Double(0.13238746331190498);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.bw.GreedyBandwithColoring");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term982;
        args[1] = term984;
        callMethod(klass, "markUsedColor", argTypes, term958, args);
    }

};


