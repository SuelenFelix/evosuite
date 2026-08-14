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

public class Circuit_toString_29755901010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4096;

    public Circuit_toString_29755901010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4096 = newInstance(Class.forName("org.graph4j.util.Circuit"));
        int[] term4098 = (int[]) newIntArray(4);
        Object term4105 = newInstance(Class.forName("java.util.BitSet"));
        long[] term4106 = (long[]) newLongArray(1);
        setIntField(term4096, term4096.getClass(), "numEdges", -298939768);
        setField(term4096, term4096.getClass(), "graph", null);
        setIntElement(term4098, 0, -767031634);
        setIntElement(term4098, 1, -2072469750);
        setIntElement(term4098, 2, 2106616847);
        setIntElement(term4098, 3, 403107947);
        setField(term4096, term4096.getClass(), "vertices", term4098);
        setIntField(term4096, term4096.getClass(), "numVertices", -1433815725);
        setIntField(term4096, term4096.getClass(), "first", -1445089135);
        setField(term4105, term4105.getClass(), "words", term4106);
        setIntField(term4105, term4105.getClass(), "wordsInUse", -291618851);
        setBooleanField(term4105, term4105.getClass(), "sizeIsSticky", true);
        setField(term4096, term4096.getClass(), "bitset", term4105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Circuit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4096, args);
    }

};


