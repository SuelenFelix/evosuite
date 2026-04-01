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

public class Clique_checkEdge_11946115214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141660;
     Object term141663;
     Object term141665;

    public Clique_checkEdge_11946115214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141660 = newInstance(Class.forName("org.graph4j.util.Clique"));
        setField(term141660, term141660.getClass(), "posMap", null);
        setField(term141660, term141660.getClass(), "graph", null);
        setField(term141660, term141660.getClass(), "vertices", null);
        setIntField(term141660, term141660.getClass(), "numVertices", 0);
        setIntField(term141660, term141660.getClass(), "first", 0);
        setField(term141660, term141660.getClass(), "bitset", null);
        term141663 = new Integer(0);
        term141665 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Clique");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term141663;
        args[1] = term141665;
        callMethod(klass, "checkEdge", argTypes, term141660, args);
    }

};


