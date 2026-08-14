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

public class Coloring_getUncoloredVertices_79855202525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2177;

    public Coloring_getUncoloredVertices_79855202525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2190 = new HashMap();
        term2177 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term2178 = (int[]) newIntArray(5);
        Object term2185 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2186 = (long[]) newLongArray(1);
        setField(term2177, term2177.getClass(), "graph", null);
        setIntElement(term2178, 0, -246967963);
        setIntElement(term2178, 1, -1777140369);
        setIntElement(term2178, 2, 993627098);
        setIntElement(term2178, 3, 872295704);
        setIntElement(term2178, 4, 86041387);
        setField(term2177, term2177.getClass(), "vertexColor", term2178);
        setIntField(term2177, term2177.getClass(), "numColoredVertices", 1010721666);
        setField(term2185, term2185.getClass(), "words", term2186);
        setIntField(term2185, term2185.getClass(), "wordsInUse", 27043781);
        setBooleanField(term2185, term2185.getClass(), "sizeIsSticky", false);
        setField(term2177, term2177.getClass(), "usedColors", term2185);
        setField(term2177, term2177.getClass(), "colorMap", term2190);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Coloring");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUncoloredVertices", argTypes, term2177, args);
    }

};


