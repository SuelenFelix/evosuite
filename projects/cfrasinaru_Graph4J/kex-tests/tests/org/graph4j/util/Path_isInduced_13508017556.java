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

public class Path_isInduced_13508017556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114410;

    public Path_isInduced_13508017556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114410 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term114412 = (int[]) newIntArray(2);
        Object term114417 = newInstance(Class.forName("java.util.BitSet"));
        long[] term114418 = (long[]) newLongArray(1);
        setIntField(term114410, term114410.getClass(), "numEdges", -1715923424);
        setField(term114410, term114410.getClass(), "graph", null);
        setIntElement(term114412, 0, -910580480);
        setIntElement(term114412, 1, -526438792);
        setField(term114410, term114410.getClass(), "vertices", term114412);
        setIntField(term114410, term114410.getClass(), "numVertices", -1621172613);
        setIntField(term114410, term114410.getClass(), "first", 2090369238);
        setField(term114417, term114417.getClass(), "words", term114418);
        setIntField(term114417, term114417.getClass(), "wordsInUse", -264474773);
        setBooleanField(term114417, term114417.getClass(), "sizeIsSticky", false);
        setField(term114410, term114410.getClass(), "bitset", term114417);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Path");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isInduced", argTypes, term114410, args);
    }

};


