package org.graph4j.traversal;

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
import static org.graph4j.traversal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TopologicalOrderIterator_init_7877154731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2198;

    public TopologicalOrderIterator_init_7877154731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2198 = newInstance(Class.forName("org.graph4j.traversal.TopologicalOrderIterator"));
        int[] term2200 = (int[]) newIntArray(4);
        int[] term2205 = (int[]) newIntArray(1);
        Object term2207 = newInstance(Class.forName("org.graph4j.util.VertexQueue"));
        int[] term2208 = (int[]) newIntArray(1);
        Object term2212 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2213 = (long[]) newLongArray(1);
        setField(term2198, term2198.getClass(), "graph", null);
        setBooleanField(term2198, term2198.getClass(), "computeLevels", false);
        setIntElement(term2200, 0, 318982923);
        setIntElement(term2200, 1, -154210001);
        setIntElement(term2200, 2, 621910137);
        setIntElement(term2200, 3, 241533020);
        setField(term2198, term2198.getClass(), "indegrees", term2200);
        setIntElement(term2205, 0, 2081679151);
        setField(term2198, term2198.getClass(), "levels", term2205);
        setField(term2207, term2207.getClass(), "graph", null);
        setIntElement(term2208, 0, -1030167086);
        setField(term2207, term2207.getClass(), "vertices", term2208);
        setIntField(term2207, term2207.getClass(), "numVertices", -434230943);
        setIntField(term2207, term2207.getClass(), "first", 698633875);
        setField(term2212, term2212.getClass(), "words", term2213);
        setIntField(term2212, term2212.getClass(), "wordsInUse", 548468113);
        setBooleanField(term2212, term2212.getClass(), "sizeIsSticky", false);
        setField(term2207, term2207.getClass(), "bitset", term2212);
        setField(term2198, term2198.getClass(), "queue", term2207);
        setIntField(term2198, term2198.getClass(), "currentVertex", 1701819905);
        setIntField(term2198, term2198.getClass(), "counter", 1721418943);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.TopologicalOrderIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "init", argTypes, term2198, args);
    }

};


