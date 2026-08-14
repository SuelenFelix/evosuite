package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class RootedTree_parents_18916656503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6749;

    public RootedTree_parents_18916656503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6760 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term6761 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term6765 = (int[]) newIntArray(1);
        Object term6769 = newInstance(Class.forName("java.util.BitSet"));
        setField(term6761, term6761.getClass(), "table", null);
        setIntField(term6761, term6761.getClass(), "count", -913468095);
        setIntField(term6761, term6761.getClass(), "threshold", 15);
        setFloatField(term6761, term6761.getClass(), "loadFactor", 0.75F);
        setField(term6760, term6760.getClass(), "posMap", term6761);
        setField(term6760, term6760.getClass(), "graph", null);
        setIntElement(term6765, 0, 38489871);
        setField(term6760, term6760.getClass(), "vertices", term6765);
        setIntField(term6760, term6760.getClass(), "numVertices", -1667787735);
        setIntField(term6760, term6760.getClass(), "first", 1841765799);
        setField(term6769, term6769.getClass(), "words", null);
        setIntField(term6769, term6769.getClass(), "wordsInUse", 72160200);
        setBooleanField(term6769, term6769.getClass(), "sizeIsSticky", true);
        setField(term6760, term6760.getClass(), "bitset", term6769);
        Object term6772 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term6773 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term6777 = (int[]) newIntArray(0);
        Object term6780 = newInstance(Class.forName("java.util.BitSet"));
        setField(term6773, term6773.getClass(), "table", null);
        setIntField(term6773, term6773.getClass(), "count", -1870567623);
        setIntField(term6773, term6773.getClass(), "threshold", 15);
        setFloatField(term6773, term6773.getClass(), "loadFactor", 0.75F);
        setField(term6772, term6772.getClass(), "posMap", term6773);
        setField(term6772, term6772.getClass(), "graph", null);
        setField(term6772, term6772.getClass(), "vertices", term6777);
        setIntField(term6772, term6772.getClass(), "numVertices", -1442923471);
        setIntField(term6772, term6772.getClass(), "first", -434247549);
        setField(term6780, term6780.getClass(), "words", null);
        setIntField(term6780, term6780.getClass(), "wordsInUse", 1246505552);
        setBooleanField(term6780, term6780.getClass(), "sizeIsSticky", true);
        setField(term6772, term6772.getClass(), "bitset", term6780);
        ArrayList term6758 = new ArrayList();
        ((ArrayList) term6758).add(term6760);
        ((ArrayList) term6758).add(term6772);
        term6749 = newInstance(Class.forName("org.graph4j.util.RootedTree"));
        int[] term6751 = (int[]) newIntArray(6);
        setField(term6749, term6749.getClass(), "tree", null);
        setIntField(term6749, term6749.getClass(), "root", 251039122);
        setIntElement(term6751, 0, 459471826);
        setIntElement(term6751, 1, -1054011286);
        setIntElement(term6751, 2, -1640361091);
        setIntElement(term6751, 3, -1908164516);
        setIntElement(term6751, 4, -1343269854);
        setIntElement(term6751, 5, -731459309);
        setField(term6749, term6749.getClass(), "parents", term6751);
        setField(term6749, term6749.getClass(), "levels", term6758);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.RootedTree");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "parents", argTypes, term6749, args);
    }

};


