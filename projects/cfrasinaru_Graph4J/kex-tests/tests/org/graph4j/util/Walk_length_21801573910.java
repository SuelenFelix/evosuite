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

public class Walk_length_21801573910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7827;

    public Walk_length_21801573910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7827 = newInstance(Class.forName("org.graph4j.util.Walk"));
        int[] term7829 = (int[]) newIntArray(1);
        Object term7833 = newInstance(Class.forName("java.util.BitSet"));
        long[] term7834 = (long[]) newLongArray(1);
        setIntField(term7827, term7827.getClass(), "numEdges", -748022064);
        setField(term7827, term7827.getClass(), "graph", null);
        setIntElement(term7829, 0, -1745708025);
        setField(term7827, term7827.getClass(), "vertices", term7829);
        setIntField(term7827, term7827.getClass(), "numVertices", 790614624);
        setIntField(term7827, term7827.getClass(), "first", 117387225);
        setField(term7833, term7833.getClass(), "words", term7834);
        setIntField(term7833, term7833.getClass(), "wordsInUse", 948347134);
        setBooleanField(term7833, term7833.getClass(), "sizeIsSticky", false);
        setField(term7827, term7827.getClass(), "bitset", term7833);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Walk");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "length", argTypes, term7827, args);
    }

};


