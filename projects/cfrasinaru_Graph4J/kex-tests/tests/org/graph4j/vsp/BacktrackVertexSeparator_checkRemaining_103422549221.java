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

public class BacktrackVertexSeparator_checkRemaining_103422549221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54678;

    public BacktrackVertexSeparator_checkRemaining_103422549221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54678 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator"));
        setLongField(term54678, term54678.getClass(), "timeLimit", 0L);
        setLongField(term54678, term54678.getClass(), "startTime", 0L);
        setBooleanField(term54678, term54678.getClass(), "timeExpired", false);
        setField(term54678, term54678.getClass(), "solution", null);
        setField(term54678, term54678.getClass(), "workers", null);
        setLongField(term54678, term54678.getClass(), "nodesExplored", 0L);
        setIntField(term54678, term54678.getClass(), "minSepSize", 0);
        setIntField(term54678, term54678.getClass(), "vertexConnectivity", 0);
        setIntField(term54678, term54678.getClass(), "greedySepSize", 0);
        setIntField(term54678, term54678.getClass(), "LEFT", 0);
        setIntField(term54678, term54678.getClass(), "RIGHT", 0);
        setIntField(term54678, term54678.getClass(), "SEP", 0);
        setIntField(term54678, term54678.getClass(), "UNKNOWN", 0);
        setIntField(term54678, term54678.getClass(), "FAILURE", 0);
        setIntField(term54678, term54678.getClass(), "POTENTIAL_SOLUTION", 0);
        setIntField(term54678, term54678.getClass(), "maxShoreSize", 0);
        setField(term54678, term54678.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.BacktrackVertexSeparator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.vsp.Node");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "checkRemaining", argTypes, term54678, args);
    }

};


