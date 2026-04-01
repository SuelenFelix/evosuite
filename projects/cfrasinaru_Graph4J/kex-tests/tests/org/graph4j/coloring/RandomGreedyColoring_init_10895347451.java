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

public class RandomGreedyColoring_init_10895347451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1018;

    public RandomGreedyColoring_init_10895347451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1018 = newInstance(Class.forName("org.graph4j.coloring.RandomGreedyColoring"));
        int[] term1020 = (int[]) newIntArray(6);
        int[] term1027 = (int[]) newIntArray(0);
        Object term1028 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1029 = (long[]) newLongArray(1);
        setIntField(term1018, term1018.getClass(), "pos", 806595993);
        setIntElement(term1020, 0, 548228925);
        setIntElement(term1020, 1, -749861210);
        setIntElement(term1020, 2, 1694224101);
        setIntElement(term1020, 3, 937859191);
        setIntElement(term1020, 4, -916584829);
        setIntElement(term1020, 5, -2131181468);
        setField(term1018, term1018.getClass(), "vertexOrdering", term1020);
        setField(term1018, term1018.getClass(), "colors", term1027);
        setField(term1028, term1028.getClass(), "words", term1029);
        setIntField(term1028, term1028.getClass(), "wordsInUse", 282916351);
        setBooleanField(term1028, term1028.getClass(), "sizeIsSticky", true);
        setField(term1018, term1018.getClass(), "used", term1028);
        setIntField(term1018, term1018.getClass(), "numColors", 880977281);
        setIntField(term1018, term1018.getClass(), "maxColor", 371943306);
        setField(term1018, term1018.getClass(), "recolor", null);
        setField(term1018, term1018.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.RandomGreedyColoring");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "init", argTypes, term1018, args);
    }

};


