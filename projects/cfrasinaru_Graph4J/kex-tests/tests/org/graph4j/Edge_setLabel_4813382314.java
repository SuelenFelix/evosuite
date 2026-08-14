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

public class Edge_setLabel_4813382314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108289;
     Object term108302;

    public Edge_setLabel_4813382314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term108294 = new Double(0.6602905273017295);
        Double term108296 = new Double(0.18162585474118642);
        Double term108298 = new Double(0.13499238703794558);
        Double term108300 = new Double(0.46505735758715006);
        term108289 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term108293 = (Object[]) newArray("java.lang.Double", 4);
        setBooleanField(term108289, term108289.getClass(), "directed", false);
        setIntField(term108289, term108289.getClass(), "source", -721070306);
        setIntField(term108289, term108289.getClass(), "target", -1512308594);
        setElement(term108293, 0, term108294);
        setElement(term108293, 1, term108296);
        setElement(term108293, 2, term108298);
        setElement(term108293, 3, term108300);
        setField(term108289, term108289.getClass(), "data", term108293);
        setField(term108289, term108289.getClass(), "label", null);
        term108302 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Edge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term108302;
        callMethod(klass, "setLabel", argTypes, term108289, args);
    }

};


