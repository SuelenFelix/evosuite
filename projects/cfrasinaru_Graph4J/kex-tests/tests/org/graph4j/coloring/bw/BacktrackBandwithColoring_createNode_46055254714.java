package org.graph4j.coloring.bw;

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
import static org.graph4j.coloring.bw.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class BacktrackBandwithColoring_createNode_46055254714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term900;
     Object term907;
     Object term909;

    public BacktrackBandwithColoring_createNode_46055254714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term900 = newInstance(Class.forName("org.graph4j.coloring.bw.BacktrackBandwithColoring"));
        setField(term900, term900.getClass(), "workers", null);
        setLongField(term900, term900.getClass(), "nodesExplored", 0L);
        setLongField(term900, term900.getClass(), "timeLimit", 0L);
        setLongField(term900, term900.getClass(), "startTime", 0L);
        setBooleanField(term900, term900.getClass(), "timeExpired", false);
        setField(term900, term900.getClass(), "initialColoring", null);
        setField(term900, term900.getClass(), "components", null);
        setField(term900, term900.getClass(), "solutions", null);
        setIntField(term900, term900.getClass(), "solutionsLimit", 0);
        setBooleanField(term900, term900.getClass(), "outputEnabled", false);
        setField(term900, term900.getClass(), "maxClique", null);
        setField(term900, term900.getClass(), "graph", null);
        term907 = new Integer(0);
        term909 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.bw.BacktrackBandwithColoring");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("org.graph4j.coloring.Node");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Array.newInstance(Class.forName("org.graph4j.util.Domain"), 0).getClass();
        argTypes[4] = Class.forName("org.graph4j.coloring.Coloring");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = term907;
        args[2] = term909;
        args[3] = null;
        args[4] = null;
        callMethod(klass, "createNode", argTypes, term900, args);
    }

};


