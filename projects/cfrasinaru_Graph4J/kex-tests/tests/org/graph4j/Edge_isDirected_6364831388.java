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

public class Edge_isDirected_6364831388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108185;

    public Edge_isDirected_6364831388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term108190 = new Double(0.533001418704147);
        Double term108192 = new Double(0.9818549251139834);
        Double term108194 = new Double(0.9968905523871232);
        Double term108196 = new Double(0.5782492033278201);
        Double term108198 = new Double(0.11415011225631944);
        Double term108200 = new Double(0.9680611801309333);
        Double term108202 = new Double(0.3247557569539842);
        Double term108204 = new Double(0.0145401306959696);
        term108185 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term108189 = (Object[]) newArray("java.lang.Double", 8);
        setBooleanField(term108185, term108185.getClass(), "directed", true);
        setIntField(term108185, term108185.getClass(), "source", -642571564);
        setIntField(term108185, term108185.getClass(), "target", -1691073345);
        setElement(term108189, 0, term108190);
        setElement(term108189, 1, term108192);
        setElement(term108189, 2, term108194);
        setElement(term108189, 3, term108196);
        setElement(term108189, 4, term108198);
        setElement(term108189, 5, term108200);
        setElement(term108189, 6, term108202);
        setElement(term108189, 7, term108204);
        setField(term108185, term108185.getClass(), "data", term108189);
        setField(term108185, term108185.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Edge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDirected", argTypes, term108185, args);
    }

};


