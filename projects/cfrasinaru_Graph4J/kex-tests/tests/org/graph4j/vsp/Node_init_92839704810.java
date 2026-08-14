package org.graph4j.vsp;

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
import static org.graph4j.vsp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Node_init_92839704810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5470;
     Object term5472;

    public Node_init_92839704810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5470 = new Integer(0);
        term5472 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.Node");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("org.graph4j.vsp.BacktrackVertexSeparator");
        argTypes[1] = Class.forName("org.graph4j.vsp.Node");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Array.newInstance(Class.forName("org.graph4j.util.Domain"), 0).getClass();
        argTypes[5] = Class.forName("org.graph4j.vsp.VertexSeparator");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = term5470;
        args[3] = term5472;
        args[4] = null;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


