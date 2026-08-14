package org.graph4j.coloring;

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
import static org.graph4j.coloring.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;

public class Node_init_137767736010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term882;
     Object term884;
     Object term886;

    public Node_init_137767736010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term882 = new Integer(0);
        term884 = new Integer(0);
        term886 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Node");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("org.graph4j.coloring.ExactColoringBase");
        argTypes[1] = Class.forName("org.graph4j.coloring.Node");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Array.newInstance(Class.forName("org.graph4j.util.Domain"), 0).getClass();
        argTypes[5] = Class.forName("org.graph4j.coloring.Coloring");
        argTypes[6] = boolean.class;
        Object[] args = new Object[7];
        args[0] = null;
        args[1] = null;
        args[2] = term882;
        args[3] = term884;
        args[4] = null;
        args[5] = null;
        args[6] = term886;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


