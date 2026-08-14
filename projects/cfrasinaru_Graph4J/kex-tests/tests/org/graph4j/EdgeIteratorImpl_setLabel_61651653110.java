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

public class EdgeIteratorImpl_setLabel_61651653110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173098;
     Object term173107;

    public EdgeIteratorImpl_setLabel_61651653110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173098 = newInstance(Class.forName("org.graph4j.EdgeIteratorImpl"));
        Object term173100 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term173104 = (Object[]) newArray("java.lang.Double", 0);
        setField(term173098, term173098.getClass(), "graph", null);
        setField(term173098, term173098.getClass(), "neighbors", null);
        setIntField(term173098, term173098.getClass(), "index", -1577972069);
        setBooleanField(term173100, term173100.getClass(), "directed", true);
        setIntField(term173100, term173100.getClass(), "source", -1852413244);
        setIntField(term173100, term173100.getClass(), "target", -1331628054);
        setField(term173100, term173100.getClass(), "data", term173104);
        setField(term173100, term173100.getClass(), "label", null);
        setField(term173098, term173098.getClass(), "currentEdge", term173100);
        setBooleanField(term173098, term173098.getClass(), "directed", true);
        setIntField(term173098, term173098.getClass(), "numVertices", -600236695);
        term173107 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.EdgeIteratorImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term173107;
        callMethod(klass, "setLabel", argTypes, term173098, args);
    }

};


