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
     Object term173135;

    public EdgeIteratorImpl_remove_141834040612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term173142 = new Double(0.14441316633591283);
        Double term173144 = new Double(0.6796627810273956);
        Double term173146 = new Double(0.3514187836351318);
        Double term173148 = new Double(0.6407856167958014);
        Double term173150 = new Double(0.03024778172856546);
        term173135 = newInstance(Class.forName("org.graph4j.EdgeIteratorImpl"));
        Object term173137 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term173141 = (Object[]) newArray("java.lang.Double", 5);
        setField(term173135, term173135.getClass(), "graph", null);
        setField(term173135, term173135.getClass(), "neighbors", null);
        setIntField(term173135, term173135.getClass(), "index", 2041095361);
        setBooleanField(term173137, term173137.getClass(), "directed", false);
        setIntField(term173137, term173137.getClass(), "source", -792321975);
        setIntField(term173137, term173137.getClass(), "target", 926347386);
        setElement(term173141, 0, term173142);
        setElement(term173141, 1, term173144);
        setElement(term173141, 2, term173146);
        setElement(term173141, 3, term173148);
        setElement(term173141, 4, term173150);
        setField(term173137, term173137.getClass(), "data", term173141);
        setField(term173137, term173137.getClass(), "label", null);
        setField(term173135, term173135.getClass(), "currentEdge", term173137);
        setBooleanField(term173135, term173135.getClass(), "directed", false);
        setIntField(term173135, term173135.getClass(), "numVertices", -602791965);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.EdgeIteratorImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "remove", argTypes, term173135, args);
    }

};


