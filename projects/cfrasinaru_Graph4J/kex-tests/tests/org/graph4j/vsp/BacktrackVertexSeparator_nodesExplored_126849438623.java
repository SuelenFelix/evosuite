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
     Object term54708;

    public BacktrackVertexSeparator_nodesExplored_126849438623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54708 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator"));
        setLongField(term54708, term54708.getClass(), "timeLimit", 0L);
        setLongField(term54708, term54708.getClass(), "startTime", 0L);
        setBooleanField(term54708, term54708.getClass(), "timeExpired", false);
        setField(term54708, term54708.getClass(), "solution", null);
        setField(term54708, term54708.getClass(), "workers", null);
        setLongField(term54708, term54708.getClass(), "nodesExplored", 0L);
        setIntField(term54708, term54708.getClass(), "minSepSize", 0);
        setIntField(term54708, term54708.getClass(), "vertexConnectivity", 0);
        setIntField(term54708, term54708.getClass(), "greedySepSize", 0);
        setIntField(term54708, term54708.getClass(), "LEFT", 0);
        setIntField(term54708, term54708.getClass(), "RIGHT", 0);
        setIntField(term54708, term54708.getClass(), "SEP", 0);
        setIntField(term54708, term54708.getClass(), "UNKNOWN", 0);
        setIntField(term54708, term54708.getClass(), "FAILURE", 0);
        setIntField(term54708, term54708.getClass(), "POTENTIAL_SOLUTION", 0);
        setIntField(term54708, term54708.getClass(), "maxShoreSize", 0);
        setField(term54708, term54708.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.BacktrackVertexSeparator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nodesExplored", argTypes, term54708, args);
    }

};


