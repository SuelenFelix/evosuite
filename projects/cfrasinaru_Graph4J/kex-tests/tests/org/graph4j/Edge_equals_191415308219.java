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
     Object term108383;
     Object term108394;

    public Edge_equals_191415308219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term108388 = new Double(0.976589553034152);
        Double term108390 = new Double(0.9091029161718786);
        Double term108392 = new Double(0.3485608451860187);
        term108383 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term108387 = (Object[]) newArray("java.lang.Double", 3);
        setBooleanField(term108383, term108383.getClass(), "directed", false);
        setIntField(term108383, term108383.getClass(), "source", 1187943069);
        setIntField(term108383, term108383.getClass(), "target", -2126093553);
        setElement(term108387, 0, term108388);
        setElement(term108387, 1, term108390);
        setElement(term108387, 2, term108392);
        setField(term108383, term108383.getClass(), "data", term108387);
        setField(term108383, term108383.getClass(), "label", null);
        term108394 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Edge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term108394;
        callMethod(klass, "equals", argTypes, term108383, args);
    }

};


