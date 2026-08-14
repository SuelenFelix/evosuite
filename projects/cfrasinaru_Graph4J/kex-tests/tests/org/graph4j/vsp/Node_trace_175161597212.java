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

public class Node_trace_175161597212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86711;

    public Node_trace_175161597212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86711 = newInstance(Class.forName("org.graph4j.vsp.Node"));
        setField(term86711, term86711.getClass(), "alg", null);
        setIntField(term86711, term86711.getClass(), "vertex", 0);
        setIntField(term86711, term86711.getClass(), "value", 0);
        setField(term86711, term86711.getClass(), "parent", null);
        setField(term86711, term86711.getClass(), "separator", null);
        setField(term86711, term86711.getClass(), "domains", null);
        setField(term86711, term86711.getClass(), "minDomain", null);
        setBooleanField(term86711, term86711.getClass(), "propagator", false);
        setBooleanField(term86711, term86711.getClass(), "failed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "trace", argTypes, term86711, args);
    }

};


