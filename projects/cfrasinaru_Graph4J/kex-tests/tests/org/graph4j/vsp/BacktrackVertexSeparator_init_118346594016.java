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

public class BacktrackVertexSeparator_init_118346594016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54585;

    public BacktrackVertexSeparator_init_118346594016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54585 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator"));
        setLongField(term54585, term54585.getClass(), "timeLimit", 0L);
        setLongField(term54585, term54585.getClass(), "startTime", 0L);
        setBooleanField(term54585, term54585.getClass(), "timeExpired", false);
        setField(term54585, term54585.getClass(), "solution", null);
        setField(term54585, term54585.getClass(), "workers", null);
        setLongField(term54585, term54585.getClass(), "nodesExplored", 0L);
        setIntField(term54585, term54585.getClass(), "minSepSize", 0);
        setIntField(term54585, term54585.getClass(), "vertexConnectivity", 0);
        setIntField(term54585, term54585.getClass(), "greedySepSize", 0);
        setIntField(term54585, term54585.getClass(), "LEFT", 0);
        setIntField(term54585, term54585.getClass(), "RIGHT", 0);
        setIntField(term54585, term54585.getClass(), "SEP", 0);
        setIntField(term54585, term54585.getClass(), "UNKNOWN", 0);
        setIntField(term54585, term54585.getClass(), "FAILURE", 0);
        setIntField(term54585, term54585.getClass(), "POTENTIAL_SOLUTION", 0);
        setIntField(term54585, term54585.getClass(), "maxShoreSize", 0);
        setField(term54585, term54585.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.BacktrackVertexSeparator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "init", argTypes, term54585, args);
    }

};


