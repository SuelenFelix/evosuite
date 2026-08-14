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
import java.lang.Object;

public class VertexSet1_hashCode_145991566421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71771;

    public VertexSet1_hashCode_145991566421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71771 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term71772 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term71773 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term71777 = (int[]) newIntArray(7);
        Object term71787 = newInstance(Class.forName("java.util.BitSet"));
        long[] term71788 = (long[]) newLongArray(1);
        setField(term71772, term71772.getClass(), "table", term71773);
        setIntField(term71772, term71772.getClass(), "count", -1877003964);
        setIntField(term71772, term71772.getClass(), "threshold", 15);
        setFloatField(term71772, term71772.getClass(), "loadFactor", 0.75F);
        setField(term71771, term71771.getClass(), "posMap", term71772);
        setField(term71771, term71771.getClass(), "graph", null);
        setIntElement(term71777, 0, 1700904086);
        setIntElement(term71777, 1, -362916771);
        setIntElement(term71777, 2, 1886181117);
        setIntElement(term71777, 3, -229212246);
        setIntElement(term71777, 4, 1726721533);
        setIntElement(term71777, 5, -328854592);
        setIntElement(term71777, 6, 765971129);
        setField(term71771, term71771.getClass(), "vertices", term71777);
        setIntField(term71771, term71771.getClass(), "numVertices", -385727798);
        setIntField(term71771, term71771.getClass(), "first", -1441415289);
        setField(term71787, term71787.getClass(), "words", term71788);
        setIntField(term71787, term71787.getClass(), "wordsInUse", 1081832872);
        setBooleanField(term71787, term71787.getClass(), "sizeIsSticky", false);
        setField(term71771, term71771.getClass(), "bitset", term71787);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term71771, args);
    }

};


