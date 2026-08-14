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
     Object term7859;

    public Walk_reverse_176038234712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7859 = newInstance(Class.forName("org.graph4j.util.Walk"));
        int[] term7861 = (int[]) newIntArray(6);
        Object term7870 = newInstance(Class.forName("java.util.BitSet"));
        long[] term7871 = (long[]) newLongArray(1);
        setIntField(term7859, term7859.getClass(), "numEdges", 234306621);
        setField(term7859, term7859.getClass(), "graph", null);
        setIntElement(term7861, 0, 1025525602);
        setIntElement(term7861, 1, 1669406334);
        setIntElement(term7861, 2, -780862464);
        setIntElement(term7861, 3, 2014099129);
        setIntElement(term7861, 4, -1024382698);
        setIntElement(term7861, 5, -168406824);
        setField(term7859, term7859.getClass(), "vertices", term7861);
        setIntField(term7859, term7859.getClass(), "numVertices", 2063577636);
        setIntField(term7859, term7859.getClass(), "first", 1680632578);
        setField(term7870, term7870.getClass(), "words", term7871);
        setIntField(term7870, term7870.getClass(), "wordsInUse", 511399994);
        setBooleanField(term7870, term7870.getClass(), "sizeIsSticky", false);
        setField(term7859, term7859.getClass(), "bitset", term7870);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Walk");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reverse", argTypes, term7859, args);
    }

};


