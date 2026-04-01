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
     Object term54659;
     Object term54674;
     Object term54676;

    public BacktrackVertexSeparator_checkCapacity_193848128020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54659 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator"));
        setLongField(term54659, term54659.getClass(), "timeLimit", 0L);
        setLongField(term54659, term54659.getClass(), "startTime", 0L);
        setBooleanField(term54659, term54659.getClass(), "timeExpired", false);
        setField(term54659, term54659.getClass(), "solution", null);
        setField(term54659, term54659.getClass(), "workers", null);
        setLongField(term54659, term54659.getClass(), "nodesExplored", 0L);
        setIntField(term54659, term54659.getClass(), "minSepSize", 0);
        setIntField(term54659, term54659.getClass(), "vertexConnectivity", 0);
        setIntField(term54659, term54659.getClass(), "greedySepSize", 0);
        setIntField(term54659, term54659.getClass(), "LEFT", 0);
        setIntField(term54659, term54659.getClass(), "RIGHT", 0);
        setIntField(term54659, term54659.getClass(), "SEP", 0);
        setIntField(term54659, term54659.getClass(), "UNKNOWN", 0);
        setIntField(term54659, term54659.getClass(), "FAILURE", 0);
        setIntField(term54659, term54659.getClass(), "POTENTIAL_SOLUTION", 0);
        setIntField(term54659, term54659.getClass(), "maxShoreSize", 0);
        setField(term54659, term54659.getClass(), "graph", null);
        term54674 = new Integer(0);
        term54676 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.BacktrackVertexSeparator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.graph4j.vsp.Node");
        Object[] args = new Object[3];
        args[0] = term54674;
        args[1] = term54676;
        args[2] = null;
        callMethod(klass, "checkCapacity", argTypes, term54659, args);
    }

};


