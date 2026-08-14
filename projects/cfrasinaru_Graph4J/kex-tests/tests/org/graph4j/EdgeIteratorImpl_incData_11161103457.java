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

public class EdgeIteratorImpl_incData_11161103457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173053;
     Object term173068;
     Object term173070;

    public EdgeIteratorImpl_incData_11161103457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term173060 = new Double(0.9876434136132628);
        Double term173062 = new Double(0.486693626277787);
        Double term173064 = new Double(0.2967547798663467);
        term173053 = newInstance(Class.forName("org.graph4j.EdgeIteratorImpl"));
        Object term173055 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term173059 = (Object[]) newArray("java.lang.Double", 3);
        setField(term173053, term173053.getClass(), "graph", null);
        setField(term173053, term173053.getClass(), "neighbors", null);
        setIntField(term173053, term173053.getClass(), "index", 2025232004);
        setBooleanField(term173055, term173055.getClass(), "directed", false);
        setIntField(term173055, term173055.getClass(), "source", -273722392);
        setIntField(term173055, term173055.getClass(), "target", -1287587496);
        setElement(term173059, 0, term173060);
        setElement(term173059, 1, term173062);
        setElement(term173059, 2, term173064);
        setField(term173055, term173055.getClass(), "data", term173059);
        setField(term173055, term173055.getClass(), "label", null);
        setField(term173053, term173053.getClass(), "currentEdge", term173055);
        setBooleanField(term173053, term173053.getClass(), "directed", false);
        setIntField(term173053, term173053.getClass(), "numVertices", -260370082);
        term173068 = new Integer(-1516380695);
        term173070 = new Double(0.5296384159236056);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.EdgeIteratorImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term173068;
        args[1] = term173070;
        callMethod(klass, "incData", argTypes, term173053, args);
    }

};


