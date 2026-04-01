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

public class BacktrackVertexSeparator_solve_135865971515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54570;

    public BacktrackVertexSeparator_solve_135865971515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54570 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator"));
        setLongField(term54570, term54570.getClass(), "timeLimit", 0L);
        setLongField(term54570, term54570.getClass(), "startTime", 0L);
        setBooleanField(term54570, term54570.getClass(), "timeExpired", false);
        setField(term54570, term54570.getClass(), "solution", null);
        setField(term54570, term54570.getClass(), "workers", null);
        setLongField(term54570, term54570.getClass(), "nodesExplored", 0L);
        setIntField(term54570, term54570.getClass(), "minSepSize", 0);
        setIntField(term54570, term54570.getClass(), "vertexConnectivity", 0);
        setIntField(term54570, term54570.getClass(), "greedySepSize", 0);
        setIntField(term54570, term54570.getClass(), "LEFT", 0);
        setIntField(term54570, term54570.getClass(), "RIGHT", 0);
        setIntField(term54570, term54570.getClass(), "SEP", 0);
        setIntField(term54570, term54570.getClass(), "UNKNOWN", 0);
        setIntField(term54570, term54570.getClass(), "FAILURE", 0);
        setIntField(term54570, term54570.getClass(), "POTENTIAL_SOLUTION", 0);
        setIntField(term54570, term54570.getClass(), "maxShoreSize", 0);
        setField(term54570, term54570.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.BacktrackVertexSeparator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "solve", argTypes, term54570, args);
    }

};


