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

public class Walk_toString_183236939213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7882;

    public Walk_toString_183236939213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7882 = newInstance(Class.forName("org.graph4j.util.Walk"));
        int[] term7884 = (int[]) newIntArray(5);
        Object term7892 = newInstance(Class.forName("java.util.BitSet"));
        long[] term7893 = (long[]) newLongArray(1);
        setIntField(term7882, term7882.getClass(), "numEdges", 2094923086);
        setField(term7882, term7882.getClass(), "graph", null);
        setIntElement(term7884, 0, 1532355365);
        setIntElement(term7884, 1, -156316508);
        setIntElement(term7884, 2, -1304449497);
        setIntElement(term7884, 3, -80320412);
        setIntElement(term7884, 4, -356797136);
        setField(term7882, term7882.getClass(), "vertices", term7884);
        setIntField(term7882, term7882.getClass(), "numVertices", -2035641970);
        setIntField(term7882, term7882.getClass(), "first", 1813581230);
        setField(term7892, term7892.getClass(), "words", term7893);
        setIntField(term7892, term7892.getClass(), "wordsInUse", 844569461);
        setBooleanField(term7892, term7892.getClass(), "sizeIsSticky", false);
        setField(term7882, term7882.getClass(), "bitset", term7892);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Walk");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term7882, args);
    }

};


