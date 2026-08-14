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

public class BacktrackColoring_propagateAssignment_95817116011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5868;
     Object term5875;
     Object term5877;

    public BacktrackColoring_propagateAssignment_95817116011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5868 = newInstance(Class.forName("org.graph4j.coloring.BacktrackColoring"));
        setField(term5868, term5868.getClass(), "workers", null);
        setLongField(term5868, term5868.getClass(), "nodesExplored", 0L);
        setLongField(term5868, term5868.getClass(), "timeLimit", 0L);
        setLongField(term5868, term5868.getClass(), "startTime", 0L);
        setBooleanField(term5868, term5868.getClass(), "timeExpired", false);
        setField(term5868, term5868.getClass(), "initialColoring", null);
        setField(term5868, term5868.getClass(), "components", null);
        setField(term5868, term5868.getClass(), "solutions", null);
        setIntField(term5868, term5868.getClass(), "solutionsLimit", 0);
        setBooleanField(term5868, term5868.getClass(), "outputEnabled", false);
        setField(term5868, term5868.getClass(), "maxClique", null);
        setField(term5868, term5868.getClass(), "graph", null);
        term5875 = new Integer(0);
        term5877 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.BacktrackColoring");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.graph4j.coloring.Node");
        argTypes[3] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[4];
        args[0] = term5875;
        args[1] = term5877;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "propagateAssignment", argTypes, term5868, args);
    }

};


