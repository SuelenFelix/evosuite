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

public class BacktrackVertexSeparator_setValue_80064097417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2853;
     Object term2868;
     Object term2870;

    public BacktrackVertexSeparator_setValue_80064097417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2853 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator"));
        setLongField(term2853, term2853.getClass(), "timeLimit", 0L);
        setLongField(term2853, term2853.getClass(), "startTime", 0L);
        setBooleanField(term2853, term2853.getClass(), "timeExpired", false);
        setField(term2853, term2853.getClass(), "solution", null);
        setField(term2853, term2853.getClass(), "workers", null);
        setLongField(term2853, term2853.getClass(), "nodesExplored", 0L);
        setIntField(term2853, term2853.getClass(), "minSepSize", 0);
        setIntField(term2853, term2853.getClass(), "vertexConnectivity", 0);
        setIntField(term2853, term2853.getClass(), "greedySepSize", 0);
        setIntField(term2853, term2853.getClass(), "LEFT", 0);
        setIntField(term2853, term2853.getClass(), "RIGHT", 0);
        setIntField(term2853, term2853.getClass(), "SEP", 0);
        setIntField(term2853, term2853.getClass(), "UNKNOWN", 0);
        setIntField(term2853, term2853.getClass(), "FAILURE", 0);
        setIntField(term2853, term2853.getClass(), "POTENTIAL_SOLUTION", 0);
        setIntField(term2853, term2853.getClass(), "maxShoreSize", 0);
        setField(term2853, term2853.getClass(), "graph", null);
        term2868 = new Integer(0);
        term2870 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.BacktrackVertexSeparator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.graph4j.vsp.VertexSeparator");
        Object[] args = new Object[3];
        args[0] = term2868;
        args[1] = term2870;
        args[2] = null;
        callMethod(klass, "setValue", argTypes, term2853, args);
    }

};


