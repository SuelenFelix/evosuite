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

public class Clique_isValid_8243886477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7595;

    public Clique_isValid_8243886477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7595 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term7596 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term7597 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term7601 = (int[]) newIntArray(4);
        Object term7608 = newInstance(Class.forName("java.util.BitSet"));
        long[] term7609 = (long[]) newLongArray(1);
        setField(term7596, term7596.getClass(), "table", term7597);
        setIntField(term7596, term7596.getClass(), "count", 831638391);
        setIntField(term7596, term7596.getClass(), "threshold", 15);
        setFloatField(term7596, term7596.getClass(), "loadFactor", 0.75F);
        setField(term7595, term7595.getClass(), "posMap", term7596);
        setField(term7595, term7595.getClass(), "graph", null);
        setIntElement(term7601, 0, -1184374392);
        setIntElement(term7601, 1, -758870402);
        setIntElement(term7601, 2, 72767889);
        setIntElement(term7601, 3, 1699515029);
        setField(term7595, term7595.getClass(), "vertices", term7601);
        setIntField(term7595, term7595.getClass(), "numVertices", 673153263);
        setIntField(term7595, term7595.getClass(), "first", -1355715967);
        setField(term7608, term7608.getClass(), "words", term7609);
        setIntField(term7608, term7608.getClass(), "wordsInUse", -972516789);
        setBooleanField(term7608, term7608.getClass(), "sizeIsSticky", false);
        setField(term7595, term7595.getClass(), "bitset", term7608);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Clique");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isValid", argTypes, term7595, args);
    }

};


