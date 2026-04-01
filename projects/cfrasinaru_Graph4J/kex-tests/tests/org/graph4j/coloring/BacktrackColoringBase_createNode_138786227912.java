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

public class BacktrackColoringBase_createNode_138786227912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1455;
     Object term1457;

    public BacktrackColoringBase_createNode_138786227912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1455 = new Integer(0);
        term1457 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.BacktrackColoringBase");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("org.graph4j.coloring.Node");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Array.newInstance(Class.forName("org.graph4j.util.Domain"), 0).getClass();
        argTypes[4] = Class.forName("org.graph4j.coloring.Coloring");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = term1455;
        args[2] = term1457;
        args[3] = null;
        args[4] = null;
        callMethod(klass, "createNode", argTypes, null, args);
    }

};


