package org.graph4j.vsp;

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
import static org.graph4j.vsp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GreedyVertexSeparator_choose_13694200253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142891;
     Object term142947;
     Object term142969;

    public GreedyVertexSeparator_choose_13694200253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142891 = newInstance(Class.forName("org.graph4j.vsp.GreedyVertexSeparator"));
        Object term142893 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        Object term142894 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term142895 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term142896 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term142900 = (int[]) newIntArray(6);
        Object term142909 = newInstance(Class.forName("java.util.BitSet"));
        long[] term142910 = (long[]) newLongArray(1);
        Object term142914 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term142915 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term142916 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term142920 = (int[]) newIntArray(2);
        Object term142925 = newInstance(Class.forName("java.util.BitSet"));
        long[] term142926 = (long[]) newLongArray(1);
        Object term142930 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term142931 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term142932 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term142936 = (int[]) newIntArray(2);
        Object term142941 = newInstance(Class.forName("java.util.BitSet"));
        long[] term142942 = (long[]) newLongArray(1);
        setIntField(term142891, term142891.getClass(), "maxShoreSize", -1973890296);
        setField(term142893, term142893.getClass(), "graph", null);
        setField(term142895, term142895.getClass(), "table", term142896);
        setIntField(term142895, term142895.getClass(), "count", -874297645);
        setIntField(term142895, term142895.getClass(), "threshold", 15);
        setFloatField(term142895, term142895.getClass(), "loadFactor", 0.75F);
        setField(term142894, term142894.getClass(), "posMap", term142895);
        setField(term142894, term142894.getClass(), "graph", null);
        setIntElement(term142900, 0, -2098554968);
        setIntElement(term142900, 1, 1650574448);
        setIntElement(term142900, 2, -2091663232);
        setIntElement(term142900, 3, 699004286);
        setIntElement(term142900, 4, -1958051064);
        setIntElement(term142900, 5, -1053154153);
        setField(term142894, term142894.getClass(), "vertices", term142900);
        setIntField(term142894, term142894.getClass(), "numVertices", 1525401477);
        setIntField(term142894, term142894.getClass(), "first", 1233088699);
        setField(term142909, term142909.getClass(), "words", term142910);
        setIntField(term142909, term142909.getClass(), "wordsInUse", -1552734519);
        setBooleanField(term142909, term142909.getClass(), "sizeIsSticky", true);
        setField(term142894, term142894.getClass(), "bitset", term142909);
        setField(term142893, term142893.getClass(), "separator", term142894);
        setField(term142915, term142915.getClass(), "table", term142916);
        setIntField(term142915, term142915.getClass(), "count", -207260423);
        setIntField(term142915, term142915.getClass(), "threshold", 15);
        setFloatField(term142915, term142915.getClass(), "loadFactor", 0.75F);
        setField(term142914, term142914.getClass(), "posMap", term142915);
        setField(term142914, term142914.getClass(), "graph", null);
        setIntElement(term142920, 0, -150490290);
        setIntElement(term142920, 1, -1001725611);
        setField(term142914, term142914.getClass(), "vertices", term142920);
        setIntField(term142914, term142914.getClass(), "numVertices", -337544657);
        setIntField(term142914, term142914.getClass(), "first", 233368250);
        setField(term142925, term142925.getClass(), "words", term142926);
        setIntField(term142925, term142925.getClass(), "wordsInUse", 484511680);
        setBooleanField(term142925, term142925.getClass(), "sizeIsSticky", true);
        setField(term142914, term142914.getClass(), "bitset", term142925);
        setField(term142893, term142893.getClass(), "leftShore", term142914);
        setField(term142931, term142931.getClass(), "table", term142932);
        setIntField(term142931, term142931.getClass(), "count", 2103176760);
        setIntField(term142931, term142931.getClass(), "threshold", 15);
        setFloatField(term142931, term142931.getClass(), "loadFactor", 0.75F);
        setField(term142930, term142930.getClass(), "posMap", term142931);
        setField(term142930, term142930.getClass(), "graph", null);
        setIntElement(term142936, 0, -733850402);
        setIntElement(term142936, 1, 1315611620);
        setField(term142930, term142930.getClass(), "vertices", term142936);
        setIntField(term142930, term142930.getClass(), "numVertices", 1888501028);
        setIntField(term142930, term142930.getClass(), "first", -1934436337);
        setField(term142941, term142941.getClass(), "words", term142942);
        setIntField(term142941, term142941.getClass(), "wordsInUse", 1479248815);
        setBooleanField(term142941, term142941.getClass(), "sizeIsSticky", true);
        setField(term142930, term142930.getClass(), "bitset", term142941);
        setField(term142893, term142893.getClass(), "rightShore", term142930);
        setIntField(term142893, term142893.getClass(), "maxShoreSize", -1277598289);
        setField(term142891, term142891.getClass(), "solution", term142893);
        setField(term142891, term142891.getClass(), "graph", null);
        term142947 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term142948 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term142949 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term142953 = (int[]) newIntArray(8);
        Object term142964 = newInstance(Class.forName("java.util.BitSet"));
        long[] term142965 = (long[]) newLongArray(1);
        setField(term142948, term142948.getClass(), "table", term142949);
        setIntField(term142948, term142948.getClass(), "count", 2006551321);
        setIntField(term142948, term142948.getClass(), "threshold", 15);
        setFloatField(term142948, term142948.getClass(), "loadFactor", 0.75F);
        setField(term142947, term142947.getClass(), "posMap", term142948);
        setField(term142947, term142947.getClass(), "graph", null);
        setIntElement(term142953, 0, -1942213842);
        setIntElement(term142953, 1, 965314247);
        setIntElement(term142953, 2, 85687042);
        setIntElement(term142953, 3, 792497868);
        setIntElement(term142953, 4, 1861954483);
        setIntElement(term142953, 5, -1543002906);
        setIntElement(term142953, 6, -1754368198);
        setIntElement(term142953, 7, 1973823589);
        setField(term142947, term142947.getClass(), "vertices", term142953);
        setIntField(term142947, term142947.getClass(), "numVertices", -617848857);
        setIntField(term142947, term142947.getClass(), "first", -498401284);
        setField(term142964, term142964.getClass(), "words", term142965);
        setIntField(term142964, term142964.getClass(), "wordsInUse", -713432791);
        setBooleanField(term142964, term142964.getClass(), "sizeIsSticky", true);
        setField(term142947, term142947.getClass(), "bitset", term142964);
        term142969 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term142970 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term142971 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term142975 = (int[]) newIntArray(7);
        Object term142985 = newInstance(Class.forName("java.util.BitSet"));
        long[] term142986 = (long[]) newLongArray(1);
        setField(term142970, term142970.getClass(), "table", term142971);
        setIntField(term142970, term142970.getClass(), "count", 1916332996);
        setIntField(term142970, term142970.getClass(), "threshold", 15);
        setFloatField(term142970, term142970.getClass(), "loadFactor", 0.75F);
        setField(term142969, term142969.getClass(), "posMap", term142970);
        setField(term142969, term142969.getClass(), "graph", null);
        setIntElement(term142975, 0, 1025236201);
        setIntElement(term142975, 1, -885233919);
        setIntElement(term142975, 2, 1706232416);
        setIntElement(term142975, 3, 203874412);
        setIntElement(term142975, 4, -167691891);
        setIntElement(term142975, 5, -199778043);
        setIntElement(term142975, 6, 1603311281);
        setField(term142969, term142969.getClass(), "vertices", term142975);
        setIntField(term142969, term142969.getClass(), "numVertices", 1121111231);
        setIntField(term142969, term142969.getClass(), "first", -756200575);
        setField(term142985, term142985.getClass(), "words", term142986);
        setIntField(term142985, term142985.getClass(), "wordsInUse", -2134684282);
        setBooleanField(term142985, term142985.getClass(), "sizeIsSticky", false);
        setField(term142969, term142969.getClass(), "bitset", term142985);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.GreedyVertexSeparator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet");
        argTypes[1] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[2];
        args[0] = term142947;
        args[1] = term142969;
        callMethod(klass, "choose", argTypes, term142891, args);
    }

};


