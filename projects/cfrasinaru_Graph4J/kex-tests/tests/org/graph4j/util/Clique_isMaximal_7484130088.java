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

public class Clique_isMaximal_7484130088 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7618;

    public Clique_isMaximal_7484130088() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7618 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term7619 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term7620 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term7624 = (int[]) newIntArray(3);
        Object term7630 = newInstance(Class.forName("java.util.BitSet"));
        long[] term7631 = (long[]) newLongArray(1);
        setField(term7619, term7619.getClass(), "table", term7620);
        setIntField(term7619, term7619.getClass(), "count", 720077443);
        setIntField(term7619, term7619.getClass(), "threshold", 15);
        setFloatField(term7619, term7619.getClass(), "loadFactor", 0.75F);
        setField(term7618, term7618.getClass(), "posMap", term7619);
        setField(term7618, term7618.getClass(), "graph", null);
        setIntElement(term7624, 0, -884523977);
        setIntElement(term7624, 1, -1396233580);
        setIntElement(term7624, 2, -654234892);
        setField(term7618, term7618.getClass(), "vertices", term7624);
        setIntField(term7618, term7618.getClass(), "numVertices", -50930731);
        setIntField(term7618, term7618.getClass(), "first", -1067876039);
        setField(term7630, term7630.getClass(), "words", term7631);
        setIntField(term7630, term7630.getClass(), "wordsInUse", -1143749623);
        setBooleanField(term7630, term7630.getClass(), "sizeIsSticky", true);
        setField(term7618, term7618.getClass(), "bitset", term7630);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Clique");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isMaximal", argTypes, term7618, args);
    }

};


