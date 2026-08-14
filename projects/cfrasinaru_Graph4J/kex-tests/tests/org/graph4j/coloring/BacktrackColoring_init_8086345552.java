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
import java.util.HashMap;

public class BacktrackColoring_init_8086345552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5407;

    public BacktrackColoring_init_8086345552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5424 = new HashMap();
        term5407 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term5408 = (int[]) newIntArray(9);
        Object term5419 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5420 = (long[]) newLongArray(1);
        setField(term5407, term5407.getClass(), "graph", null);
        setIntElement(term5408, 0, -1412100145);
        setIntElement(term5408, 1, -1702355599);
        setIntElement(term5408, 2, -1477091217);
        setIntElement(term5408, 3, 2023226154);
        setIntElement(term5408, 4, 2111611214);
        setIntElement(term5408, 5, -2031129784);
        setIntElement(term5408, 6, 251039122);
        setIntElement(term5408, 7, 459471826);
        setIntElement(term5408, 8, -1054011286);
        setField(term5407, term5407.getClass(), "vertexColor", term5408);
        setIntField(term5407, term5407.getClass(), "numColoredVertices", -1640361091);
        setField(term5419, term5419.getClass(), "words", term5420);
        setIntField(term5419, term5419.getClass(), "wordsInUse", -1908164516);
        setBooleanField(term5419, term5419.getClass(), "sizeIsSticky", true);
        setField(term5407, term5407.getClass(), "usedColors", term5419);
        setField(term5407, term5407.getClass(), "colorMap", term5424);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.BacktrackColoring");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Class.forName("org.graph4j.coloring.Coloring");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term5407;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


