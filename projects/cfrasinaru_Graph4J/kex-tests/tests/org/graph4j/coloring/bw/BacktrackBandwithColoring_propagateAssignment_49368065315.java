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

public class BacktrackBandwithColoring_propagateAssignment_49368065315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term911;
     Object term918;
     Object term920;

    public BacktrackBandwithColoring_propagateAssignment_49368065315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term911 = newInstance(Class.forName("org.graph4j.coloring.bw.BacktrackBandwithColoring"));
        setField(term911, term911.getClass(), "workers", null);
        setLongField(term911, term911.getClass(), "nodesExplored", 0L);
        setLongField(term911, term911.getClass(), "timeLimit", 0L);
        setLongField(term911, term911.getClass(), "startTime", 0L);
        setBooleanField(term911, term911.getClass(), "timeExpired", false);
        setField(term911, term911.getClass(), "initialColoring", null);
        setField(term911, term911.getClass(), "components", null);
        setField(term911, term911.getClass(), "solutions", null);
        setIntField(term911, term911.getClass(), "solutionsLimit", 0);
        setBooleanField(term911, term911.getClass(), "outputEnabled", false);
        setField(term911, term911.getClass(), "maxClique", null);
        setField(term911, term911.getClass(), "graph", null);
        term918 = new Integer(0);
        term920 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.bw.BacktrackBandwithColoring");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.graph4j.coloring.Node");
        argTypes[3] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[4];
        args[0] = term918;
        args[1] = term920;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "propagateAssignment", argTypes, term911, args);
    }

};


