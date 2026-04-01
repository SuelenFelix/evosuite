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

public class PushRelabelMaximumFlow_globalRelabel_150154079911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term920;

    public PushRelabelMaximumFlow_globalRelabel_150154079911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term920 = newInstance(Class.forName("org.graph4j.flow.PushRelabelMaximumFlow"));
        setField(term920, term920.getClass(), "excess", null);
        setField(term920, term920.getClass(), "vertexHeight", null);
        setField(term920, term920.getClass(), "active", null);
        setField(term920, term920.getClass(), "heightCount", null);
        setIntField(term920, term920.getClass(), "relabelCount", 0);
        setIntField(term920, term920.getClass(), "n", 0);
        setField(term920, term920.getClass(), "graph", null);
        setField(term920, term920.getClass(), "initialFlow", null);
        setIntField(term920, term920.getClass(), "numVertices", 0);
        setIntField(term920, term920.getClass(), "source", 0);
        setIntField(term920, term920.getClass(), "sink", 0);
        setIntField(term920, term920.getClass(), "sourceIndex", 0);
        setIntField(term920, term920.getClass(), "sinkIndex", 0);
        setBooleanField(term920, term920.getClass(), "computed", false);
        setField(term920, term920.getClass(), "sourcePart", null);
        setField(term920, term920.getClass(), "sinkPart", null);
        setField(term920, term920.getClass(), "cutEdges", null);
        setField(term920, term920.getClass(), "ekAlg", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.flow.PushRelabelMaximumFlow");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "globalRelabel", argTypes, term920, args);
    }

};


