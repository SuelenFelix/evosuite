package org.graph4j.isomorphism;

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
import static org.graph4j.isomorphism.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Boolean;

public class TreeIsomorphism_areIsomorphic_1001288511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2788;

    public TreeIsomorphism_areIsomorphic_1001288511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2802 = new HashMap();
        Boolean term2808 = new Boolean(false);
        Boolean term2824 = new Boolean(false);
        term2788 = newInstance(Class.forName("org.graph4j.isomorphism.TreeIsomorphism"));
        Object term2789 = newInstance(Class.forName("org.graph4j.isomorphism.RootedTreeIsomorphism"));
        int[] term2792 = (int[]) newIntArray(6);
        int[] term2799 = (int[]) newIntArray(2);
        Object term2810 = newInstance(Class.forName("org.graph4j.isomorphism.Isomorphism"));
        int[] term2811 = (int[]) newIntArray(7);
        int[] term2819 = (int[]) newIntArray(4);
        Object term2826 = newInstance(Class.forName("org.graph4j.isomorphism.Isomorphism"));
        setField(term2788, term2788.getClass(), "tree1", null);
        setField(term2788, term2788.getClass(), "tree2", null);
        setField(term2789, term2789.getClass(), "tree1", null);
        setField(term2789, term2789.getClass(), "tree2", null);
        setIntField(term2789, term2789.getClass(), "root1", -255317272);
        setIntField(term2789, term2789.getClass(), "root2", -706253892);
        setIntElement(term2792, 0, -1341439819);
        setIntElement(term2792, 1, -728760750);
        setIntElement(term2792, 2, -1617383807);
        setIntElement(term2792, 3, -1244386281);
        setIntElement(term2792, 4, -885788574);
        setIntElement(term2792, 5, -865722613);
        setField(term2789, term2789.getClass(), "labels1", term2792);
        setIntElement(term2799, 0, -1551355284);
        setIntElement(term2799, 1, -1381970335);
        setField(term2789, term2789.getClass(), "labels2", term2799);
        setField(term2789, term2789.getClass(), "labelListToInt", term2802);
        setIntField(term2789, term2789.getClass(), "maxLabel", 1213549815);
        setField(term2789, term2789.getClass(), "isomorphic", term2808);
        setField(term2810, term2810.getClass(), "graph1", null);
        setField(term2810, term2810.getClass(), "graph2", null);
        setIntElement(term2811, 0, -1518419301);
        setIntElement(term2811, 1, 674879025);
        setIntElement(term2811, 2, -1538936030);
        setIntElement(term2811, 3, -752870423);
        setIntElement(term2811, 4, -1698809299);
        setIntElement(term2811, 5, 401512128);
        setIntElement(term2811, 6, -2069930777);
        setField(term2810, term2810.getClass(), "mapping", term2811);
        setIntElement(term2819, 0, 1543696412);
        setIntElement(term2819, 1, -1385748168);
        setIntElement(term2819, 2, -270592367);
        setIntElement(term2819, 3, 178847646);
        setField(term2810, term2810.getClass(), "inverse", term2819);
        setField(term2789, term2789.getClass(), "isomorphism", term2810);
        setField(term2789, term2789.getClass(), "sortingAlgorithm", null);
        setField(term2788, term2788.getClass(), "rootedAlg", term2789);
        setField(term2788, term2788.getClass(), "isomorphic", term2824);
        setField(term2826, term2826.getClass(), "graph1", null);
        setField(term2826, term2826.getClass(), "graph2", null);
        setField(term2826, term2826.getClass(), "mapping", null);
        setField(term2826, term2826.getClass(), "inverse", null);
        setField(term2788, term2788.getClass(), "isomorphism", term2826);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.TreeIsomorphism");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "areIsomorphic", argTypes, term2788, args);
    }

};


