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
     Object term99292;
     Object term99303;

    public Circuit_equals_6618873559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99292 = newInstance(Class.forName("org.graph4j.util.Circuit"));
        int[] term99294 = (int[]) newIntArray(1);
        Object term99298 = newInstance(Class.forName("java.util.BitSet"));
        long[] term99299 = (long[]) newLongArray(1);
        setIntField(term99292, term99292.getClass(), "numEdges", -1664190515);
        setField(term99292, term99292.getClass(), "graph", null);
        setIntElement(term99294, 0, 580491493);
        setField(term99292, term99292.getClass(), "vertices", term99294);
        setIntField(term99292, term99292.getClass(), "numVertices", 387297918);
        setIntField(term99292, term99292.getClass(), "first", -1932797129);
        setField(term99298, term99298.getClass(), "words", term99299);
        setIntField(term99298, term99298.getClass(), "wordsInUse", 58661935);
        setBooleanField(term99298, term99298.getClass(), "sizeIsSticky", true);
        setField(term99292, term99292.getClass(), "bitset", term99298);
        term99303 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Circuit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term99303;
        callMethod(klass, "equals", argTypes, term99292, args);
    }

};


