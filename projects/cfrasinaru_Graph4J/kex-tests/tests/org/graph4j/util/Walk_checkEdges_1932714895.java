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

public class Walk_checkEdges_1932714895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143826;

    public Walk_checkEdges_1932714895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143826 = newInstance(Class.forName("org.graph4j.util.Walk"));
        int[] term143828 = (int[]) newIntArray(3);
        Object term143834 = newInstance(Class.forName("java.util.BitSet"));
        long[] term143835 = (long[]) newLongArray(1);
        setIntField(term143826, term143826.getClass(), "numEdges", 390278013);
        setField(term143826, term143826.getClass(), "graph", null);
        setIntElement(term143828, 0, -1896538459);
        setIntElement(term143828, 1, 173848573);
        setIntElement(term143828, 2, -701725343);
        setField(term143826, term143826.getClass(), "vertices", term143828);
        setIntField(term143826, term143826.getClass(), "numVertices", -110372496);
        setIntField(term143826, term143826.getClass(), "first", -518555915);
        setField(term143834, term143834.getClass(), "words", term143835);
        setIntField(term143834, term143834.getClass(), "wordsInUse", -2066845932);
        setBooleanField(term143834, term143834.getClass(), "sizeIsSticky", false);
        setField(term143826, term143826.getClass(), "bitset", term143834);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Walk");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkEdges", argTypes, term143826, args);
    }

};


