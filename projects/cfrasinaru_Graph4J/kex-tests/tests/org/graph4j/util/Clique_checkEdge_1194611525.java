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

public class Clique_checkEdge_1194611525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7559;
     Object term7574;
     Object term7576;

    public Clique_checkEdge_1194611525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7559 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term7560 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term7561 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term7565 = (int[]) newIntArray(1);
        Object term7569 = newInstance(Class.forName("java.util.BitSet"));
        long[] term7570 = (long[]) newLongArray(1);
        setField(term7560, term7560.getClass(), "table", term7561);
        setIntField(term7560, term7560.getClass(), "count", 1452346261);
        setIntField(term7560, term7560.getClass(), "threshold", 15);
        setFloatField(term7560, term7560.getClass(), "loadFactor", 0.75F);
        setField(term7559, term7559.getClass(), "posMap", term7560);
        setField(term7559, term7559.getClass(), "graph", null);
        setIntElement(term7565, 0, -548776693);
        setField(term7559, term7559.getClass(), "vertices", term7565);
        setIntField(term7559, term7559.getClass(), "numVertices", 99032275);
        setIntField(term7559, term7559.getClass(), "first", 794098686);
        setField(term7569, term7569.getClass(), "words", term7570);
        setIntField(term7569, term7569.getClass(), "wordsInUse", -1671524013);
        setBooleanField(term7569, term7569.getClass(), "sizeIsSticky", true);
        setField(term7559, term7559.getClass(), "bitset", term7569);
        term7574 = new Integer(-438794741);
        term7576 = new Integer(-1400834481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Clique");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term7574;
        args[1] = term7576;
        callMethod(klass, "checkEdge", argTypes, term7559, args);
    }

};


