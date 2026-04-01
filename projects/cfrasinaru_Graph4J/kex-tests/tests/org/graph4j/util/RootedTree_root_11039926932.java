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
     Object term118759;

    public RootedTree_root_11039926932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term118771 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term118772 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term118776 = (int[]) newIntArray(7);
        Object term118786 = newInstance(Class.forName("java.util.BitSet"));
        setField(term118772, term118772.getClass(), "table", null);
        setIntField(term118772, term118772.getClass(), "count", 595036388);
        setIntField(term118772, term118772.getClass(), "threshold", 15);
        setFloatField(term118772, term118772.getClass(), "loadFactor", 0.75F);
        setField(term118771, term118771.getClass(), "posMap", term118772);
        setField(term118771, term118771.getClass(), "graph", null);
        setIntElement(term118776, 0, -1216776308);
        setIntElement(term118776, 1, 927924212);
        setIntElement(term118776, 2, 615808657);
        setIntElement(term118776, 3, -63163432);
        setIntElement(term118776, 4, 1221609105);
        setIntElement(term118776, 5, 363141920);
        setIntElement(term118776, 6, -592105330);
        setField(term118771, term118771.getClass(), "vertices", term118776);
        setIntField(term118771, term118771.getClass(), "numVertices", -372197510);
        setIntField(term118771, term118771.getClass(), "first", 596148027);
        setField(term118786, term118786.getClass(), "words", null);
        setIntField(term118786, term118786.getClass(), "wordsInUse", 896411177);
        setBooleanField(term118786, term118786.getClass(), "sizeIsSticky", true);
        setField(term118771, term118771.getClass(), "bitset", term118786);
        Object term118789 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term118790 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term118794 = (int[]) newIntArray(5);
        Object term118802 = newInstance(Class.forName("java.util.BitSet"));
        setField(term118790, term118790.getClass(), "table", null);
        setIntField(term118790, term118790.getClass(), "count", -1421968856);
        setIntField(term118790, term118790.getClass(), "threshold", 15);
        setFloatField(term118790, term118790.getClass(), "loadFactor", 0.75F);
        setField(term118789, term118789.getClass(), "posMap", term118790);
        setField(term118789, term118789.getClass(), "graph", null);
        setIntElement(term118794, 0, -1790234172);
        setIntElement(term118794, 1, -1893295788);
        setIntElement(term118794, 2, -495740087);
        setIntElement(term118794, 3, 649652861);
        setIntElement(term118794, 4, -749956168);
        setField(term118789, term118789.getClass(), "vertices", term118794);
        setIntField(term118789, term118789.getClass(), "numVertices", -1496972303);
        setIntField(term118789, term118789.getClass(), "first", -1109003047);
        setField(term118802, term118802.getClass(), "words", null);
        setIntField(term118802, term118802.getClass(), "wordsInUse", -2064030558);
        setBooleanField(term118802, term118802.getClass(), "sizeIsSticky", true);
        setField(term118789, term118789.getClass(), "bitset", term118802);
        Object term118805 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term118806 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term118810 = (int[]) newIntArray(9);
        Object term118822 = newInstance(Class.forName("java.util.BitSet"));
        setField(term118806, term118806.getClass(), "table", null);
        setIntField(term118806, term118806.getClass(), "count", 565051097);
        setIntField(term118806, term118806.getClass(), "threshold", 15);
        setFloatField(term118806, term118806.getClass(), "loadFactor", 0.75F);
        setField(term118805, term118805.getClass(), "posMap", term118806);
        setField(term118805, term118805.getClass(), "graph", null);
        setIntElement(term118810, 0, 1557145557);
        setIntElement(term118810, 1, -1415673374);
        setIntElement(term118810, 2, 2095645347);
        setIntElement(term118810, 3, 1369572828);
        setIntElement(term118810, 4, -1992905705);
        setIntElement(term118810, 5, -1177935884);
        setIntElement(term118810, 6, 1889117383);
        setIntElement(term118810, 7, -170081121);
        setIntElement(term118810, 8, -2097487613);
        setField(term118805, term118805.getClass(), "vertices", term118810);
        setIntField(term118805, term118805.getClass(), "numVertices", 1808418358);
        setIntField(term118805, term118805.getClass(), "first", 360558872);
        setField(term118822, term118822.getClass(), "words", null);
        setIntField(term118822, term118822.getClass(), "wordsInUse", 504431450);
        setBooleanField(term118822, term118822.getClass(), "sizeIsSticky", false);
        setField(term118805, term118805.getClass(), "bitset", term118822);
        ArrayList term118769 = new ArrayList();
        ((ArrayList) term118769).add(term118771);
        ((ArrayList) term118769).add(term118789);
        ((ArrayList) term118769).add(term118805);
        term118759 = newInstance(Class.forName("org.graph4j.util.RootedTree"));
        int[] term118761 = (int[]) newIntArray(7);
        setField(term118759, term118759.getClass(), "tree", null);
        setIntField(term118759, term118759.getClass(), "root", 487328364);
        setIntElement(term118761, 0, 1991437599);
        setIntElement(term118761, 1, 1953045024);
        setIntElement(term118761, 2, -79967142);
        setIntElement(term118761, 3, 833764735);
        setIntElement(term118761, 4, 380579207);
        setIntElement(term118761, 5, -1067753677);
        setIntElement(term118761, 6, -1041322431);
        setField(term118759, term118759.getClass(), "parents", term118761);
        setField(term118759, term118759.getClass(), "levels", term118769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.RootedTree");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "root", argTypes, term118759, args);
    }

};


