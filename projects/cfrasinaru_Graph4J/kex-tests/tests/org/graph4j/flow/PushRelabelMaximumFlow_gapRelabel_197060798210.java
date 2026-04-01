package org.graph4j.flow;

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
import static org.graph4j.flow.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class PushRelabelMaximumFlow_gapRelabel_197060798210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term909;
     Object term918;

    public PushRelabelMaximumFlow_gapRelabel_197060798210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term909 = newInstance(Class.forName("org.graph4j.flow.PushRelabelMaximumFlow"));
        setField(term909, term909.getClass(), "excess", null);
        setField(term909, term909.getClass(), "vertexHeight", null);
        setField(term909, term909.getClass(), "active", null);
        setField(term909, term909.getClass(), "heightCount", null);
        setIntField(term909, term909.getClass(), "relabelCount", 0);
        setIntField(term909, term909.getClass(), "n", 0);
        setField(term909, term909.getClass(), "graph", null);
        setField(term909, term909.getClass(), "initialFlow", null);
        setIntField(term909, term909.getClass(), "numVertices", 0);
        setIntField(term909, term909.getClass(), "source", 0);
        setIntField(term909, term909.getClass(), "sink", 0);
        setIntField(term909, term909.getClass(), "sourceIndex", 0);
        setIntField(term909, term909.getClass(), "sinkIndex", 0);
        setBooleanField(term909, term909.getClass(), "computed", false);
        setField(term909, term909.getClass(), "sourcePart", null);
        setField(term909, term909.getClass(), "sinkPart", null);
        setField(term909, term909.getClass(), "cutEdges", null);
        setField(term909, term909.getClass(), "ekAlg", null);
        term918 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.flow.PushRelabelMaximumFlow");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term918;
        callMethod(klass, "gapRelabel", argTypes, term909, args);
    }

};


