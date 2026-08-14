package com.todense.viewmodel.layout;

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
import static com.todense.viewmodel.layout.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GraphCoarsener_contractEdge_69150958012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1496;

    public GraphCoarsener_contractEdge_69150958012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1496 = newInstance(Class.forName("com.todense.viewmodel.layout.GraphCoarsener"));
        setField(term1496, term1496.getClass(), "originalGraph", null);
        setField(term1496, term1496.getClass(), "graphManager", null);
        setField(term1496, term1496.getClass(), "graphSequence", null);
        setField(term1496, term1496.getClass(), "collapseMaps", null);
        setField(term1496, term1496.getClass(), "nodeWeights", null);
        setDoubleField(term1496, term1496.getClass(), "reductionRate", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.todense.viewmodel.layout.GraphCoarsener");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.todense.model.graph.Graph");
        argTypes[1] = Class.forName("com.todense.model.graph.Edge");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "contractEdge", argTypes, term1496, args);
    }

};


