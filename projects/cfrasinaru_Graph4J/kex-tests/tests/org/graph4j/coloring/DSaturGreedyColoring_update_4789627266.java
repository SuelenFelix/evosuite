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
import java.lang.Integer;

public class DSaturGreedyColoring_update_4789627266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5308;
     Object term5354;

    public DSaturGreedyColoring_update_4789627266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5308 = newInstance(Class.forName("org.graph4j.coloring.DSaturGreedyColoring"));
        Object term5309 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term5310 = (int[]) newIntArray(9);
        int[] term5320 = (int[]) newIntArray(8);
        int[] term5330 = (int[]) newIntArray(8);
        Object[] term5339 = (Object[]) newArray("java.util.BitSet", 1);
        Object term5340 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5341 = (long[]) newLongArray(1);
        int[] term5345 = (int[]) newIntArray(1);
        Object term5347 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5348 = (long[]) newLongArray(1);
        setField(term5309, term5309.getClass(), "graph", null);
        setField(term5309, term5309.getClass(), "comparator", null);
        setIntElement(term5310, 0, 1475906894);
        setIntElement(term5310, 1, -2004794532);
        setIntElement(term5310, 2, 1232958763);
        setIntElement(term5310, 3, -1702132549);
        setIntElement(term5310, 4, -1786136772);
        setIntElement(term5310, 5, -1510967747);
        setIntElement(term5310, 6, -2014792457);
        setIntElement(term5310, 7, 1957633116);
        setIntElement(term5310, 8, 1428598210);
        setField(term5309, term5309.getClass(), "keys", term5310);
        setIntElement(term5320, 0, 1071776561);
        setIntElement(term5320, 1, 1846399918);
        setIntElement(term5320, 2, 35388821);
        setIntElement(term5320, 3, -598803400);
        setIntElement(term5320, 4, 25560022);
        setIntElement(term5320, 5, -1090136985);
        setIntElement(term5320, 6, -355574894);
        setIntElement(term5320, 7, 1866941633);
        setField(term5309, term5309.getClass(), "positions", term5320);
        setIntField(term5309, term5309.getClass(), "size", 1697296048);
        setField(term5308, term5308.getClass(), "heap", term5309);
        setIntElement(term5330, 0, 1302075623);
        setIntElement(term5330, 1, 1238707613);
        setIntElement(term5330, 2, 1961351136);
        setIntElement(term5330, 3, -1546528470);
        setIntElement(term5330, 4, -1518971561);
        setIntElement(term5330, 5, 1513663171);
        setIntElement(term5330, 6, 1527034193);
        setIntElement(term5330, 7, 1309545946);
        setField(term5308, term5308.getClass(), "degree", term5330);
        setField(term5340, term5340.getClass(), "words", term5341);
        setIntField(term5340, term5340.getClass(), "wordsInUse", -1457812682);
        setBooleanField(term5340, term5340.getClass(), "sizeIsSticky", false);
        setElement(term5339, 0, term5340);
        setField(term5308, term5308.getClass(), "dsatur", term5339);
        setIntElement(term5345, 0, -161850441);
        setField(term5308, term5308.getClass(), "colors", term5345);
        setField(term5347, term5347.getClass(), "words", term5348);
        setIntField(term5347, term5347.getClass(), "wordsInUse", 1486351894);
        setBooleanField(term5347, term5347.getClass(), "sizeIsSticky", false);
        setField(term5308, term5308.getClass(), "used", term5347);
        setIntField(term5308, term5308.getClass(), "numColors", 1352463113);
        setIntField(term5308, term5308.getClass(), "maxColor", 897269648);
        setField(term5308, term5308.getClass(), "recolor", null);
        setField(term5308, term5308.getClass(), "graph", null);
        term5354 = new Integer(-1020664075);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.DSaturGreedyColoring");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5354;
        callMethod(klass, "update", argTypes, term5308, args);
    }

};


