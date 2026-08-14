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

public class Walk_computeEdgesWeight_32091743311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7840;

    public Walk_computeEdgesWeight_32091743311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7840 = newInstance(Class.forName("org.graph4j.util.Walk"));
        int[] term7842 = (int[]) newIntArray(4);
        Object term7849 = newInstance(Class.forName("java.util.BitSet"));
        long[] term7850 = (long[]) newLongArray(1);
        setIntField(term7840, term7840.getClass(), "numEdges", -1552842218);
        setField(term7840, term7840.getClass(), "graph", null);
        setIntElement(term7842, 0, -157220068);
        setIntElement(term7842, 1, 141434141);
        setIntElement(term7842, 2, -288619829);
        setIntElement(term7842, 3, -505635206);
        setField(term7840, term7840.getClass(), "vertices", term7842);
        setIntField(term7840, term7840.getClass(), "numVertices", 932246615);
        setIntField(term7840, term7840.getClass(), "first", 261281668);
        setField(term7849, term7849.getClass(), "words", term7850);
        setIntField(term7849, term7849.getClass(), "wordsInUse", 1712273163);
        setBooleanField(term7849, term7849.getClass(), "sizeIsSticky", true);
        setField(term7840, term7840.getClass(), "bitset", term7849);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Walk");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "computeEdgesWeight", argTypes, term7840, args);
    }

};


