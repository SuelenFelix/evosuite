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

public class Coloring_isEquitable_130305837821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2071;

    public Coloring_isEquitable_130305837821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2084 = new HashMap();
        term2071 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term2072 = (int[]) newIntArray(5);
        Object term2079 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2080 = (long[]) newLongArray(1);
        setField(term2071, term2071.getClass(), "graph", null);
        setIntElement(term2072, 0, -885788574);
        setIntElement(term2072, 1, -865722613);
        setIntElement(term2072, 2, -1551355284);
        setIntElement(term2072, 3, -1381970335);
        setIntElement(term2072, 4, 1213549815);
        setField(term2071, term2071.getClass(), "vertexColor", term2072);
        setIntField(term2071, term2071.getClass(), "numColoredVertices", -1518419301);
        setField(term2079, term2079.getClass(), "words", term2080);
        setIntField(term2079, term2079.getClass(), "wordsInUse", 674879025);
        setBooleanField(term2079, term2079.getClass(), "sizeIsSticky", false);
        setField(term2071, term2071.getClass(), "usedColors", term2079);
        setField(term2071, term2071.getClass(), "colorMap", term2084);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Coloring");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEquitable", argTypes, term2071, args);
    }

};


