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

public class Circuit_equals_6618873559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4066;
     Object term4085;

    public Circuit_equals_6618873559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4066 = newInstance(Class.forName("org.graph4j.util.Circuit"));
        int[] term4068 = (int[]) newIntArray(9);
        Object term4080 = newInstance(Class.forName("java.util.BitSet"));
        long[] term4081 = (long[]) newLongArray(1);
        setIntField(term4066, term4066.getClass(), "numEdges", 1766479154);
        setField(term4066, term4066.getClass(), "graph", null);
        setIntElement(term4068, 0, 533171496);
        setIntElement(term4068, 1, 1369020869);
        setIntElement(term4068, 2, -1428947021);
        setIntElement(term4068, 3, -134324004);
        setIntElement(term4068, 4, -1813266173);
        setIntElement(term4068, 5, -1201819537);
        setIntElement(term4068, 6, 2135922049);
        setIntElement(term4068, 7, -263876378);
        setIntElement(term4068, 8, -755209283);
        setField(term4066, term4066.getClass(), "vertices", term4068);
        setIntField(term4066, term4066.getClass(), "numVertices", -616562794);
        setIntField(term4066, term4066.getClass(), "first", 750084083);
        setField(term4080, term4080.getClass(), "words", term4081);
        setIntField(term4080, term4080.getClass(), "wordsInUse", -1603460382);
        setBooleanField(term4080, term4080.getClass(), "sizeIsSticky", true);
        setField(term4066, term4066.getClass(), "bitset", term4080);
        term4085 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Circuit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4085;
        callMethod(klass, "equals", argTypes, term4066, args);
    }

};


