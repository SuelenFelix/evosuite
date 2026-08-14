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

public class Edge_getUpperBound_145835124821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1686;

    public Edge_getUpperBound_145835124821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1686 = newInstance(Class.forName("org.s1ck.gdl.model.Edge"));
        setField(term1686, term1686.getClass(), "sourceVertexId", null);
        setField(term1686, term1686.getClass(), "targetVertexId", null);
        setIntField(term1686, term1686.getClass(), "lowerBound", 0);
        setIntField(term1686, term1686.getClass(), "upperBound", 0);
        setField(term1686, term1686.getClass(), "graphs", null);
        setField(term1686, term1686.getClass(), "id", null);
        setField(term1686, term1686.getClass(), "labels", null);
        setField(term1686, term1686.getClass(), "properties", null);
        setField(term1686, term1686.getClass(), "variable", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Edge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpperBound", argTypes, term1686, args);
    }

};


