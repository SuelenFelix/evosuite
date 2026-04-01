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

public class EdgeIteratorImpl_remove_141834040612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173132;

    public EdgeIteratorImpl_remove_141834040612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term173139 = new Double(0.14441316633591283);
        Double term173141 = new Double(0.6796627810273956);
        Double term173143 = new Double(0.3514187836351318);
        Double term173145 = new Double(0.6407856167958014);
        Double term173147 = new Double(0.03024778172856546);
        term173132 = newInstance(Class.forName("org.graph4j.EdgeIteratorImpl"));
        Object term173134 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term173138 = (Object[]) newArray("java.lang.Double", 5);
        setField(term173132, term173132.getClass(), "graph", null);
        setField(term173132, term173132.getClass(), "neighbors", null);
        setIntField(term173132, term173132.getClass(), "index", 2041095361);
        setBooleanField(term173134, term173134.getClass(), "directed", false);
        setIntField(term173134, term173134.getClass(), "source", -792321975);
        setIntField(term173134, term173134.getClass(), "target", 926347386);
        setElement(term173138, 0, term173139);
        setElement(term173138, 1, term173141);
        setElement(term173138, 2, term173143);
        setElement(term173138, 3, term173145);
        setElement(term173138, 4, term173147);
        setField(term173134, term173134.getClass(), "data", term173138);
        setField(term173134, term173134.getClass(), "label", null);
        setField(term173132, term173132.getClass(), "currentEdge", term173134);
        setBooleanField(term173132, term173132.getClass(), "directed", false);
        setIntField(term173132, term173132.getClass(), "numVertices", -602791965);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.EdgeIteratorImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "remove", argTypes, term173132, args);
    }

};


