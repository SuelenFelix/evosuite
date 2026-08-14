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
     Object term173072;
     Object term173083;

    public EdgeIteratorImpl_getData_9586776498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term173079 = new Double(0.718600430280418);
        term173072 = newInstance(Class.forName("org.graph4j.EdgeIteratorImpl"));
        Object term173074 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term173078 = (Object[]) newArray("java.lang.Double", 1);
        setField(term173072, term173072.getClass(), "graph", null);
        setField(term173072, term173072.getClass(), "neighbors", null);
        setIntField(term173072, term173072.getClass(), "index", 1508646314);
        setBooleanField(term173074, term173074.getClass(), "directed", false);
        setIntField(term173074, term173074.getClass(), "source", -260721292);
        setIntField(term173074, term173074.getClass(), "target", 525436007);
        setElement(term173078, 0, term173079);
        setField(term173074, term173074.getClass(), "data", term173078);
        setField(term173074, term173074.getClass(), "label", null);
        setField(term173072, term173072.getClass(), "currentEdge", term173074);
        setBooleanField(term173072, term173072.getClass(), "directed", false);
        setIntField(term173072, term173072.getClass(), "numVertices", -1676002565);
        term173083 = new Integer(474429571);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.EdgeIteratorImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term173083;
        callMethod(klass, "getData", argTypes, term173072, args);
    }

};


