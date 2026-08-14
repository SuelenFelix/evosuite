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

public class GraphCoarsener_reconstruct_2692875129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1490;

    public GraphCoarsener_reconstruct_2692875129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1490 = newInstance(Class.forName("com.todense.viewmodel.layout.GraphCoarsener"));
        setField(term1490, term1490.getClass(), "originalGraph", null);
        setField(term1490, term1490.getClass(), "graphManager", null);
        setField(term1490, term1490.getClass(), "graphSequence", null);
        setField(term1490, term1490.getClass(), "collapseMaps", null);
        setField(term1490, term1490.getClass(), "nodeWeights", null);
        setDoubleField(term1490, term1490.getClass(), "reductionRate", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.todense.viewmodel.layout.GraphCoarsener");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reconstruct", argTypes, term1490, args);
    }

};


