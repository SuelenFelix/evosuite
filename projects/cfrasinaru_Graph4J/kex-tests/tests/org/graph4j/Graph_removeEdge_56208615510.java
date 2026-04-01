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
     Object term118548;

    public Graph_removeEdge_56208615510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term118553 = new Double(0.2869076979265147);
        Double term118555 = new Double(0.777690186289802);
        Double term118557 = new Double(0.9750871435414475);
        Double term118559 = new Double(0.4244479522523773);
        Double term118561 = new Double(0.13090766612376525);
        Double term118563 = new Double(0.6623418154867594);
        Double term118565 = new Double(0.08955649121950282);
        term118548 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term118552 = (Object[]) newArray("java.lang.Double", 7);
        setBooleanField(term118548, term118548.getClass(), "directed", false);
        setIntField(term118548, term118548.getClass(), "source", 1123491164);
        setIntField(term118548, term118548.getClass(), "target", 745567108);
        setElement(term118552, 0, term118553);
        setElement(term118552, 1, term118555);
        setElement(term118552, 2, term118557);
        setElement(term118552, 3, term118559);
        setElement(term118552, 4, term118561);
        setElement(term118552, 5, term118563);
        setElement(term118552, 6, term118565);
        setField(term118548, term118548.getClass(), "data", term118552);
        setField(term118548, term118548.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Graph");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Edge");
        Object[] args = new Object[1];
        args[0] = term118548;
        callMethod(klass, "removeEdge", argTypes, null, args);
    }

};


