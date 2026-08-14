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

public class Cycle_equals_203320777410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57075;
     Object term57085;

    public Cycle_equals_203320777410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57075 = newInstance(Class.forName("org.graph4j.util.Cycle"));
        int[] term57077 = (int[]) newIntArray(0);
        Object term57080 = newInstance(Class.forName("java.util.BitSet"));
        long[] term57081 = (long[]) newLongArray(1);
        setIntField(term57075, term57075.getClass(), "numEdges", 499139452);
        setField(term57075, term57075.getClass(), "graph", null);
        setField(term57075, term57075.getClass(), "vertices", term57077);
        setIntField(term57075, term57075.getClass(), "numVertices", -471563064);
        setIntField(term57075, term57075.getClass(), "first", -1803846804);
        setField(term57080, term57080.getClass(), "words", term57081);
        setIntField(term57080, term57080.getClass(), "wordsInUse", 1011728980);
        setBooleanField(term57080, term57080.getClass(), "sizeIsSticky", true);
        setField(term57075, term57075.getClass(), "bitset", term57080);
        term57085 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Cycle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term57085;
        callMethod(klass, "equals", argTypes, term57075, args);
    }

};


