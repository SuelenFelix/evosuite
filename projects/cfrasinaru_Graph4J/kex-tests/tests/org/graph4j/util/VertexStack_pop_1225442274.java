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

public class VertexStack_pop_1225442274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184198;

    public VertexStack_pop_1225442274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184198 = newInstance(Class.forName("org.graph4j.util.VertexStack"));
        int[] term184199 = (int[]) newIntArray(1);
        Object term184203 = newInstance(Class.forName("java.util.BitSet"));
        long[] term184204 = (long[]) newLongArray(1);
        setField(term184198, term184198.getClass(), "graph", null);
        setIntElement(term184199, 0, 1147606004);
        setField(term184198, term184198.getClass(), "vertices", term184199);
        setIntField(term184198, term184198.getClass(), "numVertices", 1468271491);
        setIntField(term184198, term184198.getClass(), "first", 1767277665);
        setField(term184203, term184203.getClass(), "words", term184204);
        setIntField(term184203, term184203.getClass(), "wordsInUse", -585906537);
        setBooleanField(term184203, term184203.getClass(), "sizeIsSticky", false);
        setField(term184198, term184198.getClass(), "bitset", term184203);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexStack");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "pop", argTypes, term184198, args);
    }

};


