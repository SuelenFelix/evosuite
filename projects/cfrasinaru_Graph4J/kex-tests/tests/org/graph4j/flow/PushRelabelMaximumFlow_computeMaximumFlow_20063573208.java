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

public class PushRelabelMaximumFlow_computeMaximumFlow_20063573208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term889;

    public PushRelabelMaximumFlow_computeMaximumFlow_20063573208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term889 = newInstance(Class.forName("org.graph4j.flow.PushRelabelMaximumFlow"));
        setField(term889, term889.getClass(), "excess", null);
        setField(term889, term889.getClass(), "vertexHeight", null);
        setField(term889, term889.getClass(), "active", null);
        setField(term889, term889.getClass(), "heightCount", null);
        setIntField(term889, term889.getClass(), "relabelCount", 0);
        setIntField(term889, term889.getClass(), "n", 0);
        setField(term889, term889.getClass(), "graph", null);
        setField(term889, term889.getClass(), "initialFlow", null);
        setIntField(term889, term889.getClass(), "numVertices", 0);
        setIntField(term889, term889.getClass(), "source", 0);
        setIntField(term889, term889.getClass(), "sink", 0);
        setIntField(term889, term889.getClass(), "sourceIndex", 0);
        setIntField(term889, term889.getClass(), "sinkIndex", 0);
        setBooleanField(term889, term889.getClass(), "computed", false);
        setField(term889, term889.getClass(), "sourcePart", null);
        setField(term889, term889.getClass(), "sinkPart", null);
        setField(term889, term889.getClass(), "cutEdges", null);
        setField(term889, term889.getClass(), "ekAlg", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.flow.PushRelabelMaximumFlow");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "computeMaximumFlow", argTypes, term889, args);
    }

};


