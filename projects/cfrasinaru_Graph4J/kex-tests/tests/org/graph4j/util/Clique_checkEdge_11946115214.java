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
     Object term7644;
     Object term7647;
     Object term7649;

    public Clique_checkEdge_11946115214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7644 = newInstance(Class.forName("org.graph4j.util.Clique"));
        setField(term7644, term7644.getClass(), "posMap", null);
        setField(term7644, term7644.getClass(), "graph", null);
        setField(term7644, term7644.getClass(), "vertices", null);
        setIntField(term7644, term7644.getClass(), "numVertices", 0);
        setIntField(term7644, term7644.getClass(), "first", 0);
        setField(term7644, term7644.getClass(), "bitset", null);
        term7647 = new Integer(0);
        term7649 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Clique");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term7647;
        args[1] = term7649;
        callMethod(klass, "checkEdge", argTypes, term7644, args);
    }

};


