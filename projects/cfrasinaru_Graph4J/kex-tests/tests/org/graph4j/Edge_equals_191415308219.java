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

public class Edge_equals_191415308219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108386;
     Object term108397;

    public Edge_equals_191415308219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term108391 = new Double(0.976589553034152);
        Double term108393 = new Double(0.9091029161718786);
        Double term108395 = new Double(0.3485608451860187);
        term108386 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term108390 = (Object[]) newArray("java.lang.Double", 3);
        setBooleanField(term108386, term108386.getClass(), "directed", false);
        setIntField(term108386, term108386.getClass(), "source", 1187943069);
        setIntField(term108386, term108386.getClass(), "target", -2126093553);
        setElement(term108390, 0, term108391);
        setElement(term108390, 1, term108393);
        setElement(term108390, 2, term108395);
        setField(term108386, term108386.getClass(), "data", term108390);
        setField(term108386, term108386.getClass(), "label", null);
        term108397 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Edge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term108397;
        callMethod(klass, "equals", argTypes, term108386, args);
    }

};


