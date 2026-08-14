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

public class Graph_removeEdge_56208615510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118551;

    public Graph_removeEdge_56208615510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term118556 = new Double(0.2869076979265147);
        Double term118558 = new Double(0.777690186289802);
        Double term118560 = new Double(0.9750871435414475);
        Double term118562 = new Double(0.4244479522523773);
        Double term118564 = new Double(0.13090766612376525);
        Double term118566 = new Double(0.6623418154867594);
        Double term118568 = new Double(0.08955649121950282);
        term118551 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term118555 = (Object[]) newArray("java.lang.Double", 7);
        setBooleanField(term118551, term118551.getClass(), "directed", false);
        setIntField(term118551, term118551.getClass(), "source", 1123491164);
        setIntField(term118551, term118551.getClass(), "target", 745567108);
        setElement(term118555, 0, term118556);
        setElement(term118555, 1, term118558);
        setElement(term118555, 2, term118560);
        setElement(term118555, 3, term118562);
        setElement(term118555, 4, term118564);
        setElement(term118555, 5, term118566);
        setElement(term118555, 6, term118568);
        setField(term118551, term118551.getClass(), "data", term118555);
        setField(term118551, term118551.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Graph");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Edge");
        Object[] args = new Object[1];
        args[0] = term118551;
        callMethod(klass, "removeEdge", argTypes, null, args);
    }

};


