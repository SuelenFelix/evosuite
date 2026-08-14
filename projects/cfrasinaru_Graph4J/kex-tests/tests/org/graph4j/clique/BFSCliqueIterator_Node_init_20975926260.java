package org.graph4j.clique;

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
import static org.graph4j.clique.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;

public class BFSCliqueIterator_Node_init_20975926260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2843;
     Object term2876;
     Object term2899;

    public BFSCliqueIterator_Node_init_20975926260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2849 = newInstance(Class.forName("org.graph4j.clique.BFSCliqueIterator$Node"));
        Object term2850 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term2853 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term2850, term2850.getClass(), "posMap", null);
        setField(term2850, term2850.getClass(), "graph", null);
        setField(term2850, term2850.getClass(), "vertices", null);
        setIntField(term2850, term2850.getClass(), "numVertices", -650288950);
        setIntField(term2850, term2850.getClass(), "first", 433039357);
        setField(term2850, term2850.getClass(), "bitset", null);
        setField(term2849, term2849.getClass(), "clique", term2850);
        setField(term2853, term2853.getClass(), "posMap", null);
        setField(term2853, term2853.getClass(), "graph", null);
        setField(term2853, term2853.getClass(), "vertices", null);
        setIntField(term2853, term2853.getClass(), "numVertices", 1691516034);
        setIntField(term2853, term2853.getClass(), "first", 335681723);
        setField(term2853, term2853.getClass(), "bitset", null);
        setField(term2849, term2849.getClass(), "cand", term2853);
        setField(term2849, term2849.getClass(), "this$0", null);
        Object term2857 = newInstance(Class.forName("org.graph4j.clique.BFSCliqueIterator$Node"));
        setField(term2857, term2857.getClass(), "clique", null);
        setField(term2857, term2857.getClass(), "cand", null);
        setField(term2857, term2857.getClass(), "this$0", null);
        LinkedList term2846 = new LinkedList();
        ((LinkedList) term2846).add(term2849);
        ((LinkedList) term2846).add(term2857);
        ((LinkedList) term2846).add((Object)null);
        ((LinkedList) term2846).add((Object)null);
        term2843 = newInstance(Class.forName("org.graph4j.clique.BFSCliqueIterator"));
        Object term2868 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term2869 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term2870 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        setIntField(term2843, term2843.getClass(), "minSize", 898165245);
        setIntField(term2843, term2843.getClass(), "maxSize", 1810754549);
        setField(term2843, term2843.getClass(), "queue", term2846);
        setField(term2869, term2869.getClass(), "table", term2870);
        setIntField(term2869, term2869.getClass(), "count", 0);
        setIntField(term2869, term2869.getClass(), "threshold", 15);
        setFloatField(term2869, term2869.getClass(), "loadFactor", 0.75F);
        setField(term2868, term2868.getClass(), "posMap", term2869);
        setField(term2868, term2868.getClass(), "graph", null);
        setField(term2868, term2868.getClass(), "vertices", null);
        setIntField(term2868, term2868.getClass(), "numVertices", 0);
        setIntField(term2868, term2868.getClass(), "first", 0);
        setField(term2868, term2868.getClass(), "bitset", null);
        setField(term2843, term2843.getClass(), "currentClique", term2868);
        setField(term2843, term2843.getClass(), "graph", null);
        term2876 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term2877 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term2878 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term2882 = (int[]) newIntArray(9);
        Object term2894 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2895 = (long[]) newLongArray(1);
        setField(term2877, term2877.getClass(), "table", term2878);
        setIntField(term2877, term2877.getClass(), "count", -89522625);
        setIntField(term2877, term2877.getClass(), "threshold", 15);
        setFloatField(term2877, term2877.getClass(), "loadFactor", 0.75F);
        setField(term2876, term2876.getClass(), "posMap", term2877);
        setField(term2876, term2876.getClass(), "graph", null);
        setIntElement(term2882, 0, 1475906894);
        setIntElement(term2882, 1, -2004794532);
        setIntElement(term2882, 2, 1232958763);
        setIntElement(term2882, 3, -1702132549);
        setIntElement(term2882, 4, -1786136772);
        setIntElement(term2882, 5, -1510967747);
        setIntElement(term2882, 6, -2014792457);
        setIntElement(term2882, 7, 1957633116);
        setIntElement(term2882, 8, 1428598210);
        setField(term2876, term2876.getClass(), "vertices", term2882);
        setIntField(term2876, term2876.getClass(), "numVertices", 1071776561);
        setIntField(term2876, term2876.getClass(), "first", 1846399918);
        setField(term2894, term2894.getClass(), "words", term2895);
        setIntField(term2894, term2894.getClass(), "wordsInUse", 35388821);
        setBooleanField(term2894, term2894.getClass(), "sizeIsSticky", true);
        setField(term2876, term2876.getClass(), "bitset", term2894);
        term2899 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term2900 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term2901 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term2905 = (int[]) newIntArray(2);
        Object term2910 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2911 = (long[]) newLongArray(1);
        setField(term2900, term2900.getClass(), "table", term2901);
        setIntField(term2900, term2900.getClass(), "count", -598803400);
        setIntField(term2900, term2900.getClass(), "threshold", 15);
        setFloatField(term2900, term2900.getClass(), "loadFactor", 0.75F);
        setField(term2899, term2899.getClass(), "posMap", term2900);
        setField(term2899, term2899.getClass(), "graph", null);
        setIntElement(term2905, 0, 25560022);
        setIntElement(term2905, 1, -1090136985);
        setField(term2899, term2899.getClass(), "vertices", term2905);
        setIntField(term2899, term2899.getClass(), "numVertices", -355574894);
        setIntField(term2899, term2899.getClass(), "first", 1866941633);
        setField(term2910, term2910.getClass(), "words", term2911);
        setIntField(term2910, term2910.getClass(), "wordsInUse", 1697296048);
        setBooleanField(term2910, term2910.getClass(), "sizeIsSticky", false);
        setField(term2899, term2899.getClass(), "bitset", term2910);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.clique.BFSCliqueIterator$Node");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.graph4j.clique.BFSCliqueIterator");
        argTypes[1] = Class.forName("org.graph4j.util.Clique");
        argTypes[2] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[3];
        args[0] = term2843;
        args[1] = term2876;
        args[2] = term2899;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


