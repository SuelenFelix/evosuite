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

public class Path_lastVertex_15705986274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114362;

    public Path_lastVertex_15705986274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114362 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term114364 = (int[]) newIntArray(4);
        Object term114371 = newInstance(Class.forName("java.util.BitSet"));
        long[] term114372 = (long[]) newLongArray(1);
        setIntField(term114362, term114362.getClass(), "numEdges", -1211372155);
        setField(term114362, term114362.getClass(), "graph", null);
        setIntElement(term114364, 0, 1033626497);
        setIntElement(term114364, 1, -189684537);
        setIntElement(term114364, 2, -1861676984);
        setIntElement(term114364, 3, 489057847);
        setField(term114362, term114362.getClass(), "vertices", term114364);
        setIntField(term114362, term114362.getClass(), "numVertices", 2012524773);
        setIntField(term114362, term114362.getClass(), "first", -622682683);
        setField(term114371, term114371.getClass(), "words", term114372);
        setIntField(term114371, term114371.getClass(), "wordsInUse", -1007946709);
        setBooleanField(term114371, term114371.getClass(), "sizeIsSticky", false);
        setField(term114362, term114362.getClass(), "bitset", term114371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Path");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "lastVertex", argTypes, term114362, args);
    }

};


