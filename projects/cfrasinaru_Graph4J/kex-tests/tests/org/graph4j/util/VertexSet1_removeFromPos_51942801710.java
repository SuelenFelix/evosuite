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
import java.lang.Integer;

public class VertexSet1_removeFromPos_51942801710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2890;
     Object term2905;

    public VertexSet1_removeFromPos_51942801710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2890 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term2891 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term2892 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term2896 = (int[]) newIntArray(1);
        Object term2900 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2901 = (long[]) newLongArray(1);
        setField(term2891, term2891.getClass(), "table", term2892);
        setIntField(term2891, term2891.getClass(), "count", 413214164);
        setIntField(term2891, term2891.getClass(), "threshold", 15);
        setFloatField(term2891, term2891.getClass(), "loadFactor", 0.75F);
        setField(term2890, term2890.getClass(), "posMap", term2891);
        setField(term2890, term2890.getClass(), "graph", null);
        setIntElement(term2896, 0, 355911655);
        setField(term2890, term2890.getClass(), "vertices", term2896);
        setIntField(term2890, term2890.getClass(), "numVertices", 1811833766);
        setIntField(term2890, term2890.getClass(), "first", 735987104);
        setField(term2900, term2900.getClass(), "words", term2901);
        setIntField(term2900, term2900.getClass(), "wordsInUse", -1784072578);
        setBooleanField(term2900, term2900.getClass(), "sizeIsSticky", true);
        setField(term2890, term2890.getClass(), "bitset", term2900);
        term2905 = new Integer(2011764585);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2905;
        callMethod(klass, "removeFromPos", argTypes, term2890, args);
    }

};


