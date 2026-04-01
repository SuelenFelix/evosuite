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

public class UnionFind_numSets_21171307794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73953;

    public UnionFind_numSets_21171307794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73953 = newInstance(Class.forName("org.graph4j.util.UnionFind"));
        int[] term73956 = (int[]) newIntArray(8);
        setIntField(term73953, term73953.getClass(), "numVertices", -1102891843);
        setBooleanField(term73953, term73953.getClass(), "pathCompression", true);
        setIntElement(term73956, 0, -1019000095);
        setIntElement(term73956, 1, -840293673);
        setIntElement(term73956, 2, 1264858800);
        setIntElement(term73956, 3, 1788889024);
        setIntElement(term73956, 4, -1986327151);
        setIntElement(term73956, 5, 1265876286);
        setIntElement(term73956, 6, 111275435);
        setIntElement(term73956, 7, 1944060051);
        setField(term73953, term73953.getClass(), "parent", term73956);
        setIntField(term73953, term73953.getClass(), "numSets", 630074094);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.UnionFind");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "numSets", argTypes, term73953, args);
    }

};


