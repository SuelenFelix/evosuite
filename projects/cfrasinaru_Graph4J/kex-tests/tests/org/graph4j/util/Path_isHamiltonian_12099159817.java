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

public class Path_isHamiltonian_12099159817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114425;

    public Path_isHamiltonian_12099159817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114425 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term114427 = (int[]) newIntArray(8);
        Object term114438 = newInstance(Class.forName("java.util.BitSet"));
        long[] term114439 = (long[]) newLongArray(1);
        setIntField(term114425, term114425.getClass(), "numEdges", 1949073511);
        setField(term114425, term114425.getClass(), "graph", null);
        setIntElement(term114427, 0, -1660804748);
        setIntElement(term114427, 1, -1562335326);
        setIntElement(term114427, 2, 337950784);
        setIntElement(term114427, 3, 1067037174);
        setIntElement(term114427, 4, -664843481);
        setIntElement(term114427, 5, 1794725157);
        setIntElement(term114427, 6, -1899127703);
        setIntElement(term114427, 7, -240607840);
        setField(term114425, term114425.getClass(), "vertices", term114427);
        setIntField(term114425, term114425.getClass(), "numVertices", -577900240);
        setIntField(term114425, term114425.getClass(), "first", 275743640);
        setField(term114438, term114438.getClass(), "words", term114439);
        setIntField(term114438, term114438.getClass(), "wordsInUse", 819925760);
        setBooleanField(term114438, term114438.getClass(), "sizeIsSticky", false);
        setField(term114425, term114425.getClass(), "bitset", term114438);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Path");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isHamiltonian", argTypes, term114425, args);
    }

};


