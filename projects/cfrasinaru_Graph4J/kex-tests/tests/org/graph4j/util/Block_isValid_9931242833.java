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

public class Block_isValid_9931242833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3866;

    public Block_isValid_9931242833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3866 = newInstance(Class.forName("org.graph4j.util.Block"));
        Object term3867 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3868 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3872 = (int[]) newIntArray(9);
        Object term3884 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3885 = (long[]) newLongArray(1);
        setField(term3867, term3867.getClass(), "table", term3868);
        setIntField(term3867, term3867.getClass(), "count", -308526089);
        setIntField(term3867, term3867.getClass(), "threshold", 15);
        setFloatField(term3867, term3867.getClass(), "loadFactor", 0.75F);
        setField(term3866, term3866.getClass(), "posMap", term3867);
        setField(term3866, term3866.getClass(), "graph", null);
        setIntElement(term3872, 0, -359675864);
        setIntElement(term3872, 1, -1671982964);
        setIntElement(term3872, 2, 776218451);
        setIntElement(term3872, 3, -1362132929);
        setIntElement(term3872, 4, 1267740164);
        setIntElement(term3872, 5, 1363887997);
        setIntElement(term3872, 6, -1744763945);
        setIntElement(term3872, 7, 852281447);
        setIntElement(term3872, 8, 1248430530);
        setField(term3866, term3866.getClass(), "vertices", term3872);
        setIntField(term3866, term3866.getClass(), "numVertices", -1911828505);
        setIntField(term3866, term3866.getClass(), "first", 241725499);
        setField(term3884, term3884.getClass(), "words", term3885);
        setIntField(term3884, term3884.getClass(), "wordsInUse", 823179298);
        setBooleanField(term3884, term3884.getClass(), "sizeIsSticky", false);
        setField(term3866, term3866.getClass(), "bitset", term3884);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Block");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isValid", argTypes, term3866, args);
    }

};


