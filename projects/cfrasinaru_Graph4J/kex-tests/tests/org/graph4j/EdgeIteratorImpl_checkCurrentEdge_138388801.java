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

public class EdgeIteratorImpl_checkCurrentEdge_138388801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172946;

    public EdgeIteratorImpl_checkCurrentEdge_138388801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term172953 = new Double(0.6192027412772936);
        term172946 = newInstance(Class.forName("org.graph4j.EdgeIteratorImpl"));
        Object term172948 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term172952 = (Object[]) newArray("java.lang.Double", 1);
        setField(term172946, term172946.getClass(), "graph", null);
        setField(term172946, term172946.getClass(), "neighbors", null);
        setIntField(term172946, term172946.getClass(), "index", -2086606291);
        setBooleanField(term172948, term172948.getClass(), "directed", true);
        setIntField(term172948, term172948.getClass(), "source", 1594586195);
        setIntField(term172948, term172948.getClass(), "target", -285714672);
        setElement(term172952, 0, term172953);
        setField(term172948, term172948.getClass(), "data", term172952);
        setField(term172948, term172948.getClass(), "label", null);
        setField(term172946, term172946.getClass(), "currentEdge", term172948);
        setBooleanField(term172946, term172946.getClass(), "directed", true);
        setIntField(term172946, term172946.getClass(), "numVertices", 1218017657);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.EdgeIteratorImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkCurrentEdge", argTypes, term172946, args);
    }

};


