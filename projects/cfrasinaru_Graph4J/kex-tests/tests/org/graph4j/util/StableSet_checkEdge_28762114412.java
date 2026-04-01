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
     Object term154847;
     Object term154850;
     Object term154852;

    public StableSet_checkEdge_28762114412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154847 = newInstance(Class.forName("org.graph4j.util.StableSet"));
        setField(term154847, term154847.getClass(), "posMap", null);
        setField(term154847, term154847.getClass(), "graph", null);
        setField(term154847, term154847.getClass(), "vertices", null);
        setIntField(term154847, term154847.getClass(), "numVertices", 0);
        setIntField(term154847, term154847.getClass(), "first", 0);
        setField(term154847, term154847.getClass(), "bitset", null);
        term154850 = new Integer(0);
        term154852 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.StableSet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term154850;
        args[1] = term154852;
        callMethod(klass, "checkEdge", argTypes, term154847, args);
    }

};


