package org.graph4j.generators;

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
import static org.graph4j.generators.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class WheelGenerator_addEdges_20549438399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1111;
     Object term1113;
     Object term1115;

    public WheelGenerator_addEdges_20549438399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1111 = newInstance(Class.forName("org.graph4j.generators.WheelGenerator"));
        setIntField(term1111, term1111.getClass(), "center", 0);
        setField(term1111, term1111.getClass(), "vertices", null);
        term1113 = new Boolean(false);
        term1115 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.WheelGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term1113;
        args[2] = term1115;
        callMethod(klass, "addEdges", argTypes, term1111, args);
    }

};


