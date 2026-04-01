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
import java.util.HashMap;
import java.lang.Long;

public class BacktrackBandwithColoring_init_6051157223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63;
     Object term85;

    public BacktrackBandwithColoring_init_6051157223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term72 = new HashMap();
        term63 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term64 = (int[]) newIntArray(1);
        Object term67 = newInstance(Class.forName("java.util.BitSet"));
        long[] term68 = (long[]) newLongArray(1);
        setField(term63, term63.getClass(), "graph", null);
        setIntElement(term64, 0, -1275173084);
        setField(term63, term63.getClass(), "vertexColor", term64);
        setIntField(term63, term63.getClass(), "numColoredVertices", -244121226);
        setField(term67, term67.getClass(), "words", term68);
        setIntField(term67, term67.getClass(), "wordsInUse", -203030934);
        setBooleanField(term67, term67.getClass(), "sizeIsSticky", true);
        setField(term63, term63.getClass(), "usedColors", term67);
        setField(term63, term63.getClass(), "colorMap", term72);
        term85 = new Long(6375119433582206027L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.bw.BacktrackBandwithColoring");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Class.forName("org.graph4j.coloring.Coloring");
        argTypes[2] = long.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term63;
        args[2] = term85;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


