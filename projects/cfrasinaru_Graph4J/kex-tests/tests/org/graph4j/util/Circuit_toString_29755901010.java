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
     Object term99306;

    public Circuit_toString_29755901010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99306 = newInstance(Class.forName("org.graph4j.util.Circuit"));
        int[] term99308 = (int[]) newIntArray(5);
        Object term99316 = newInstance(Class.forName("java.util.BitSet"));
        long[] term99317 = (long[]) newLongArray(1);
        setIntField(term99306, term99306.getClass(), "numEdges", -2141739997);
        setField(term99306, term99306.getClass(), "graph", null);
        setIntElement(term99308, 0, 1174212845);
        setIntElement(term99308, 1, -836471847);
        setIntElement(term99308, 2, -393198178);
        setIntElement(term99308, 3, 1492611616);
        setIntElement(term99308, 4, 1159845482);
        setField(term99306, term99306.getClass(), "vertices", term99308);
        setIntField(term99306, term99306.getClass(), "numVertices", -1320493702);
        setIntField(term99306, term99306.getClass(), "first", 352279226);
        setField(term99316, term99316.getClass(), "words", term99317);
        setIntField(term99316, term99316.getClass(), "wordsInUse", -405922040);
        setBooleanField(term99316, term99316.getClass(), "sizeIsSticky", true);
        setField(term99306, term99306.getClass(), "bitset", term99316);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Circuit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term99306, args);
    }

};


