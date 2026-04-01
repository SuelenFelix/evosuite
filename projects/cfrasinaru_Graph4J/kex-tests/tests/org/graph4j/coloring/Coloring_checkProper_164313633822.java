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

public class Coloring_checkProper_164313633822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2103;

    public Coloring_checkProper_164313633822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2111 = new HashMap();
        term2103 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term2104 = (int[]) newIntArray(0);
        Object term2106 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2107 = (long[]) newLongArray(1);
        setField(term2103, term2103.getClass(), "graph", null);
        setField(term2103, term2103.getClass(), "vertexColor", term2104);
        setIntField(term2103, term2103.getClass(), "numColoredVertices", -270592367);
        setField(term2106, term2106.getClass(), "words", term2107);
        setIntField(term2106, term2106.getClass(), "wordsInUse", 178847646);
        setBooleanField(term2106, term2106.getClass(), "sizeIsSticky", true);
        setField(term2103, term2103.getClass(), "usedColors", term2106);
        setField(term2103, term2103.getClass(), "colorMap", term2111);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Coloring");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkProper", argTypes, term2103, args);
    }

};


