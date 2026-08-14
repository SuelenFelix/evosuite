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
     Object term2872;
     Object term2887;
     Object term2889;

    public BacktrackVertexSeparator_propagateAssignment_187367874618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2872 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator"));
        setLongField(term2872, term2872.getClass(), "timeLimit", 0L);
        setLongField(term2872, term2872.getClass(), "startTime", 0L);
        setBooleanField(term2872, term2872.getClass(), "timeExpired", false);
        setField(term2872, term2872.getClass(), "solution", null);
        setField(term2872, term2872.getClass(), "workers", null);
        setLongField(term2872, term2872.getClass(), "nodesExplored", 0L);
        setIntField(term2872, term2872.getClass(), "minSepSize", 0);
        setIntField(term2872, term2872.getClass(), "vertexConnectivity", 0);
        setIntField(term2872, term2872.getClass(), "greedySepSize", 0);
        setIntField(term2872, term2872.getClass(), "LEFT", 0);
        setIntField(term2872, term2872.getClass(), "RIGHT", 0);
        setIntField(term2872, term2872.getClass(), "SEP", 0);
        setIntField(term2872, term2872.getClass(), "UNKNOWN", 0);
        setIntField(term2872, term2872.getClass(), "FAILURE", 0);
        setIntField(term2872, term2872.getClass(), "POTENTIAL_SOLUTION", 0);
        setIntField(term2872, term2872.getClass(), "maxShoreSize", 0);
        setField(term2872, term2872.getClass(), "graph", null);
        term2887 = new Integer(0);
        term2889 = new Integer(0);
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
        args[0] = term2887;
        args[1] = term2889;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "propagateAssignment", argTypes, term2872, args);
    }

};


