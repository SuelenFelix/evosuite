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

public class UnionFind_getParent_8463416012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74034;
     Object term74038;

    public UnionFind_getParent_8463416012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74034 = newInstance(Class.forName("org.graph4j.util.UnionFind"));
        setIntField(term74034, term74034.getClass(), "numVertices", 0);
        setBooleanField(term74034, term74034.getClass(), "pathCompression", false);
        setField(term74034, term74034.getClass(), "parent", null);
        setIntField(term74034, term74034.getClass(), "numSets", 0);
        term74038 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.UnionFind");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term74038;
        callMethod(klass, "getParent", argTypes, term74034, args);
    }

};


