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

public class Walk_isValid_17920181616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143843;

    public Walk_isValid_17920181616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143843 = newInstance(Class.forName("org.graph4j.util.Walk"));
        int[] term143845 = (int[]) newIntArray(8);
        Object term143856 = newInstance(Class.forName("java.util.BitSet"));
        long[] term143857 = (long[]) newLongArray(1);
        setIntField(term143843, term143843.getClass(), "numEdges", -1754471169);
        setField(term143843, term143843.getClass(), "graph", null);
        setIntElement(term143845, 0, 1565022317);
        setIntElement(term143845, 1, 1248740189);
        setIntElement(term143845, 2, 659022515);
        setIntElement(term143845, 3, -1988721685);
        setIntElement(term143845, 4, -1437021858);
        setIntElement(term143845, 5, 1986039979);
        setIntElement(term143845, 6, 349252755);
        setIntElement(term143845, 7, -1541327371);
        setField(term143843, term143843.getClass(), "vertices", term143845);
        setIntField(term143843, term143843.getClass(), "numVertices", -247561161);
        setIntField(term143843, term143843.getClass(), "first", -1984307867);
        setField(term143856, term143856.getClass(), "words", term143857);
        setIntField(term143856, term143856.getClass(), "wordsInUse", 1557165301);
        setBooleanField(term143856, term143856.getClass(), "sizeIsSticky", true);
        setField(term143843, term143843.getClass(), "bitset", term143856);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Walk");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isValid", argTypes, term143843, args);
    }

};


