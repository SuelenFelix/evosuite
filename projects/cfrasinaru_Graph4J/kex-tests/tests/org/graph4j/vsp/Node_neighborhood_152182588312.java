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

public class Node_neighborhood_152182588312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5479;

    public Node_neighborhood_152182588312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5479 = newInstance(Class.forName("org.graph4j.vsp.Node"));
        setField(term5479, term5479.getClass(), "alg", null);
        setIntField(term5479, term5479.getClass(), "vertex", 0);
        setIntField(term5479, term5479.getClass(), "value", 0);
        setField(term5479, term5479.getClass(), "parent", null);
        setField(term5479, term5479.getClass(), "separator", null);
        setField(term5479, term5479.getClass(), "domains", null);
        setField(term5479, term5479.getClass(), "minDomain", null);
        setBooleanField(term5479, term5479.getClass(), "propagator", false);
        setBooleanField(term5479, term5479.getClass(), "failed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "neighborhood", argTypes, term5479, args);
    }

};


