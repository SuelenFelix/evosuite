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

public class Walk_hashCode_195183821414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7903;

    public Walk_hashCode_195183821414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7903 = newInstance(Class.forName("org.graph4j.util.Walk"));
        int[] term7905 = (int[]) newIntArray(2);
        Object term7910 = newInstance(Class.forName("java.util.BitSet"));
        long[] term7911 = (long[]) newLongArray(1);
        setIntField(term7903, term7903.getClass(), "numEdges", -15085966);
        setField(term7903, term7903.getClass(), "graph", null);
        setIntElement(term7905, 0, -1929631412);
        setIntElement(term7905, 1, 1014160441);
        setField(term7903, term7903.getClass(), "vertices", term7905);
        setIntField(term7903, term7903.getClass(), "numVertices", 975753484);
        setIntField(term7903, term7903.getClass(), "first", -1886360357);
        setField(term7910, term7910.getClass(), "words", term7911);
        setIntField(term7910, term7910.getClass(), "wordsInUse", -235867268);
        setBooleanField(term7910, term7910.getClass(), "sizeIsSticky", true);
        setField(term7903, term7903.getClass(), "bitset", term7910);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Walk");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term7903, args);
    }

};


