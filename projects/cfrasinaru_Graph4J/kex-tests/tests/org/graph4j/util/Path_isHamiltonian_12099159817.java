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
     Object term6519;

    public Path_isHamiltonian_12099159817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6519 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term6521 = (int[]) newIntArray(0);
        Object term6524 = newInstance(Class.forName("java.util.BitSet"));
        long[] term6525 = (long[]) newLongArray(1);
        setIntField(term6519, term6519.getClass(), "numEdges", 200150950);
        setField(term6519, term6519.getClass(), "graph", null);
        setField(term6519, term6519.getClass(), "vertices", term6521);
        setIntField(term6519, term6519.getClass(), "numVertices", -366198044);
        setIntField(term6519, term6519.getClass(), "first", -1350380769);
        setField(term6524, term6524.getClass(), "words", term6525);
        setIntField(term6524, term6524.getClass(), "wordsInUse", -1432215030);
        setBooleanField(term6524, term6524.getClass(), "sizeIsSticky", true);
        setField(term6519, term6519.getClass(), "bitset", term6524);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Path");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isHamiltonian", argTypes, term6519, args);
    }

};


