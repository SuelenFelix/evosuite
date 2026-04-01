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

public class Circuit_hashCode_2132006808 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99281;

    public Circuit_hashCode_2132006808() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99281 = newInstance(Class.forName("org.graph4j.util.Circuit"));
        int[] term99283 = (int[]) newIntArray(0);
        Object term99286 = newInstance(Class.forName("java.util.BitSet"));
        long[] term99287 = (long[]) newLongArray(1);
        setIntField(term99281, term99281.getClass(), "numEdges", 206098664);
        setField(term99281, term99281.getClass(), "graph", null);
        setField(term99281, term99281.getClass(), "vertices", term99283);
        setIntField(term99281, term99281.getClass(), "numVertices", 1145017472);
        setIntField(term99281, term99281.getClass(), "first", 2065041254);
        setField(term99286, term99286.getClass(), "words", term99287);
        setIntField(term99286, term99286.getClass(), "wordsInUse", 2066778785);
        setBooleanField(term99286, term99286.getClass(), "sizeIsSticky", false);
        setField(term99281, term99281.getClass(), "bitset", term99286);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Circuit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term99281, args);
    }

};


