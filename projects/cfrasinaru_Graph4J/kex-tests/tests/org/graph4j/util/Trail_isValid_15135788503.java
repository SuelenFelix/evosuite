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

public class Trail_isValid_15135788503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100371;

    public Trail_isValid_15135788503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100371 = newInstance(Class.forName("org.graph4j.util.Trail"));
        int[] term100373 = (int[]) newIntArray(8);
        Object term100384 = newInstance(Class.forName("java.util.BitSet"));
        long[] term100385 = (long[]) newLongArray(1);
        setIntField(term100371, term100371.getClass(), "numEdges", 694255273);
        setField(term100371, term100371.getClass(), "graph", null);
        setIntElement(term100373, 0, 1611637924);
        setIntElement(term100373, 1, 936243753);
        setIntElement(term100373, 2, -803028984);
        setIntElement(term100373, 3, 1233951453);
        setIntElement(term100373, 4, -210141931);
        setIntElement(term100373, 5, 1459050716);
        setIntElement(term100373, 6, -1995664477);
        setIntElement(term100373, 7, 1563502930);
        setField(term100371, term100371.getClass(), "vertices", term100373);
        setIntField(term100371, term100371.getClass(), "numVertices", -1763493297);
        setIntField(term100371, term100371.getClass(), "first", 1559779370);
        setField(term100384, term100384.getClass(), "words", term100385);
        setIntField(term100384, term100384.getClass(), "wordsInUse", 369095015);
        setBooleanField(term100384, term100384.getClass(), "sizeIsSticky", true);
        setField(term100371, term100371.getClass(), "bitset", term100384);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Trail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isValid", argTypes, term100371, args);
    }

};


