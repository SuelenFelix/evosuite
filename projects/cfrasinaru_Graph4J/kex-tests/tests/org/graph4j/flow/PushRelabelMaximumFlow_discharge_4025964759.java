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

public class PushRelabelMaximumFlow_discharge_4025964759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term898;
     Object term907;

    public PushRelabelMaximumFlow_discharge_4025964759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term898 = newInstance(Class.forName("org.graph4j.flow.PushRelabelMaximumFlow"));
        setField(term898, term898.getClass(), "excess", null);
        setField(term898, term898.getClass(), "vertexHeight", null);
        setField(term898, term898.getClass(), "active", null);
        setField(term898, term898.getClass(), "heightCount", null);
        setIntField(term898, term898.getClass(), "relabelCount", 0);
        setIntField(term898, term898.getClass(), "n", 0);
        setField(term898, term898.getClass(), "graph", null);
        setField(term898, term898.getClass(), "initialFlow", null);
        setIntField(term898, term898.getClass(), "numVertices", 0);
        setIntField(term898, term898.getClass(), "source", 0);
        setIntField(term898, term898.getClass(), "sink", 0);
        setIntField(term898, term898.getClass(), "sourceIndex", 0);
        setIntField(term898, term898.getClass(), "sinkIndex", 0);
        setBooleanField(term898, term898.getClass(), "computed", false);
        setField(term898, term898.getClass(), "sourcePart", null);
        setField(term898, term898.getClass(), "sinkPart", null);
        setField(term898, term898.getClass(), "cutEdges", null);
        setField(term898, term898.getClass(), "ekAlg", null);
        term907 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.flow.PushRelabelMaximumFlow");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term907;
        callMethod(klass, "discharge", argTypes, term898, args);
    }

};


