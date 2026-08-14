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
     Object term173108;

    public EdgeIteratorImpl_getLabel_68669211111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term173115 = new Double(0.6838300114944136);
        Double term173117 = new Double(0.8885115226788758);
        Double term173119 = new Double(0.6875864142093912);
        Double term173121 = new Double(0.4864630293798603);
        Double term173123 = new Double(0.8110671096400338);
        Double term173125 = new Double(0.7120346527141491);
        Double term173127 = new Double(0.19668510182067223);
        Double term173129 = new Double(0.9958397874745063);
        Double term173131 = new Double(0.9739330734879617);
        term173108 = newInstance(Class.forName("org.graph4j.EdgeIteratorImpl"));
        Object term173110 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term173114 = (Object[]) newArray("java.lang.Double", 9);
        setField(term173108, term173108.getClass(), "graph", null);
        setField(term173108, term173108.getClass(), "neighbors", null);
        setIntField(term173108, term173108.getClass(), "index", 167133909);
        setBooleanField(term173110, term173110.getClass(), "directed", false);
        setIntField(term173110, term173110.getClass(), "source", -1570905789);
        setIntField(term173110, term173110.getClass(), "target", 1951341733);
        setElement(term173114, 0, term173115);
        setElement(term173114, 1, term173117);
        setElement(term173114, 2, term173119);
        setElement(term173114, 3, term173121);
        setElement(term173114, 4, term173123);
        setElement(term173114, 5, term173125);
        setElement(term173114, 6, term173127);
        setElement(term173114, 7, term173129);
        setElement(term173114, 8, term173131);
        setField(term173110, term173110.getClass(), "data", term173114);
        setField(term173110, term173110.getClass(), "label", null);
        setField(term173108, term173108.getClass(), "currentEdge", term173110);
        setBooleanField(term173108, term173108.getClass(), "directed", true);
        setIntField(term173108, term173108.getClass(), "numVertices", -2133094182);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.EdgeIteratorImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLabel", argTypes, term173108, args);
    }

};


