package org.graph4j;

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
import static org.graph4j.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Double;

public class EdgeIteratorImpl_getData_149126201822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173195;
     Object term173199;
     Object term173201;

    public EdgeIteratorImpl_getData_149126201822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173195 = newInstance(Class.forName("org.graph4j.EdgeIteratorImpl"));
        setField(term173195, term173195.getClass(), "graph", null);
        setField(term173195, term173195.getClass(), "neighbors", null);
        setIntField(term173195, term173195.getClass(), "index", 0);
        setField(term173195, term173195.getClass(), "currentEdge", null);
        setBooleanField(term173195, term173195.getClass(), "directed", false);
        setIntField(term173195, term173195.getClass(), "numVertices", 0);
        term173199 = new Integer(0);
        term173201 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.EdgeIteratorImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term173199;
        args[1] = term173201;
        callMethod(klass, "getData", argTypes, term173195, args);
    }

};


