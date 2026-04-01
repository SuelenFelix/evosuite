package org.graph4j.coloring.eq;

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
import static org.graph4j.coloring.eq.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class GreedyEquitableColoring_compute_5905640214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85;

    public GreedyEquitableColoring_compute_5905640214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term96 = new HashMap();
        term85 = newInstance(Class.forName("org.graph4j.coloring.eq.GreedyEquitableColoring"));
        Object term86 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term87 = (int[]) newIntArray(2);
        Object term91 = newInstance(Class.forName("java.util.BitSet"));
        long[] term92 = (long[]) newLongArray(1);
        setField(term86, term86.getClass(), "graph", null);
        setIntElement(term87, 0, 1876565163);
        setIntElement(term87, 1, -817164822);
        setField(term86, term86.getClass(), "vertexColor", term87);
        setIntField(term86, term86.getClass(), "numColoredVertices", -1016503459);
        setField(term91, term91.getClass(), "words", term92);
        setIntField(term91, term91.getClass(), "wordsInUse", -1968847291);
        setBooleanField(term91, term91.getClass(), "sizeIsSticky", true);
        setField(term86, term86.getClass(), "usedColors", term91);
        setField(term86, term86.getClass(), "colorMap", term96);
        setField(term85, term85.getClass(), "initialColoring", term86);
        setIntField(term85, term85.getClass(), "numColors", 493620644);
        setField(term85, term85.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.eq.GreedyEquitableColoring");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "compute", argTypes, term85, args);
    }

};


