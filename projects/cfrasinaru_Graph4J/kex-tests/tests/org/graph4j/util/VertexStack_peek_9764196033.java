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

public class VertexStack_peek_9764196033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184172;

    public VertexStack_peek_9764196033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184172 = newInstance(Class.forName("org.graph4j.util.VertexStack"));
        int[] term184173 = (int[]) newIntArray(8);
        Object term184184 = newInstance(Class.forName("java.util.BitSet"));
        long[] term184185 = (long[]) newLongArray(1);
        setField(term184172, term184172.getClass(), "graph", null);
        setIntElement(term184173, 0, -1256058713);
        setIntElement(term184173, 1, 1015884107);
        setIntElement(term184173, 2, 799172471);
        setIntElement(term184173, 3, 1940610573);
        setIntElement(term184173, 4, -1848190370);
        setIntElement(term184173, 5, -282737075);
        setIntElement(term184173, 6, 526797810);
        setIntElement(term184173, 7, 1358864874);
        setField(term184172, term184172.getClass(), "vertices", term184173);
        setIntField(term184172, term184172.getClass(), "numVertices", -2043467870);
        setIntField(term184172, term184172.getClass(), "first", -746792436);
        setField(term184184, term184184.getClass(), "words", term184185);
        setIntField(term184184, term184184.getClass(), "wordsInUse", 395515526);
        setBooleanField(term184184, term184184.getClass(), "sizeIsSticky", false);
        setField(term184172, term184172.getClass(), "bitset", term184184);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexStack");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "peek", argTypes, term184172, args);
    }

};


