package org.graph4j.coloring;

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
import static org.graph4j.coloring.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class Coloring_toString_9018528929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2347;

    public Coloring_toString_9018528929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2355 = new HashMap();
        term2347 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term2348 = (int[]) newIntArray(0);
        Object term2350 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2351 = (long[]) newLongArray(1);
        setField(term2347, term2347.getClass(), "graph", null);
        setField(term2347, term2347.getClass(), "vertexColor", term2348);
        setIntField(term2347, term2347.getClass(), "numColoredVertices", 783730213);
        setField(term2350, term2350.getClass(), "words", term2351);
        setIntField(term2350, term2350.getClass(), "wordsInUse", 1815951606);
        setBooleanField(term2350, term2350.getClass(), "sizeIsSticky", true);
        setField(term2347, term2347.getClass(), "usedColors", term2350);
        setField(term2347, term2347.getClass(), "colorMap", term2355);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Coloring");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2347, args);
    }

};


