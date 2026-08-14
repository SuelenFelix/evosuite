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
     Object term2426;
     Object term2442;

    public VertexList_indexOf_18184570737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2426 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        int[] term2427 = (int[]) newIntArray(7);
        Object term2437 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2438 = (long[]) newLongArray(1);
        setField(term2426, term2426.getClass(), "graph", null);
        setIntElement(term2427, 0, -252449812);
        setIntElement(term2427, 1, -1885268968);
        setIntElement(term2427, 2, 277855691);
        setIntElement(term2427, 3, 675891483);
        setIntElement(term2427, 4, -317900470);
        setIntElement(term2427, 5, -979568);
        setIntElement(term2427, 6, -1422131197);
        setField(term2426, term2426.getClass(), "vertices", term2427);
        setIntField(term2426, term2426.getClass(), "numVertices", -20399281);
        setIntField(term2426, term2426.getClass(), "first", -830170410);
        setField(term2437, term2437.getClass(), "words", term2438);
        setIntField(term2437, term2437.getClass(), "wordsInUse", -1742790308);
        setBooleanField(term2437, term2437.getClass(), "sizeIsSticky", true);
        setField(term2426, term2426.getClass(), "bitset", term2437);
        term2442 = new Integer(-1592093430);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2442;
        callMethod(klass, "indexOf", argTypes, term2426, args);
    }

};


