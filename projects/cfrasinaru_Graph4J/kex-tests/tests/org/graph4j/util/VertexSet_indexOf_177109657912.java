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
     Object term8194;
     Object term8216;

    public VertexSet_indexOf_177109657912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8194 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term8195 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8196 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term8200 = (int[]) newIntArray(8);
        Object term8211 = newInstance(Class.forName("java.util.BitSet"));
        long[] term8212 = (long[]) newLongArray(1);
        setField(term8195, term8195.getClass(), "table", term8196);
        setIntField(term8195, term8195.getClass(), "count", -1378134881);
        setIntField(term8195, term8195.getClass(), "threshold", 15);
        setFloatField(term8195, term8195.getClass(), "loadFactor", 0.75F);
        setField(term8194, term8194.getClass(), "posMap", term8195);
        setField(term8194, term8194.getClass(), "graph", null);
        setIntElement(term8200, 0, -1887131478);
        setIntElement(term8200, 1, 1916020077);
        setIntElement(term8200, 2, -1842191454);
        setIntElement(term8200, 3, 384551988);
        setIntElement(term8200, 4, -2021521187);
        setIntElement(term8200, 5, -2139205197);
        setIntElement(term8200, 6, -584949216);
        setIntElement(term8200, 7, 1646064199);
        setField(term8194, term8194.getClass(), "vertices", term8200);
        setIntField(term8194, term8194.getClass(), "numVertices", -1135845415);
        setIntField(term8194, term8194.getClass(), "first", -1361921586);
        setField(term8211, term8211.getClass(), "words", term8212);
        setIntField(term8211, term8211.getClass(), "wordsInUse", 593679468);
        setBooleanField(term8211, term8211.getClass(), "sizeIsSticky", true);
        setField(term8194, term8194.getClass(), "bitset", term8211);
        term8216 = new Integer(747491);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8216;
        callMethod(klass, "indexOf", argTypes, term8194, args);
    }

};


