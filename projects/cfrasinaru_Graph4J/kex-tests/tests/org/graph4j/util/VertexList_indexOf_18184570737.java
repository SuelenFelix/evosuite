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

public class VertexList_indexOf_18184570737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66389;
     Object term66401;

    public VertexList_indexOf_18184570737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66389 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        int[] term66390 = (int[]) newIntArray(3);
        Object term66396 = newInstance(Class.forName("java.util.BitSet"));
        long[] term66397 = (long[]) newLongArray(1);
        setField(term66389, term66389.getClass(), "graph", null);
        setIntElement(term66390, 0, -480385546);
        setIntElement(term66390, 1, 1949625839);
        setIntElement(term66390, 2, 444643271);
        setField(term66389, term66389.getClass(), "vertices", term66390);
        setIntField(term66389, term66389.getClass(), "numVertices", -979081687);
        setIntField(term66389, term66389.getClass(), "first", 1127310631);
        setField(term66396, term66396.getClass(), "words", term66397);
        setIntField(term66396, term66396.getClass(), "wordsInUse", 886454428);
        setBooleanField(term66396, term66396.getClass(), "sizeIsSticky", false);
        setField(term66389, term66389.getClass(), "bitset", term66396);
        term66401 = new Integer(-2146778104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term66401;
        callMethod(klass, "indexOf", argTypes, term66389, args);
    }

};


