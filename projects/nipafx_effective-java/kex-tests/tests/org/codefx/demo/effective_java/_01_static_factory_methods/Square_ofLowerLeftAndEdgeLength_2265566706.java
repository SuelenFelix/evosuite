package org.codefx.demo.effective_java._01_static_factory_methods;

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
import static org.codefx.demo.effective_java._01_static_factory_methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Square_ofLowerLeftAndEdgeLength_2265566706 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term25;

    public Square_ofLowerLeftAndEdgeLength_2265566706() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("org.codefx.demo.effective_java._01_static_factory_methods.Square"));
        setIntField(term23, term23.getClass(), "edgeLength", 0);
        setField(term23, term23.getClass(), "lowerLeft", null);
        setField(term23, term23.getClass(), "upperRight", null);
        term25 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._01_static_factory_methods.Square");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.codefx.demo.effective_java._01_static_factory_methods.Point");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term25;
        callMethod(klass, "ofLowerLeftAndEdgeLength", argTypes, term23, args);
    }

};


