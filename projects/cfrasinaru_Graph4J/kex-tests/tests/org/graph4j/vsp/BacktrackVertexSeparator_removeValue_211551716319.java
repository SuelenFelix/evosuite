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

public class BacktrackVertexSeparator_removeValue_211551716319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2891;
     Object term2906;
     Object term2908;
     Object term2910;

    public BacktrackVertexSeparator_removeValue_211551716319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2891 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator"));
        setLongField(term2891, term2891.getClass(), "timeLimit", 0L);
        setLongField(term2891, term2891.getClass(), "startTime", 0L);
        setBooleanField(term2891, term2891.getClass(), "timeExpired", false);
        setField(term2891, term2891.getClass(), "solution", null);
        setField(term2891, term2891.getClass(), "workers", null);
        setLongField(term2891, term2891.getClass(), "nodesExplored", 0L);
        setIntField(term2891, term2891.getClass(), "minSepSize", 0);
        setIntField(term2891, term2891.getClass(), "vertexConnectivity", 0);
        setIntField(term2891, term2891.getClass(), "greedySepSize", 0);
        setIntField(term2891, term2891.getClass(), "LEFT", 0);
        setIntField(term2891, term2891.getClass(), "RIGHT", 0);
        setIntField(term2891, term2891.getClass(), "SEP", 0);
        setIntField(term2891, term2891.getClass(), "UNKNOWN", 0);
        setIntField(term2891, term2891.getClass(), "FAILURE", 0);
        setIntField(term2891, term2891.getClass(), "POTENTIAL_SOLUTION", 0);
        setIntField(term2891, term2891.getClass(), "maxShoreSize", 0);
        setField(term2891, term2891.getClass(), "graph", null);
        term2906 = new Integer(0);
        term2908 = new Integer(0);
        term2910 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.BacktrackVertexSeparator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.graph4j.vsp.Node");
        argTypes[3] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = term2906;
        args[1] = term2908;
        args[2] = null;
        args[3] = null;
        args[4] = term2910;
        callMethod(klass, "removeValue", argTypes, term2891, args);
    }

};


