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

public class GreedyColoring_init_18666671783 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4282;

    public GreedyColoring_init_18666671783() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4282 = newInstance(Class.forName("org.graph4j.coloring.GreedyColoring"));
        int[] term4284 = (int[]) newIntArray(7);
        int[] term4292 = (int[]) newIntArray(8);
        Object term4301 = newInstance(Class.forName("java.util.BitSet"));
        long[] term4302 = (long[]) newLongArray(1);
        setIntField(term4282, term4282.getClass(), "pos", 44908093);
        setIntElement(term4284, 0, 887198203);
        setIntElement(term4284, 1, 12581312);
        setIntElement(term4284, 2, 2087383644);
        setIntElement(term4284, 3, 405527523);
        setIntElement(term4284, 4, -1123526433);
        setIntElement(term4284, 5, 910269225);
        setIntElement(term4284, 6, -298852874);
        setField(term4282, term4282.getClass(), "vertexOrdering", term4284);
        setIntElement(term4292, 0, 1094297953);
        setIntElement(term4292, 1, -329141819);
        setIntElement(term4292, 2, -963204620);
        setIntElement(term4292, 3, 172898580);
        setIntElement(term4292, 4, -777833461);
        setIntElement(term4292, 5, 1583691829);
        setIntElement(term4292, 6, -1468541076);
        setIntElement(term4292, 7, -1796760393);
        setField(term4282, term4282.getClass(), "colors", term4292);
        setField(term4301, term4301.getClass(), "words", term4302);
        setIntField(term4301, term4301.getClass(), "wordsInUse", -2099267271);
        setBooleanField(term4301, term4301.getClass(), "sizeIsSticky", false);
        setField(term4282, term4282.getClass(), "used", term4301);
        setIntField(term4282, term4282.getClass(), "numColors", 1134565344);
        setIntField(term4282, term4282.getClass(), "maxColor", -1747434000);
        setField(term4282, term4282.getClass(), "recolor", null);
        setField(term4282, term4282.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.GreedyColoring");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "init", argTypes, term4282, args);
    }

};


