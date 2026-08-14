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

public class Path_isValid_17855611095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6489;

    public Path_isValid_17855611095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6489 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term6491 = (int[]) newIntArray(1);
        Object term6495 = newInstance(Class.forName("java.util.BitSet"));
        long[] term6496 = (long[]) newLongArray(1);
        setIntField(term6489, term6489.getClass(), "numEdges", 383244929);
        setField(term6489, term6489.getClass(), "graph", null);
        setIntElement(term6491, 0, -2114034003);
        setField(term6489, term6489.getClass(), "vertices", term6491);
        setIntField(term6489, term6489.getClass(), "numVertices", 207213904);
        setIntField(term6489, term6489.getClass(), "first", -484303394);
        setField(term6495, term6495.getClass(), "words", term6496);
        setIntField(term6495, term6495.getClass(), "wordsInUse", -31125530);
        setBooleanField(term6495, term6495.getClass(), "sizeIsSticky", false);
        setField(term6489, term6489.getClass(), "bitset", term6495);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Path");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isValid", argTypes, term6489, args);
    }

};


