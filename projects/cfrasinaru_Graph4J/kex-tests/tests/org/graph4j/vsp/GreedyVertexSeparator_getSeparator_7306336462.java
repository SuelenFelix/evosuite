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

public class GreedyVertexSeparator_getSeparator_7306336462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142822;

    public GreedyVertexSeparator_getSeparator_7306336462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142822 = newInstance(Class.forName("org.graph4j.vsp.GreedyVertexSeparator"));
        Object term142824 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        Object term142825 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term142826 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term142827 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term142831 = (int[]) newIntArray(1);
        Object term142835 = newInstance(Class.forName("java.util.BitSet"));
        long[] term142836 = (long[]) newLongArray(1);
        Object term142840 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term142841 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term142842 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term142846 = (int[]) newIntArray(3);
        Object term142852 = newInstance(Class.forName("java.util.BitSet"));
        long[] term142853 = (long[]) newLongArray(1);
        Object term142857 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term142858 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term142859 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term142863 = (int[]) newIntArray(6);
        Object term142872 = newInstance(Class.forName("java.util.BitSet"));
        long[] term142873 = (long[]) newLongArray(1);
        setIntField(term142822, term142822.getClass(), "maxShoreSize", 1086999941);
        setField(term142824, term142824.getClass(), "graph", null);
        setField(term142826, term142826.getClass(), "table", term142827);
        setIntField(term142826, term142826.getClass(), "count", -1395560689);
        setIntField(term142826, term142826.getClass(), "threshold", 15);
        setFloatField(term142826, term142826.getClass(), "loadFactor", 0.75F);
        setField(term142825, term142825.getClass(), "posMap", term142826);
        setField(term142825, term142825.getClass(), "graph", null);
        setIntElement(term142831, 0, 760470872);
        setField(term142825, term142825.getClass(), "vertices", term142831);
        setIntField(term142825, term142825.getClass(), "numVertices", 387220403);
        setIntField(term142825, term142825.getClass(), "first", -1069314463);
        setField(term142835, term142835.getClass(), "words", term142836);
        setIntField(term142835, term142835.getClass(), "wordsInUse", -1322205143);
        setBooleanField(term142835, term142835.getClass(), "sizeIsSticky", true);
        setField(term142825, term142825.getClass(), "bitset", term142835);
        setField(term142824, term142824.getClass(), "separator", term142825);
        setField(term142841, term142841.getClass(), "table", term142842);
        setIntField(term142841, term142841.getClass(), "count", -1676339448);
        setIntField(term142841, term142841.getClass(), "threshold", 15);
        setFloatField(term142841, term142841.getClass(), "loadFactor", 0.75F);
        setField(term142840, term142840.getClass(), "posMap", term142841);
        setField(term142840, term142840.getClass(), "graph", null);
        setIntElement(term142846, 0, 280447480);
        setIntElement(term142846, 1, 808355334);
        setIntElement(term142846, 2, 1606695207);
        setField(term142840, term142840.getClass(), "vertices", term142846);
        setIntField(term142840, term142840.getClass(), "numVertices", 817550496);
        setIntField(term142840, term142840.getClass(), "first", -1160270508);
        setField(term142852, term142852.getClass(), "words", term142853);
        setIntField(term142852, term142852.getClass(), "wordsInUse", 1223826258);
        setBooleanField(term142852, term142852.getClass(), "sizeIsSticky", true);
        setField(term142840, term142840.getClass(), "bitset", term142852);
        setField(term142824, term142824.getClass(), "leftShore", term142840);
        setField(term142858, term142858.getClass(), "table", term142859);
        setIntField(term142858, term142858.getClass(), "count", 690891924);
        setIntField(term142858, term142858.getClass(), "threshold", 15);
        setFloatField(term142858, term142858.getClass(), "loadFactor", 0.75F);
        setField(term142857, term142857.getClass(), "posMap", term142858);
        setField(term142857, term142857.getClass(), "graph", null);
        setIntElement(term142863, 0, 1016199806);
        setIntElement(term142863, 1, -1903135985);
        setIntElement(term142863, 2, -385665061);
        setIntElement(term142863, 3, -219694976);
        setIntElement(term142863, 4, 377074350);
        setIntElement(term142863, 5, 207689981);
        setField(term142857, term142857.getClass(), "vertices", term142863);
        setIntField(term142857, term142857.getClass(), "numVertices", 252048418);
        setIntField(term142857, term142857.getClass(), "first", 1023889576);
        setField(term142872, term142872.getClass(), "words", term142873);
        setIntField(term142872, term142872.getClass(), "wordsInUse", 565745204);
        setBooleanField(term142872, term142872.getClass(), "sizeIsSticky", false);
        setField(term142857, term142857.getClass(), "bitset", term142872);
        setField(term142824, term142824.getClass(), "rightShore", term142857);
        setIntField(term142824, term142824.getClass(), "maxShoreSize", 427943495);
        setField(term142822, term142822.getClass(), "solution", term142824);
        setField(term142822, term142822.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.GreedyVertexSeparator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSeparator", argTypes, term142822, args);
    }

};


