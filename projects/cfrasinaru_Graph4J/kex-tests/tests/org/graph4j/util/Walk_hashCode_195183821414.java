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
     Object term144009;

    public Walk_hashCode_195183821414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144009 = newInstance(Class.forName("org.graph4j.util.Walk"));
        int[] term144011 = (int[]) newIntArray(0);
        Object term144014 = newInstance(Class.forName("java.util.BitSet"));
        long[] term144015 = (long[]) newLongArray(1);
        setIntField(term144009, term144009.getClass(), "numEdges", -1982710986);
        setField(term144009, term144009.getClass(), "graph", null);
        setField(term144009, term144009.getClass(), "vertices", term144011);
        setIntField(term144009, term144009.getClass(), "numVertices", 1153914416);
        setIntField(term144009, term144009.getClass(), "first", 2039315679);
        setField(term144014, term144014.getClass(), "words", term144015);
        setIntField(term144014, term144014.getClass(), "wordsInUse", 1656299300);
        setBooleanField(term144014, term144014.getClass(), "sizeIsSticky", false);
        setField(term144009, term144009.getClass(), "bitset", term144014);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Walk");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term144009, args);
    }

};


