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

public class BacktrackVertexSeparator_getSeparator_35396584214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2808;

    public BacktrackVertexSeparator_getSeparator_35396584214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2808 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator"));
        setLongField(term2808, term2808.getClass(), "timeLimit", 0L);
        setLongField(term2808, term2808.getClass(), "startTime", 0L);
        setBooleanField(term2808, term2808.getClass(), "timeExpired", false);
        setField(term2808, term2808.getClass(), "solution", null);
        setField(term2808, term2808.getClass(), "workers", null);
        setLongField(term2808, term2808.getClass(), "nodesExplored", 0L);
        setIntField(term2808, term2808.getClass(), "minSepSize", 0);
        setIntField(term2808, term2808.getClass(), "vertexConnectivity", 0);
        setIntField(term2808, term2808.getClass(), "greedySepSize", 0);
        setIntField(term2808, term2808.getClass(), "LEFT", 0);
        setIntField(term2808, term2808.getClass(), "RIGHT", 0);
        setIntField(term2808, term2808.getClass(), "SEP", 0);
        setIntField(term2808, term2808.getClass(), "UNKNOWN", 0);
        setIntField(term2808, term2808.getClass(), "FAILURE", 0);
        setIntField(term2808, term2808.getClass(), "POTENTIAL_SOLUTION", 0);
        setIntField(term2808, term2808.getClass(), "maxShoreSize", 0);
        setField(term2808, term2808.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.BacktrackVertexSeparator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSeparator", argTypes, term2808, args);
    }

};


