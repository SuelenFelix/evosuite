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

public class StableSet_checkEdge_28762114412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8893;
     Object term8896;
     Object term8898;

    public StableSet_checkEdge_28762114412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8893 = newInstance(Class.forName("org.graph4j.util.StableSet"));
        setField(term8893, term8893.getClass(), "posMap", null);
        setField(term8893, term8893.getClass(), "graph", null);
        setField(term8893, term8893.getClass(), "vertices", null);
        setIntField(term8893, term8893.getClass(), "numVertices", 0);
        setIntField(term8893, term8893.getClass(), "first", 0);
        setField(term8893, term8893.getClass(), "bitset", null);
        term8896 = new Integer(0);
        term8898 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.StableSet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term8896;
        args[1] = term8898;
        callMethod(klass, "checkEdge", argTypes, term8893, args);
    }

};


