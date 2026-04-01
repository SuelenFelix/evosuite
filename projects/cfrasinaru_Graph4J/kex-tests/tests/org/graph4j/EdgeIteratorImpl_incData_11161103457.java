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
     Object term173050;
     Object term173065;
     Object term173067;

    public EdgeIteratorImpl_incData_11161103457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term173057 = new Double(0.9876434136132628);
        Double term173059 = new Double(0.486693626277787);
        Double term173061 = new Double(0.2967547798663467);
        term173050 = newInstance(Class.forName("org.graph4j.EdgeIteratorImpl"));
        Object term173052 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term173056 = (Object[]) newArray("java.lang.Double", 3);
        setField(term173050, term173050.getClass(), "graph", null);
        setField(term173050, term173050.getClass(), "neighbors", null);
        setIntField(term173050, term173050.getClass(), "index", 2025232004);
        setBooleanField(term173052, term173052.getClass(), "directed", false);
        setIntField(term173052, term173052.getClass(), "source", -273722392);
        setIntField(term173052, term173052.getClass(), "target", -1287587496);
        setElement(term173056, 0, term173057);
        setElement(term173056, 1, term173059);
        setElement(term173056, 2, term173061);
        setField(term173052, term173052.getClass(), "data", term173056);
        setField(term173052, term173052.getClass(), "label", null);
        setField(term173050, term173050.getClass(), "currentEdge", term173052);
        setBooleanField(term173050, term173050.getClass(), "directed", false);
        setIntField(term173050, term173050.getClass(), "numVertices", -260370082);
        term173065 = new Integer(-1516380695);
        term173067 = new Double(0.5296384159236056);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.EdgeIteratorImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term173065;
        args[1] = term173067;
        callMethod(klass, "incData", argTypes, term173050, args);
    }

};


