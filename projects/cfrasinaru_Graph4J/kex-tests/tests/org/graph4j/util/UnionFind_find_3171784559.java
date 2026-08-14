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

public class UnionFind_find_3171784559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3466;
     Object term3470;

    public UnionFind_find_3171784559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3466 = newInstance(Class.forName("org.graph4j.util.UnionFind"));
        setIntField(term3466, term3466.getClass(), "numVertices", 0);
        setBooleanField(term3466, term3466.getClass(), "pathCompression", false);
        setField(term3466, term3466.getClass(), "parent", null);
        setIntField(term3466, term3466.getClass(), "numSets", 0);
        term3470 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.UnionFind");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3470;
        callMethod(klass, "find", argTypes, term3466, args);
    }

};


