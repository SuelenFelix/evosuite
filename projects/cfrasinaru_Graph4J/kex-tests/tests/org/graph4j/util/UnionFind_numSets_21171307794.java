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
     Object term3415;

    public UnionFind_numSets_21171307794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3415 = newInstance(Class.forName("org.graph4j.util.UnionFind"));
        int[] term3418 = (int[]) newIntArray(0);
        setIntField(term3415, term3415.getClass(), "numVertices", 1280322790);
        setBooleanField(term3415, term3415.getClass(), "pathCompression", false);
        setField(term3415, term3415.getClass(), "parent", term3418);
        setIntField(term3415, term3415.getClass(), "numSets", -1702209203);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.UnionFind");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "numSets", argTypes, term3415, args);
    }

};


