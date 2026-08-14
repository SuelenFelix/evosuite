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

public class BacktrackVertexSeparator_checkCapacity_193848128020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2912;
     Object term2927;
     Object term2929;

    public BacktrackVertexSeparator_checkCapacity_193848128020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2912 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator"));
        setLongField(term2912, term2912.getClass(), "timeLimit", 0L);
        setLongField(term2912, term2912.getClass(), "startTime", 0L);
        setBooleanField(term2912, term2912.getClass(), "timeExpired", false);
        setField(term2912, term2912.getClass(), "solution", null);
        setField(term2912, term2912.getClass(), "workers", null);
        setLongField(term2912, term2912.getClass(), "nodesExplored", 0L);
        setIntField(term2912, term2912.getClass(), "minSepSize", 0);
        setIntField(term2912, term2912.getClass(), "vertexConnectivity", 0);
        setIntField(term2912, term2912.getClass(), "greedySepSize", 0);
        setIntField(term2912, term2912.getClass(), "LEFT", 0);
        setIntField(term2912, term2912.getClass(), "RIGHT", 0);
        setIntField(term2912, term2912.getClass(), "SEP", 0);
        setIntField(term2912, term2912.getClass(), "UNKNOWN", 0);
        setIntField(term2912, term2912.getClass(), "FAILURE", 0);
        setIntField(term2912, term2912.getClass(), "POTENTIAL_SOLUTION", 0);
        setIntField(term2912, term2912.getClass(), "maxShoreSize", 0);
        setField(term2912, term2912.getClass(), "graph", null);
        term2927 = new Integer(0);
        term2929 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.BacktrackVertexSeparator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.graph4j.vsp.Node");
        Object[] args = new Object[3];
        args[0] = term2927;
        args[1] = term2929;
        args[2] = null;
        callMethod(klass, "checkCapacity", argTypes, term2912, args);
    }

};


