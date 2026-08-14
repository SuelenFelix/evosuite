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

public class RootedTree_root_11039926932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6702;

    public RootedTree_root_11039926932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6711 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term6712 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term6716 = (int[]) newIntArray(0);
        Object term6719 = newInstance(Class.forName("java.util.BitSet"));
        setField(term6712, term6712.getClass(), "table", null);
        setIntField(term6712, term6712.getClass(), "count", 1309545946);
        setIntField(term6712, term6712.getClass(), "threshold", 15);
        setFloatField(term6712, term6712.getClass(), "loadFactor", 0.75F);
        setField(term6711, term6711.getClass(), "posMap", term6712);
        setField(term6711, term6711.getClass(), "graph", null);
        setField(term6711, term6711.getClass(), "vertices", term6716);
        setIntField(term6711, term6711.getClass(), "numVertices", -1457812682);
        setIntField(term6711, term6711.getClass(), "first", -161850441);
        setField(term6719, term6719.getClass(), "words", null);
        setIntField(term6719, term6719.getClass(), "wordsInUse", 1486351894);
        setBooleanField(term6719, term6719.getClass(), "sizeIsSticky", false);
        setField(term6711, term6711.getClass(), "bitset", term6719);
        Object term6722 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term6723 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term6727 = (int[]) newIntArray(5);
        Object term6735 = newInstance(Class.forName("java.util.BitSet"));
        setField(term6723, term6723.getClass(), "table", null);
        setIntField(term6723, term6723.getClass(), "count", 1352463113);
        setIntField(term6723, term6723.getClass(), "threshold", 15);
        setFloatField(term6723, term6723.getClass(), "loadFactor", 0.75F);
        setField(term6722, term6722.getClass(), "posMap", term6723);
        setField(term6722, term6722.getClass(), "graph", null);
        setIntElement(term6727, 0, 897269648);
        setIntElement(term6727, 1, -1020664075);
        setIntElement(term6727, 2, -1412100145);
        setIntElement(term6727, 3, -1702355599);
        setIntElement(term6727, 4, -1477091217);
        setField(term6722, term6722.getClass(), "vertices", term6727);
        setIntField(term6722, term6722.getClass(), "numVertices", 2023226154);
        setIntField(term6722, term6722.getClass(), "first", 2111611214);
        setField(term6735, term6735.getClass(), "words", null);
        setIntField(term6735, term6735.getClass(), "wordsInUse", -2031129784);
        setBooleanField(term6735, term6735.getClass(), "sizeIsSticky", true);
        setField(term6722, term6722.getClass(), "bitset", term6735);
        ArrayList term6709 = new ArrayList();
        ((ArrayList) term6709).add(term6711);
        ((ArrayList) term6709).add(term6722);
        term6702 = newInstance(Class.forName("org.graph4j.util.RootedTree"));
        int[] term6704 = (int[]) newIntArray(4);
        setField(term6702, term6702.getClass(), "tree", null);
        setIntField(term6702, term6702.getClass(), "root", 1961351136);
        setIntElement(term6704, 0, -1546528470);
        setIntElement(term6704, 1, -1518971561);
        setIntElement(term6704, 2, 1513663171);
        setIntElement(term6704, 3, 1527034193);
        setField(term6702, term6702.getClass(), "parents", term6704);
        setField(term6702, term6702.getClass(), "levels", term6709);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.RootedTree");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "root", argTypes, term6702, args);
    }

};


