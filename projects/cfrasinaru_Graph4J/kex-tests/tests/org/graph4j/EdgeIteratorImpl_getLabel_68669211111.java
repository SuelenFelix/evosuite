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

public class EdgeIteratorImpl_getLabel_68669211111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173105;

    public EdgeIteratorImpl_getLabel_68669211111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term173112 = new Double(0.6838300114944136);
        Double term173114 = new Double(0.8885115226788758);
        Double term173116 = new Double(0.6875864142093912);
        Double term173118 = new Double(0.4864630293798603);
        Double term173120 = new Double(0.8110671096400338);
        Double term173122 = new Double(0.7120346527141491);
        Double term173124 = new Double(0.19668510182067223);
        Double term173126 = new Double(0.9958397874745063);
        Double term173128 = new Double(0.9739330734879617);
        term173105 = newInstance(Class.forName("org.graph4j.EdgeIteratorImpl"));
        Object term173107 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term173111 = (Object[]) newArray("java.lang.Double", 9);
        setField(term173105, term173105.getClass(), "graph", null);
        setField(term173105, term173105.getClass(), "neighbors", null);
        setIntField(term173105, term173105.getClass(), "index", 167133909);
        setBooleanField(term173107, term173107.getClass(), "directed", false);
        setIntField(term173107, term173107.getClass(), "source", -1570905789);
        setIntField(term173107, term173107.getClass(), "target", 1951341733);
        setElement(term173111, 0, term173112);
        setElement(term173111, 1, term173114);
        setElement(term173111, 2, term173116);
        setElement(term173111, 3, term173118);
        setElement(term173111, 4, term173120);
        setElement(term173111, 5, term173122);
        setElement(term173111, 6, term173124);
        setElement(term173111, 7, term173126);
        setElement(term173111, 8, term173128);
        setField(term173107, term173107.getClass(), "data", term173111);
        setField(term173107, term173107.getClass(), "label", null);
        setField(term173105, term173105.getClass(), "currentEdge", term173107);
        setBooleanField(term173105, term173105.getClass(), "directed", true);
        setIntField(term173105, term173105.getClass(), "numVertices", -2133094182);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.EdgeIteratorImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLabel", argTypes, term173105, args);
    }

};


