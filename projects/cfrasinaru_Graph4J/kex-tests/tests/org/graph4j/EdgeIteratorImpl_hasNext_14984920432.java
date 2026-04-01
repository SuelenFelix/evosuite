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

public class EdgeIteratorImpl_hasNext_14984920432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172957;

    public EdgeIteratorImpl_hasNext_14984920432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term172964 = new Double(0.4441390293660388);
        Double term172966 = new Double(0.0358686029380797);
        term172957 = newInstance(Class.forName("org.graph4j.EdgeIteratorImpl"));
        Object term172959 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term172963 = (Object[]) newArray("java.lang.Double", 2);
        setField(term172957, term172957.getClass(), "graph", null);
        setField(term172957, term172957.getClass(), "neighbors", null);
        setIntField(term172957, term172957.getClass(), "index", 1600728437);
        setBooleanField(term172959, term172959.getClass(), "directed", false);
        setIntField(term172959, term172959.getClass(), "source", 1424374715);
        setIntField(term172959, term172959.getClass(), "target", -1297874038);
        setElement(term172963, 0, term172964);
        setElement(term172963, 1, term172966);
        setField(term172959, term172959.getClass(), "data", term172963);
        setField(term172959, term172959.getClass(), "label", null);
        setField(term172957, term172957.getClass(), "currentEdge", term172959);
        setBooleanField(term172957, term172957.getClass(), "directed", true);
        setIntField(term172957, term172957.getClass(), "numVertices", 819315196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.EdgeIteratorImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term172957, args);
    }

};


