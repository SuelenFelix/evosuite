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

public class UnionFind_union_67429464110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74022;
     Object term74026;
     Object term74028;

    public UnionFind_union_67429464110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74022 = newInstance(Class.forName("org.graph4j.util.UnionFind"));
        setIntField(term74022, term74022.getClass(), "numVertices", 0);
        setBooleanField(term74022, term74022.getClass(), "pathCompression", false);
        setField(term74022, term74022.getClass(), "parent", null);
        setIntField(term74022, term74022.getClass(), "numSets", 0);
        term74026 = new Integer(0);
        term74028 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.UnionFind");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term74026;
        args[1] = term74028;
        callMethod(klass, "union", argTypes, term74022, args);
    }

};


