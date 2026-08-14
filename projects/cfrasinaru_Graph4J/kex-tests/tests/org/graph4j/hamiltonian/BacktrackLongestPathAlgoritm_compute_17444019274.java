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

public class BacktrackLongestPathAlgoritm_compute_17444019274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131;

    public BacktrackLongestPathAlgoritm_compute_17444019274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131 = newInstance(Class.forName("org.graph4j.hamiltonian.BacktrackLongestPathAlgoritm"));
        Object term132 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term134 = (int[]) newIntArray(2);
        Object term139 = newInstance(Class.forName("java.util.BitSet"));
        long[] term140 = (long[]) newLongArray(1);
        Object term144 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term146 = (int[]) newIntArray(6);
        Object term155 = newInstance(Class.forName("java.util.BitSet"));
        long[] term156 = (long[]) newLongArray(1);
        setIntField(term132, term132.getClass(), "numEdges", 458147407);
        setField(term132, term132.getClass(), "graph", null);
        setIntElement(term134, 0, -184153539);
        setIntElement(term134, 1, 493620644);
        setField(term132, term132.getClass(), "vertices", term134);
        setIntField(term132, term132.getClass(), "numVertices", 1328271830);
        setIntField(term132, term132.getClass(), "first", 1596070772);
        setField(term139, term139.getClass(), "words", term140);
        setIntField(term139, term139.getClass(), "wordsInUse", 97029295);
        setBooleanField(term139, term139.getClass(), "sizeIsSticky", true);
        setField(term132, term132.getClass(), "bitset", term139);
        setField(term131, term131.getClass(), "currentBest", term132);
        setIntField(term144, term144.getClass(), "numEdges", -1371869594);
        setField(term144, term144.getClass(), "graph", null);
        setIntElement(term146, 0, -2095575670);
        setIntElement(term146, 1, 1225272962);
        setIntElement(term146, 2, 1324040357);
        setIntElement(term146, 3, -1588772968);
        setIntElement(term146, 4, -93135961);
        setIntElement(term146, 5, -112921587);
        setField(term144, term144.getClass(), "vertices", term146);
        setIntField(term144, term144.getClass(), "numVertices", 933028652);
        setIntField(term144, term144.getClass(), "first", 287287233);
        setField(term155, term155.getClass(), "words", term156);
        setIntField(term155, term155.getClass(), "wordsInUse", 962840079);
        setBooleanField(term155, term155.getClass(), "sizeIsSticky", false);
        setField(term144, term144.getClass(), "bitset", term155);
        setField(term131, term131.getClass(), "currentPath", term144);
        setIntField(term131, term131.getClass(), "source", 1540719661);
        setIntField(term131, term131.getClass(), "target", 1265463001);
        setField(term131, term131.getClass(), "graph", null);
        setBooleanField(term131, term131.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.hamiltonian.BacktrackLongestPathAlgoritm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "compute", argTypes, term131, args);
    }

};


