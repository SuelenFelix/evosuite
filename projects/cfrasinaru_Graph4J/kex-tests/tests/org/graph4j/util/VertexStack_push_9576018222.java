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

public class VertexStack_push_9576018222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184144;
     Object term184161;

    public VertexStack_push_9576018222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184144 = newInstance(Class.forName("org.graph4j.util.VertexStack"));
        int[] term184145 = (int[]) newIntArray(8);
        Object term184156 = newInstance(Class.forName("java.util.BitSet"));
        long[] term184157 = (long[]) newLongArray(1);
        setField(term184144, term184144.getClass(), "graph", null);
        setIntElement(term184145, 0, 861511308);
        setIntElement(term184145, 1, -430731293);
        setIntElement(term184145, 2, -49129047);
        setIntElement(term184145, 3, 454990136);
        setIntElement(term184145, 4, -1966139482);
        setIntElement(term184145, 5, 1841943468);
        setIntElement(term184145, 6, 1932764056);
        setIntElement(term184145, 7, -49364559);
        setField(term184144, term184144.getClass(), "vertices", term184145);
        setIntField(term184144, term184144.getClass(), "numVertices", 1578230040);
        setIntField(term184144, term184144.getClass(), "first", -1658107535);
        setField(term184156, term184156.getClass(), "words", term184157);
        setIntField(term184156, term184156.getClass(), "wordsInUse", -463452607);
        setBooleanField(term184156, term184156.getClass(), "sizeIsSticky", true);
        setField(term184144, term184144.getClass(), "bitset", term184156);
        term184161 = new Integer(1426120013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexStack");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term184161;
        callMethod(klass, "push", argTypes, term184144, args);
    }

};


