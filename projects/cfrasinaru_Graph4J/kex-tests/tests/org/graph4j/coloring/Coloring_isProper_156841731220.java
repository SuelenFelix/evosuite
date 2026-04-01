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

public class Coloring_isProper_156841731220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2031;

    public Coloring_isProper_156841731220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2048 = new HashMap();
        term2031 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term2032 = (int[]) newIntArray(9);
        Object term2043 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2044 = (long[]) newLongArray(1);
        setField(term2031, term2031.getClass(), "graph", null);
        setIntElement(term2032, 0, -457396133);
        setIntElement(term2032, 1, -1793950607);
        setIntElement(term2032, 2, 1091954101);
        setIntElement(term2032, 3, 1895143076);
        setIntElement(term2032, 4, 1981860404);
        setIntElement(term2032, 5, 732174235);
        setIntElement(term2032, 6, 470895808);
        setIntElement(term2032, 7, 1787325291);
        setIntElement(term2032, 8, 1470349147);
        setField(term2031, term2031.getClass(), "vertexColor", term2032);
        setIntField(term2031, term2031.getClass(), "numColoredVertices", -255317272);
        setField(term2043, term2043.getClass(), "words", term2044);
        setIntField(term2043, term2043.getClass(), "wordsInUse", -706253892);
        setBooleanField(term2043, term2043.getClass(), "sizeIsSticky", true);
        setField(term2031, term2031.getClass(), "usedColors", term2043);
        setField(term2031, term2031.getClass(), "colorMap", term2048);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Coloring");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isProper", argTypes, term2031, args);
    }

};


