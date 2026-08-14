package org.s1ck.gdl.model;

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
import static org.s1ck.gdl.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Edge_setSourceVertexId_126243731216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1669;

    public Edge_setSourceVertexId_126243731216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1669 = newInstance(Class.forName("org.s1ck.gdl.model.Edge"));
        setField(term1669, term1669.getClass(), "sourceVertexId", null);
        setField(term1669, term1669.getClass(), "targetVertexId", null);
        setIntField(term1669, term1669.getClass(), "lowerBound", 0);
        setIntField(term1669, term1669.getClass(), "upperBound", 0);
        setField(term1669, term1669.getClass(), "graphs", null);
        setField(term1669, term1669.getClass(), "id", null);
        setField(term1669, term1669.getClass(), "labels", null);
        setField(term1669, term1669.getClass(), "properties", null);
        setField(term1669, term1669.getClass(), "variable", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Edge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSourceVertexId", argTypes, term1669, args);
    }

};


