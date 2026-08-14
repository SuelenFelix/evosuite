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
     Object term10553;
     Object term10566;

    public VertexStack_push_9576018222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10553 = newInstance(Class.forName("org.graph4j.util.VertexStack"));
        int[] term10554 = (int[]) newIntArray(4);
        Object term10561 = newInstance(Class.forName("java.util.BitSet"));
        long[] term10562 = (long[]) newLongArray(1);
        setField(term10553, term10553.getClass(), "graph", null);
        setIntElement(term10554, 0, 1968674006);
        setIntElement(term10554, 1, -634536248);
        setIntElement(term10554, 2, 1090329667);
        setIntElement(term10554, 3, -1082123686);
        setField(term10553, term10553.getClass(), "vertices", term10554);
        setIntField(term10553, term10553.getClass(), "numVertices", -991011239);
        setIntField(term10553, term10553.getClass(), "first", -1774267288);
        setField(term10561, term10561.getClass(), "words", term10562);
        setIntField(term10561, term10561.getClass(), "wordsInUse", -1394083316);
        setBooleanField(term10561, term10561.getClass(), "sizeIsSticky", false);
        setField(term10553, term10553.getClass(), "bitset", term10561);
        term10566 = new Integer(23814407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexStack");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term10566;
        callMethod(klass, "push", argTypes, term10553, args);
    }

};


