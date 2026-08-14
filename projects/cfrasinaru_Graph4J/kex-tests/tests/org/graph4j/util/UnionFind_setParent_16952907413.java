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
import java.lang.Integer;

public class UnionFind_setParent_16952907413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3490;
     Object term3494;
     Object term3496;

    public UnionFind_setParent_16952907413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3490 = newInstance(Class.forName("org.graph4j.util.UnionFind"));
        setIntField(term3490, term3490.getClass(), "numVertices", 0);
        setBooleanField(term3490, term3490.getClass(), "pathCompression", false);
        setField(term3490, term3490.getClass(), "parent", null);
        setIntField(term3490, term3490.getClass(), "numSets", 0);
        term3494 = new Integer(0);
        term3496 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.UnionFind");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term3494;
        args[1] = term3496;
        callMethod(klass, "setParent", argTypes, term3490, args);
    }

};


