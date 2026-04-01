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
import java.lang.Object;
import java.lang.Double;
import java.lang.Integer;

public class EdgeIteratorImpl_getData_9586776498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173069;
     Object term173080;

    public EdgeIteratorImpl_getData_9586776498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term173076 = new Double(0.718600430280418);
        term173069 = newInstance(Class.forName("org.graph4j.EdgeIteratorImpl"));
        Object term173071 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term173075 = (Object[]) newArray("java.lang.Double", 1);
        setField(term173069, term173069.getClass(), "graph", null);
        setField(term173069, term173069.getClass(), "neighbors", null);
        setIntField(term173069, term173069.getClass(), "index", 1508646314);
        setBooleanField(term173071, term173071.getClass(), "directed", false);
        setIntField(term173071, term173071.getClass(), "source", -260721292);
        setIntField(term173071, term173071.getClass(), "target", 525436007);
        setElement(term173075, 0, term173076);
        setField(term173071, term173071.getClass(), "data", term173075);
        setField(term173071, term173071.getClass(), "label", null);
        setField(term173069, term173069.getClass(), "currentEdge", term173071);
        setBooleanField(term173069, term173069.getClass(), "directed", false);
        setIntField(term173069, term173069.getClass(), "numVertices", -1676002565);
        term173080 = new Integer(474429571);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.EdgeIteratorImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term173080;
        callMethod(klass, "getData", argTypes, term173069, args);
    }

};


