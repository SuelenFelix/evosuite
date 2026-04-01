package org.graph4j.hamiltonian;

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
import static org.graph4j.hamiltonian.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BacktrackLongestPathAlgoritm_getLongestPath_18595602291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public BacktrackLongestPathAlgoritm_getLongestPath_18595602291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.graph4j.hamiltonian.BacktrackLongestPathAlgoritm"));
        Object term2 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term4 = (int[]) newIntArray(5);
        Object term12 = newInstance(Class.forName("java.util.BitSet"));
        long[] term13 = (long[]) newLongArray(1);
        Object term17 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term19 = (int[]) newIntArray(4);
        Object term26 = newInstance(Class.forName("java.util.BitSet"));
        long[] term27 = (long[]) newLongArray(1);
        setIntField(term2, term2.getClass(), "numEdges", 568599855);
        setField(term2, term2.getClass(), "graph", null);
        setIntElement(term4, 0, 1162663216);
        setIntElement(term4, 1, 1484323161);
        setIntElement(term4, 2, 391863371);
        setIntElement(term4, 3, -1922583790);
        setIntElement(term4, 4, -616727354);
        setField(term2, term2.getClass(), "vertices", term4);
        setIntField(term2, term2.getClass(), "numVertices", -1955890973);
        setIntField(term2, term2.getClass(), "first", -2038273078);
        setField(term12, term12.getClass(), "words", term13);
        setIntField(term12, term12.getClass(), "wordsInUse", 1227103734);
        setBooleanField(term12, term12.getClass(), "sizeIsSticky", false);
        setField(term2, term2.getClass(), "bitset", term12);
        setField(term1, term1.getClass(), "currentBest", term2);
        setIntField(term17, term17.getClass(), "numEdges", -1339778481);
        setField(term17, term17.getClass(), "graph", null);
        setIntElement(term19, 0, 1725571209);
        setIntElement(term19, 1, -522618178);
        setIntElement(term19, 2, 1134449235);
        setIntElement(term19, 3, -883034806);
        setField(term17, term17.getClass(), "vertices", term19);
        setIntField(term17, term17.getClass(), "numVertices", 1585847225);
        setIntField(term17, term17.getClass(), "first", 597278769);
        setField(term26, term26.getClass(), "words", term27);
        setIntField(term26, term26.getClass(), "wordsInUse", -1685132342);
        setBooleanField(term26, term26.getClass(), "sizeIsSticky", false);
        setField(term17, term17.getClass(), "bitset", term26);
        setField(term1, term1.getClass(), "currentPath", term17);
        setIntField(term1, term1.getClass(), "source", -1456670397);
        setIntField(term1, term1.getClass(), "target", 1622346318);
        setField(term1, term1.getClass(), "graph", null);
        setBooleanField(term1, term1.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.hamiltonian.BacktrackLongestPathAlgoritm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLongestPath", argTypes, term1, args);
    }

};


