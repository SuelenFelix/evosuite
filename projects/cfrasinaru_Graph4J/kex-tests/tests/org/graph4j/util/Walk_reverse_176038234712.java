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

public class Walk_reverse_176038234712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143969;

    public Walk_reverse_176038234712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143969 = newInstance(Class.forName("org.graph4j.util.Walk"));
        int[] term143971 = (int[]) newIntArray(0);
        Object term143974 = newInstance(Class.forName("java.util.BitSet"));
        long[] term143975 = (long[]) newLongArray(1);
        setIntField(term143969, term143969.getClass(), "numEdges", 1831623334);
        setField(term143969, term143969.getClass(), "graph", null);
        setField(term143969, term143969.getClass(), "vertices", term143971);
        setIntField(term143969, term143969.getClass(), "numVertices", 1922395096);
        setIntField(term143969, term143969.getClass(), "first", -997369789);
        setField(term143974, term143974.getClass(), "words", term143975);
        setIntField(term143974, term143974.getClass(), "wordsInUse", -99672429);
        setBooleanField(term143974, term143974.getClass(), "sizeIsSticky", true);
        setField(term143969, term143969.getClass(), "bitset", term143974);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Walk");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reverse", argTypes, term143969, args);
    }

};


