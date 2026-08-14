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
     Object term172960;

    public EdgeIteratorImpl_hasNext_14984920432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term172967 = new Double(0.4441390293660388);
        Double term172969 = new Double(0.0358686029380797);
        term172960 = newInstance(Class.forName("org.graph4j.EdgeIteratorImpl"));
        Object term172962 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term172966 = (Object[]) newArray("java.lang.Double", 2);
        setField(term172960, term172960.getClass(), "graph", null);
        setField(term172960, term172960.getClass(), "neighbors", null);
        setIntField(term172960, term172960.getClass(), "index", 1600728437);
        setBooleanField(term172962, term172962.getClass(), "directed", false);
        setIntField(term172962, term172962.getClass(), "source", 1424374715);
        setIntField(term172962, term172962.getClass(), "target", -1297874038);
        setElement(term172966, 0, term172967);
        setElement(term172966, 1, term172969);
        setField(term172962, term172962.getClass(), "data", term172966);
        setField(term172962, term172962.getClass(), "label", null);
        setField(term172960, term172960.getClass(), "currentEdge", term172962);
        setBooleanField(term172960, term172960.getClass(), "directed", true);
        setIntField(term172960, term172960.getClass(), "numVertices", 819315196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.EdgeIteratorImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term172960, args);
    }

};


