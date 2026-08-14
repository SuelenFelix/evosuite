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
     Object term8045;
     Object term8063;

    public VertexSet_add_16235381176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8045 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term8046 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8047 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term8051 = (int[]) newIntArray(4);
        Object term8058 = newInstance(Class.forName("java.util.BitSet"));
        long[] term8059 = (long[]) newLongArray(1);
        setField(term8046, term8046.getClass(), "table", term8047);
        setIntField(term8046, term8046.getClass(), "count", -1265226052);
        setIntField(term8046, term8046.getClass(), "threshold", 15);
        setFloatField(term8046, term8046.getClass(), "loadFactor", 0.75F);
        setField(term8045, term8045.getClass(), "posMap", term8046);
        setField(term8045, term8045.getClass(), "graph", null);
        setIntElement(term8051, 0, 1970023149);
        setIntElement(term8051, 1, -336351735);
        setIntElement(term8051, 2, 1938932230);
        setIntElement(term8051, 3, 1128720609);
        setField(term8045, term8045.getClass(), "vertices", term8051);
        setIntField(term8045, term8045.getClass(), "numVertices", 216265002);
        setIntField(term8045, term8045.getClass(), "first", -97405660);
        setField(term8058, term8058.getClass(), "words", term8059);
        setIntField(term8058, term8058.getClass(), "wordsInUse", 872278468);
        setBooleanField(term8058, term8058.getClass(), "sizeIsSticky", false);
        setField(term8045, term8045.getClass(), "bitset", term8058);
        term8063 = new Integer(-1003390920);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8063;
        callMethod(klass, "add", argTypes, term8045, args);
    }

};


