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

public class RootedTree_levels_18549106464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6792;

    public RootedTree_levels_18549106464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6805 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term6806 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term6810 = (int[]) newIntArray(3);
        Object term6816 = newInstance(Class.forName("java.util.BitSet"));
        setField(term6806, term6806.getClass(), "table", null);
        setIntField(term6806, term6806.getClass(), "count", 1342884142);
        setIntField(term6806, term6806.getClass(), "threshold", 15);
        setFloatField(term6806, term6806.getClass(), "loadFactor", 0.75F);
        setField(term6805, term6805.getClass(), "posMap", term6806);
        setField(term6805, term6805.getClass(), "graph", null);
        setIntElement(term6810, 0, -1454325068);
        setIntElement(term6810, 1, 346714653);
        setIntElement(term6810, 2, 2121928697);
        setField(term6805, term6805.getClass(), "vertices", term6810);
        setIntField(term6805, term6805.getClass(), "numVertices", -1741056571);
        setIntField(term6805, term6805.getClass(), "first", 522501050);
        setField(term6816, term6816.getClass(), "words", null);
        setIntField(term6816, term6816.getClass(), "wordsInUse", 125432890);
        setBooleanField(term6816, term6816.getClass(), "sizeIsSticky", false);
        setField(term6805, term6805.getClass(), "bitset", term6816);
        Object term6819 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term6820 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term6824 = (int[]) newIntArray(2);
        Object term6829 = newInstance(Class.forName("java.util.BitSet"));
        setField(term6820, term6820.getClass(), "table", null);
        setIntField(term6820, term6820.getClass(), "count", -197740561);
        setIntField(term6820, term6820.getClass(), "threshold", 15);
        setFloatField(term6820, term6820.getClass(), "loadFactor", 0.75F);
        setField(term6819, term6819.getClass(), "posMap", term6820);
        setField(term6819, term6819.getClass(), "graph", null);
        setIntElement(term6824, 0, -1811706962);
        setIntElement(term6824, 1, -1242133071);
        setField(term6819, term6819.getClass(), "vertices", term6824);
        setIntField(term6819, term6819.getClass(), "numVertices", -455052015);
        setIntField(term6819, term6819.getClass(), "first", -1322797287);
        setField(term6829, term6829.getClass(), "words", null);
        setIntField(term6829, term6829.getClass(), "wordsInUse", -615198242);
        setBooleanField(term6829, term6829.getClass(), "sizeIsSticky", true);
        setField(term6819, term6819.getClass(), "bitset", term6829);
        Object term6832 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term6833 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term6837 = (int[]) newIntArray(0);
        Object term6840 = newInstance(Class.forName("java.util.BitSet"));
        setField(term6833, term6833.getClass(), "table", null);
        setIntField(term6833, term6833.getClass(), "count", -491132382);
        setIntField(term6833, term6833.getClass(), "threshold", 15);
        setFloatField(term6833, term6833.getClass(), "loadFactor", 0.75F);
        setField(term6832, term6832.getClass(), "posMap", term6833);
        setField(term6832, term6832.getClass(), "graph", null);
        setField(term6832, term6832.getClass(), "vertices", term6837);
        setIntField(term6832, term6832.getClass(), "numVertices", 918882916);
        setIntField(term6832, term6832.getClass(), "first", 1544012770);
        setField(term6840, term6840.getClass(), "words", null);
        setIntField(term6840, term6840.getClass(), "wordsInUse", 1922068039);
        setBooleanField(term6840, term6840.getClass(), "sizeIsSticky", false);
        setField(term6832, term6832.getClass(), "bitset", term6840);
        Object term6843 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term6844 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term6848 = (int[]) newIntArray(3);
        Object term6854 = newInstance(Class.forName("java.util.BitSet"));
        setField(term6844, term6844.getClass(), "table", null);
        setIntField(term6844, term6844.getClass(), "count", -410564443);
        setIntField(term6844, term6844.getClass(), "threshold", 15);
        setFloatField(term6844, term6844.getClass(), "loadFactor", 0.75F);
        setField(term6843, term6843.getClass(), "posMap", term6844);
        setField(term6843, term6843.getClass(), "graph", null);
        setIntElement(term6848, 0, 996017434);
        setIntElement(term6848, 1, -983870300);
        setIntElement(term6848, 2, 360715062);
        setField(term6843, term6843.getClass(), "vertices", term6848);
        setIntField(term6843, term6843.getClass(), "numVertices", 1047409266);
        setIntField(term6843, term6843.getClass(), "first", 1427248961);
        setField(term6854, term6854.getClass(), "words", null);
        setIntField(term6854, term6854.getClass(), "wordsInUse", 1445291866);
        setBooleanField(term6854, term6854.getClass(), "sizeIsSticky", false);
        setField(term6843, term6843.getClass(), "bitset", term6854);
        ArrayList term6803 = new ArrayList();
        ((ArrayList) term6803).add(term6805);
        ((ArrayList) term6803).add(term6819);
        ((ArrayList) term6803).add(term6832);
        ((ArrayList) term6803).add(term6843);
        term6792 = newInstance(Class.forName("org.graph4j.util.RootedTree"));
        int[] term6794 = (int[]) newIntArray(8);
        setField(term6792, term6792.getClass(), "tree", null);
        setIntField(term6792, term6792.getClass(), "root", -1456497810);
        setIntElement(term6794, 0, 61954667);
        setIntElement(term6794, 1, -919022885);
        setIntElement(term6794, 2, -1836286878);
        setIntElement(term6794, 3, 276336694);
        setIntElement(term6794, 4, 1627938506);
        setIntElement(term6794, 5, 386284750);
        setIntElement(term6794, 6, 906856023);
        setIntElement(term6794, 7, 198857801);
        setField(term6792, term6792.getClass(), "parents", term6794);
        setField(term6792, term6792.getClass(), "levels", term6803);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.RootedTree");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "levels", argTypes, term6792, args);
    }

};


