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

public class VertexList_removeFromPos_5130836504 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66330;
     Object term66342;

    public VertexList_removeFromPos_5130836504() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66330 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        int[] term66331 = (int[]) newIntArray(3);
        Object term66337 = newInstance(Class.forName("java.util.BitSet"));
        long[] term66338 = (long[]) newLongArray(1);
        setField(term66330, term66330.getClass(), "graph", null);
        setIntElement(term66331, 0, 1540630124);
        setIntElement(term66331, 1, -1537736801);
        setIntElement(term66331, 2, -766206861);
        setField(term66330, term66330.getClass(), "vertices", term66331);
        setIntField(term66330, term66330.getClass(), "numVertices", 1576414103);
        setIntField(term66330, term66330.getClass(), "first", 891075650);
        setField(term66337, term66337.getClass(), "words", term66338);
        setIntField(term66337, term66337.getClass(), "wordsInUse", 456541378);
        setBooleanField(term66337, term66337.getClass(), "sizeIsSticky", true);
        setField(term66330, term66330.getClass(), "bitset", term66337);
        term66342 = new Integer(-1836224314);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term66342;
        callMethod(klass, "removeFromPos", argTypes, term66330, args);
    }

};


