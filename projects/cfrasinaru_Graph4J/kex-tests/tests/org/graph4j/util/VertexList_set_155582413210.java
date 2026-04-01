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

public class VertexList_set_155582413210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66447;
     Object term66458;
     Object term66460;

    public VertexList_set_155582413210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66447 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        int[] term66448 = (int[]) newIntArray(2);
        Object term66453 = newInstance(Class.forName("java.util.BitSet"));
        long[] term66454 = (long[]) newLongArray(1);
        setField(term66447, term66447.getClass(), "graph", null);
        setIntElement(term66448, 0, 1854710669);
        setIntElement(term66448, 1, 40267213);
        setField(term66447, term66447.getClass(), "vertices", term66448);
        setIntField(term66447, term66447.getClass(), "numVertices", 2130886056);
        setIntField(term66447, term66447.getClass(), "first", 978478352);
        setField(term66453, term66453.getClass(), "words", term66454);
        setIntField(term66453, term66453.getClass(), "wordsInUse", -269052266);
        setBooleanField(term66453, term66453.getClass(), "sizeIsSticky", false);
        setField(term66447, term66447.getClass(), "bitset", term66453);
        term66458 = new Integer(-1776892844);
        term66460 = new Integer(2113526092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term66458;
        args[1] = term66460;
        callMethod(klass, "set", argTypes, term66447, args);
    }

};


