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

public class Cycle_computeEdgesWeight_10795254167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57039;

    public Cycle_computeEdgesWeight_10795254167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57039 = newInstance(Class.forName("org.graph4j.util.Cycle"));
        int[] term57041 = (int[]) newIntArray(1);
        Object term57045 = newInstance(Class.forName("java.util.BitSet"));
        long[] term57046 = (long[]) newLongArray(1);
        setIntField(term57039, term57039.getClass(), "numEdges", -776758828);
        setField(term57039, term57039.getClass(), "graph", null);
        setIntElement(term57041, 0, -1084450309);
        setField(term57039, term57039.getClass(), "vertices", term57041);
        setIntField(term57039, term57039.getClass(), "numVertices", -701546274);
        setIntField(term57039, term57039.getClass(), "first", -875355024);
        setField(term57045, term57045.getClass(), "words", term57046);
        setIntField(term57045, term57045.getClass(), "wordsInUse", -741514277);
        setBooleanField(term57045, term57045.getClass(), "sizeIsSticky", false);
        setField(term57039, term57039.getClass(), "bitset", term57045);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Cycle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "computeEdgesWeight", argTypes, term57039, args);
    }

};


