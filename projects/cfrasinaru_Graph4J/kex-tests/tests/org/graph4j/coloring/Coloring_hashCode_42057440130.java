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

public class Coloring_hashCode_42057440130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2369;

    public Coloring_hashCode_42057440130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2377 = new HashMap();
        term2369 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term2370 = (int[]) newIntArray(0);
        Object term2372 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2373 = (long[]) newLongArray(1);
        setField(term2369, term2369.getClass(), "graph", null);
        setField(term2369, term2369.getClass(), "vertexColor", term2370);
        setIntField(term2369, term2369.getClass(), "numColoredVertices", 315179039);
        setField(term2372, term2372.getClass(), "words", term2373);
        setIntField(term2372, term2372.getClass(), "wordsInUse", -1835923897);
        setBooleanField(term2372, term2372.getClass(), "sizeIsSticky", true);
        setField(term2369, term2369.getClass(), "usedColors", term2372);
        setField(term2369, term2369.getClass(), "colorMap", term2377);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Coloring");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2369, args);
    }

};


