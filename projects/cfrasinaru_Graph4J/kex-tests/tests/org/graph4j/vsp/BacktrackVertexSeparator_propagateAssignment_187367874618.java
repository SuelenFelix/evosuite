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

public class BacktrackVertexSeparator_propagateAssignment_187367874618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54619;
     Object term54634;
     Object term54636;

    public BacktrackVertexSeparator_propagateAssignment_187367874618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54619 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator"));
        setLongField(term54619, term54619.getClass(), "timeLimit", 0L);
        setLongField(term54619, term54619.getClass(), "startTime", 0L);
        setBooleanField(term54619, term54619.getClass(), "timeExpired", false);
        setField(term54619, term54619.getClass(), "solution", null);
        setField(term54619, term54619.getClass(), "workers", null);
        setLongField(term54619, term54619.getClass(), "nodesExplored", 0L);
        setIntField(term54619, term54619.getClass(), "minSepSize", 0);
        setIntField(term54619, term54619.getClass(), "vertexConnectivity", 0);
        setIntField(term54619, term54619.getClass(), "greedySepSize", 0);
        setIntField(term54619, term54619.getClass(), "LEFT", 0);
        setIntField(term54619, term54619.getClass(), "RIGHT", 0);
        setIntField(term54619, term54619.getClass(), "SEP", 0);
        setIntField(term54619, term54619.getClass(), "UNKNOWN", 0);
        setIntField(term54619, term54619.getClass(), "FAILURE", 0);
        setIntField(term54619, term54619.getClass(), "POTENTIAL_SOLUTION", 0);
        setIntField(term54619, term54619.getClass(), "maxShoreSize", 0);
        setField(term54619, term54619.getClass(), "graph", null);
        term54634 = new Integer(0);
        term54636 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.BacktrackVertexSeparator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.graph4j.vsp.Node");
        argTypes[3] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[4];
        args[0] = term54634;
        args[1] = term54636;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "propagateAssignment", argTypes, term54619, args);
    }

};


