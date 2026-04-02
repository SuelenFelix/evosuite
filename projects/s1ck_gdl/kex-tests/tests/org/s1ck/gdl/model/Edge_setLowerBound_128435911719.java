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
import java.lang.Integer;

public class Edge_setLowerBound_128435911719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1534;
     Object term1537;

    public Edge_setLowerBound_128435911719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1534 = newInstance(Class.forName("org.s1ck.gdl.model.Edge"));
        setField(term1534, term1534.getClass(), "sourceVertexId", null);
        setField(term1534, term1534.getClass(), "targetVertexId", null);
        setIntField(term1534, term1534.getClass(), "lowerBound", 0);
        setIntField(term1534, term1534.getClass(), "upperBound", 0);
        setField(term1534, term1534.getClass(), "graphs", null);
        setField(term1534, term1534.getClass(), "id", null);
        setField(term1534, term1534.getClass(), "labels", null);
        setField(term1534, term1534.getClass(), "properties", null);
        setField(term1534, term1534.getClass(), "variable", null);
        term1537 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Edge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1537;
        callMethod(klass, "setLowerBound", argTypes, term1534, args);
    }

};


