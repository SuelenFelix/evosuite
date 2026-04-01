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
import java.lang.Integer;

public class Walk_add_20617558067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143870;
     Object term143886;

    public Walk_add_20617558067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143870 = newInstance(Class.forName("org.graph4j.util.Walk"));
        int[] term143872 = (int[]) newIntArray(6);
        Object term143881 = newInstance(Class.forName("java.util.BitSet"));
        long[] term143882 = (long[]) newLongArray(1);
        setIntField(term143870, term143870.getClass(), "numEdges", 329292695);
        setField(term143870, term143870.getClass(), "graph", null);
        setIntElement(term143872, 0, -1189604225);
        setIntElement(term143872, 1, 2036545020);
        setIntElement(term143872, 2, 1327606982);
        setIntElement(term143872, 3, 688569158);
        setIntElement(term143872, 4, -2013136370);
        setIntElement(term143872, 5, -2095751104);
        setField(term143870, term143870.getClass(), "vertices", term143872);
        setIntField(term143870, term143870.getClass(), "numVertices", -1712503299);
        setIntField(term143870, term143870.getClass(), "first", -1398907893);
        setField(term143881, term143881.getClass(), "words", term143882);
        setIntField(term143881, term143881.getClass(), "wordsInUse", -119786985);
        setBooleanField(term143881, term143881.getClass(), "sizeIsSticky", false);
        setField(term143870, term143870.getClass(), "bitset", term143881);
        term143886 = new Integer(-1287796201);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Walk");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term143886;
        callMethod(klass, "add", argTypes, term143870, args);
    }

};


