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
     Object term2931;

    public BacktrackVertexSeparator_checkRemaining_103422549221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2931 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator"));
        setLongField(term2931, term2931.getClass(), "timeLimit", 0L);
        setLongField(term2931, term2931.getClass(), "startTime", 0L);
        setBooleanField(term2931, term2931.getClass(), "timeExpired", false);
        setField(term2931, term2931.getClass(), "solution", null);
        setField(term2931, term2931.getClass(), "workers", null);
        setLongField(term2931, term2931.getClass(), "nodesExplored", 0L);
        setIntField(term2931, term2931.getClass(), "minSepSize", 0);
        setIntField(term2931, term2931.getClass(), "vertexConnectivity", 0);
        setIntField(term2931, term2931.getClass(), "greedySepSize", 0);
        setIntField(term2931, term2931.getClass(), "LEFT", 0);
        setIntField(term2931, term2931.getClass(), "RIGHT", 0);
        setIntField(term2931, term2931.getClass(), "SEP", 0);
        setIntField(term2931, term2931.getClass(), "UNKNOWN", 0);
        setIntField(term2931, term2931.getClass(), "FAILURE", 0);
        setIntField(term2931, term2931.getClass(), "POTENTIAL_SOLUTION", 0);
        setIntField(term2931, term2931.getClass(), "maxShoreSize", 0);
        setField(term2931, term2931.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.BacktrackVertexSeparator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.vsp.Node");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "checkRemaining", argTypes, term2931, args);
    }

};


