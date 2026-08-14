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

public class VertexList_insert_112336522911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2532;
     Object term2549;
     Object term2551;

    public VertexList_insert_112336522911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2532 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        int[] term2533 = (int[]) newIntArray(8);
        Object term2544 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2545 = (long[]) newLongArray(1);
        setField(term2532, term2532.getClass(), "graph", null);
        setIntElement(term2533, 0, 1544768934);
        setIntElement(term2533, 1, -383508597);
        setIntElement(term2533, 2, -819372164);
        setIntElement(term2533, 3, 958132675);
        setIntElement(term2533, 4, -689879283);
        setIntElement(term2533, 5, 1985432430);
        setIntElement(term2533, 6, -1769933499);
        setIntElement(term2533, 7, -1510932472);
        setField(term2532, term2532.getClass(), "vertices", term2533);
        setIntField(term2532, term2532.getClass(), "numVertices", 1970654816);
        setIntField(term2532, term2532.getClass(), "first", 1354781442);
        setField(term2544, term2544.getClass(), "words", term2545);
        setIntField(term2544, term2544.getClass(), "wordsInUse", -393590701);
        setBooleanField(term2544, term2544.getClass(), "sizeIsSticky", false);
        setField(term2532, term2532.getClass(), "bitset", term2544);
        term2549 = new Integer(86344574);
        term2551 = new Integer(-829441157);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2549;
        args[1] = term2551;
        callMethod(klass, "insert", argTypes, term2532, args);
    }

};


