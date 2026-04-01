package org.graph4j.generators;

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
import static org.graph4j.generators.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RandomHamiltonianGenerator_createEdges_11173485745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term432;

    public RandomHamiltonianGenerator_createEdges_11173485745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term432 = newInstance(Class.forName("org.graph4j.generators.RandomHamiltonianGenerator"));
        Object term434 = newInstance(Class.forName("org.graph4j.util.Cycle"));
        int[] term436 = (int[]) newIntArray(7);
        Object term446 = newInstance(Class.forName("java.util.BitSet"));
        long[] term447 = (long[]) newLongArray(1);
        int[] term451 = (int[]) newIntArray(2);
        setDoubleField(term432, term432.getClass(), "edgeProbability", 0.9828442029246764);
        setIntField(term434, term434.getClass(), "numEdges", -341152642);
        setField(term434, term434.getClass(), "graph", null);
        setIntElement(term436, 0, -2015854073);
        setIntElement(term436, 1, 538259104);
        setIntElement(term436, 2, 96566506);
        setIntElement(term436, 3, -343325701);
        setIntElement(term436, 4, 107945604);
        setIntElement(term436, 5, -1963464809);
        setIntElement(term436, 6, 71190297);
        setField(term434, term434.getClass(), "vertices", term436);
        setIntField(term434, term434.getClass(), "numVertices", 1202361360);
        setIntField(term434, term434.getClass(), "first", -2015048153);
        setField(term446, term446.getClass(), "words", term447);
        setIntField(term446, term446.getClass(), "wordsInUse", -2063457669);
        setBooleanField(term446, term446.getClass(), "sizeIsSticky", false);
        setField(term434, term434.getClass(), "bitset", term446);
        setField(term432, term432.getClass(), "cycle", term434);
        setIntElement(term451, 0, -1222006000);
        setIntElement(term451, 1, 2095798786);
        setField(term432, term432.getClass(), "vertices", term451);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomHamiltonianGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createEdges", argTypes, term432, args);
    }

};


