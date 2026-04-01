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
     Object term108286;
     Object term108299;

    public Edge_setLabel_4813382314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term108291 = new Double(0.6602905273017295);
        Double term108293 = new Double(0.18162585474118642);
        Double term108295 = new Double(0.13499238703794558);
        Double term108297 = new Double(0.46505735758715006);
        term108286 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term108290 = (Object[]) newArray("java.lang.Double", 4);
        setBooleanField(term108286, term108286.getClass(), "directed", false);
        setIntField(term108286, term108286.getClass(), "source", -721070306);
        setIntField(term108286, term108286.getClass(), "target", -1512308594);
        setElement(term108290, 0, term108291);
        setElement(term108290, 1, term108293);
        setElement(term108290, 2, term108295);
        setElement(term108290, 3, term108297);
        setField(term108286, term108286.getClass(), "data", term108290);
        setField(term108286, term108286.getClass(), "label", null);
        term108299 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Edge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term108299;
        callMethod(klass, "setLabel", argTypes, term108286, args);
    }

};


