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

public class Coloring_checkEquitable_138094867223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2125;

    public Coloring_checkEquitable_138094867223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2136 = new HashMap();
        term2125 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term2126 = (int[]) newIntArray(3);
        Object term2131 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2132 = (long[]) newLongArray(1);
        setField(term2125, term2125.getClass(), "graph", null);
        setIntElement(term2126, 0, 718742281);
        setIntElement(term2126, 1, 1532723756);
        setIntElement(term2126, 2, -124088550);
        setField(term2125, term2125.getClass(), "vertexColor", term2126);
        setIntField(term2125, term2125.getClass(), "numColoredVertices", 777492093);
        setField(term2131, term2131.getClass(), "words", term2132);
        setIntField(term2131, term2131.getClass(), "wordsInUse", 1414025609);
        setBooleanField(term2131, term2131.getClass(), "sizeIsSticky", true);
        setField(term2125, term2125.getClass(), "usedColors", term2131);
        setField(term2125, term2125.getClass(), "colorMap", term2136);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Coloring");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkEquitable", argTypes, term2125, args);
    }

};


