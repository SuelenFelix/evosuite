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

public class VertexSet_indexOf_177109657912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150255;
     Object term150270;

    public VertexSet_indexOf_177109657912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150255 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term150256 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term150257 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term150261 = (int[]) newIntArray(1);
        Object term150265 = newInstance(Class.forName("java.util.BitSet"));
        long[] term150266 = (long[]) newLongArray(1);
        setField(term150256, term150256.getClass(), "table", term150257);
        setIntField(term150256, term150256.getClass(), "count", 227902140);
        setIntField(term150256, term150256.getClass(), "threshold", 15);
        setFloatField(term150256, term150256.getClass(), "loadFactor", 0.75F);
        setField(term150255, term150255.getClass(), "posMap", term150256);
        setField(term150255, term150255.getClass(), "graph", null);
        setIntElement(term150261, 0, 325841787);
        setField(term150255, term150255.getClass(), "vertices", term150261);
        setIntField(term150255, term150255.getClass(), "numVertices", -1093019375);
        setIntField(term150255, term150255.getClass(), "first", 585716932);
        setField(term150265, term150265.getClass(), "words", term150266);
        setIntField(term150265, term150265.getClass(), "wordsInUse", -2040086264);
        setBooleanField(term150265, term150265.getClass(), "sizeIsSticky", false);
        setField(term150255, term150255.getClass(), "bitset", term150265);
        term150270 = new Integer(-1796908120);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term150270;
        callMethod(klass, "indexOf", argTypes, term150255, args);
    }

};


