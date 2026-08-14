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
     Object term4047;

    public Circuit_hashCode_2132006808() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4047 = newInstance(Class.forName("org.graph4j.util.Circuit"));
        int[] term4049 = (int[]) newIntArray(4);
        Object term4056 = newInstance(Class.forName("java.util.BitSet"));
        long[] term4057 = (long[]) newLongArray(1);
        setIntField(term4047, term4047.getClass(), "numEdges", -703815246);
        setField(term4047, term4047.getClass(), "graph", null);
        setIntElement(term4049, 0, 157300746);
        setIntElement(term4049, 1, -1600748613);
        setIntElement(term4049, 2, -1509192782);
        setIntElement(term4049, 3, -867925573);
        setField(term4047, term4047.getClass(), "vertices", term4049);
        setIntField(term4047, term4047.getClass(), "numVertices", 478422495);
        setIntField(term4047, term4047.getClass(), "first", 1727771237);
        setField(term4056, term4056.getClass(), "words", term4057);
        setIntField(term4056, term4056.getClass(), "wordsInUse", 2033663549);
        setBooleanField(term4056, term4056.getClass(), "sizeIsSticky", false);
        setField(term4047, term4047.getClass(), "bitset", term4056);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Circuit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term4047, args);
    }

};


