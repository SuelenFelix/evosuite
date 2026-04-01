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

public class VertexSet_add_16235381176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150086;
     Object term150109;

    public VertexSet_add_16235381176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150086 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term150087 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term150088 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term150092 = (int[]) newIntArray(9);
        Object term150104 = newInstance(Class.forName("java.util.BitSet"));
        long[] term150105 = (long[]) newLongArray(1);
        setField(term150087, term150087.getClass(), "table", term150088);
        setIntField(term150087, term150087.getClass(), "count", -933833145);
        setIntField(term150087, term150087.getClass(), "threshold", 15);
        setFloatField(term150087, term150087.getClass(), "loadFactor", 0.75F);
        setField(term150086, term150086.getClass(), "posMap", term150087);
        setField(term150086, term150086.getClass(), "graph", null);
        setIntElement(term150092, 0, 8996399);
        setIntElement(term150092, 1, 606950328);
        setIntElement(term150092, 2, 638457802);
        setIntElement(term150092, 3, 319470295);
        setIntElement(term150092, 4, -541395202);
        setIntElement(term150092, 5, 992017929);
        setIntElement(term150092, 6, 1682297980);
        setIntElement(term150092, 7, 465156120);
        setIntElement(term150092, 8, 2048571160);
        setField(term150086, term150086.getClass(), "vertices", term150092);
        setIntField(term150086, term150086.getClass(), "numVertices", 165801141);
        setIntField(term150086, term150086.getClass(), "first", -1513645041);
        setField(term150104, term150104.getClass(), "words", term150105);
        setIntField(term150104, term150104.getClass(), "wordsInUse", -1114814678);
        setBooleanField(term150104, term150104.getClass(), "sizeIsSticky", false);
        setField(term150086, term150086.getClass(), "bitset", term150104);
        term150109 = new Integer(-1766175976);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term150109;
        callMethod(klass, "add", argTypes, term150086, args);
    }

};


