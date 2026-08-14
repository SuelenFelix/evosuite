package org.graph4j.coloring;

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
import static org.graph4j.coloring.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class Coloring_isEmpty_198560543118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1955;

    public Coloring_isEmpty_198560543118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1972 = new HashMap();
        term1955 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term1956 = (int[]) newIntArray(9);
        Object term1967 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1968 = (long[]) newLongArray(1);
        setField(term1955, term1955.getClass(), "graph", null);
        setIntElement(term1956, 0, 5603560);
        setIntElement(term1956, 1, -1079020032);
        setIntElement(term1956, 2, -1973791064);
        setIntElement(term1956, 3, -2072158633);
        setIntElement(term1956, 4, -355469363);
        setIntElement(term1956, 5, 1465188553);
        setIntElement(term1956, 6, 1633913667);
        setIntElement(term1956, 7, 1292332296);
        setIntElement(term1956, 8, -1415256843);
        setField(term1955, term1955.getClass(), "vertexColor", term1956);
        setIntField(term1955, term1955.getClass(), "numColoredVertices", 612177768);
        setField(term1967, term1967.getClass(), "words", term1968);
        setIntField(term1967, term1967.getClass(), "wordsInUse", -1626451656);
        setBooleanField(term1967, term1967.getClass(), "sizeIsSticky", false);
        setField(term1955, term1955.getClass(), "usedColors", term1967);
        setField(term1955, term1955.getClass(), "colorMap", term1972);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Coloring");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEmpty", argTypes, term1955, args);
    }

};


