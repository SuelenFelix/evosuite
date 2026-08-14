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

public class BacktrackVertexSeparator_nodesExplored_126849438623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2961;

    public BacktrackVertexSeparator_nodesExplored_126849438623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2961 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator"));
        setLongField(term2961, term2961.getClass(), "timeLimit", 0L);
        setLongField(term2961, term2961.getClass(), "startTime", 0L);
        setBooleanField(term2961, term2961.getClass(), "timeExpired", false);
        setField(term2961, term2961.getClass(), "solution", null);
        setField(term2961, term2961.getClass(), "workers", null);
        setLongField(term2961, term2961.getClass(), "nodesExplored", 0L);
        setIntField(term2961, term2961.getClass(), "minSepSize", 0);
        setIntField(term2961, term2961.getClass(), "vertexConnectivity", 0);
        setIntField(term2961, term2961.getClass(), "greedySepSize", 0);
        setIntField(term2961, term2961.getClass(), "LEFT", 0);
        setIntField(term2961, term2961.getClass(), "RIGHT", 0);
        setIntField(term2961, term2961.getClass(), "SEP", 0);
        setIntField(term2961, term2961.getClass(), "UNKNOWN", 0);
        setIntField(term2961, term2961.getClass(), "FAILURE", 0);
        setIntField(term2961, term2961.getClass(), "POTENTIAL_SOLUTION", 0);
        setIntField(term2961, term2961.getClass(), "maxShoreSize", 0);
        setField(term2961, term2961.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.BacktrackVertexSeparator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nodesExplored", argTypes, term2961, args);
    }

};


