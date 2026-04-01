package org.graph4j.coloring.eq;

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
import static org.graph4j.coloring.eq.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class BacktrackEquitableColoring_propagateAssignment_184184988714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term842;
     Object term851;
     Object term853;

    public BacktrackEquitableColoring_propagateAssignment_184184988714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term842 = newInstance(Class.forName("org.graph4j.coloring.eq.BacktrackEquitableColoring"));
        setIntField(term842, term842.getClass(), "maxClassSize", 0);
        setIntField(term842, term842.getClass(), "maxClassCount", 0);
        setField(term842, term842.getClass(), "workers", null);
        setLongField(term842, term842.getClass(), "nodesExplored", 0L);
        setLongField(term842, term842.getClass(), "timeLimit", 0L);
        setLongField(term842, term842.getClass(), "startTime", 0L);
        setBooleanField(term842, term842.getClass(), "timeExpired", false);
        setField(term842, term842.getClass(), "initialColoring", null);
        setField(term842, term842.getClass(), "components", null);
        setField(term842, term842.getClass(), "solutions", null);
        setIntField(term842, term842.getClass(), "solutionsLimit", 0);
        setBooleanField(term842, term842.getClass(), "outputEnabled", false);
        setField(term842, term842.getClass(), "maxClique", null);
        setField(term842, term842.getClass(), "graph", null);
        term851 = new Integer(0);
        term853 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.eq.BacktrackEquitableColoring");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.graph4j.coloring.Node");
        argTypes[3] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[4];
        args[0] = term851;
        args[1] = term853;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "propagateAssignment", argTypes, term842, args);
    }

};


