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
     Object term98347;

    public Block_isValid_9931242833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98347 = newInstance(Class.forName("org.graph4j.util.Block"));
        Object term98348 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term98349 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term98353 = (int[]) newIntArray(1);
        Object term98357 = newInstance(Class.forName("java.util.BitSet"));
        long[] term98358 = (long[]) newLongArray(1);
        setField(term98348, term98348.getClass(), "table", term98349);
        setIntField(term98348, term98348.getClass(), "count", 1963639597);
        setIntField(term98348, term98348.getClass(), "threshold", 15);
        setFloatField(term98348, term98348.getClass(), "loadFactor", 0.75F);
        setField(term98347, term98347.getClass(), "posMap", term98348);
        setField(term98347, term98347.getClass(), "graph", null);
        setIntElement(term98353, 0, -1743139715);
        setField(term98347, term98347.getClass(), "vertices", term98353);
        setIntField(term98347, term98347.getClass(), "numVertices", 104776467);
        setIntField(term98347, term98347.getClass(), "first", 847485505);
        setField(term98357, term98357.getClass(), "words", term98358);
        setIntField(term98357, term98357.getClass(), "wordsInUse", 202000883);
        setBooleanField(term98357, term98357.getClass(), "sizeIsSticky", true);
        setField(term98347, term98347.getClass(), "bitset", term98357);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Block");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isValid", argTypes, term98347, args);
    }

};


