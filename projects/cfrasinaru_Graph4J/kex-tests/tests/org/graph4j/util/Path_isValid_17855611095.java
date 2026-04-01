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

public class Path_isValid_17855611095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114381;

    public Path_isValid_17855611095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114381 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term114383 = (int[]) newIntArray(9);
        Object term114395 = newInstance(Class.forName("java.util.BitSet"));
        long[] term114396 = (long[]) newLongArray(1);
        setIntField(term114381, term114381.getClass(), "numEdges", 2033724505);
        setField(term114381, term114381.getClass(), "graph", null);
        setIntElement(term114383, 0, -2054176226);
        setIntElement(term114383, 1, 325249402);
        setIntElement(term114383, 2, -486452301);
        setIntElement(term114383, 3, 1061778672);
        setIntElement(term114383, 4, 165022693);
        setIntElement(term114383, 5, 1781517788);
        setIntElement(term114383, 6, 645022978);
        setIntElement(term114383, 7, -1808329703);
        setIntElement(term114383, 8, 1099465560);
        setField(term114381, term114381.getClass(), "vertices", term114383);
        setIntField(term114381, term114381.getClass(), "numVertices", 1339922922);
        setIntField(term114381, term114381.getClass(), "first", 651953835);
        setField(term114395, term114395.getClass(), "words", term114396);
        setIntField(term114395, term114395.getClass(), "wordsInUse", -375199942);
        setBooleanField(term114395, term114395.getClass(), "sizeIsSticky", false);
        setField(term114381, term114381.getClass(), "bitset", term114395);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Path");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isValid", argTypes, term114381, args);
    }

};


