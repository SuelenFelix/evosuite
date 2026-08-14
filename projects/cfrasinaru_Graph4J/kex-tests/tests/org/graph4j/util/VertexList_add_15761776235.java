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

public class VertexList_add_15761776235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2371;
     Object term2385;

    public VertexList_add_15761776235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2371 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        int[] term2372 = (int[]) newIntArray(5);
        Object term2380 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2381 = (long[]) newLongArray(1);
        setField(term2371, term2371.getClass(), "graph", null);
        setIntElement(term2372, 0, 1791984446);
        setIntElement(term2372, 1, 804070622);
        setIntElement(term2372, 2, 1850364894);
        setIntElement(term2372, 3, 915367534);
        setIntElement(term2372, 4, 1949983666);
        setField(term2371, term2371.getClass(), "vertices", term2372);
        setIntField(term2371, term2371.getClass(), "numVertices", 154111854);
        setIntField(term2371, term2371.getClass(), "first", 710986341);
        setField(term2380, term2380.getClass(), "words", term2381);
        setIntField(term2380, term2380.getClass(), "wordsInUse", -873958002);
        setBooleanField(term2380, term2380.getClass(), "sizeIsSticky", true);
        setField(term2371, term2371.getClass(), "bitset", term2380);
        term2385 = new Integer(-1780848958);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2385;
        callMethod(klass, "add", argTypes, term2371, args);
    }

};


