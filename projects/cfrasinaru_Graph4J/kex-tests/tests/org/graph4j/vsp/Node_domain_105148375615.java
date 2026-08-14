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

public class Node_domain_105148375615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5494;
     Object term5499;

    public Node_domain_105148375615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5494 = newInstance(Class.forName("org.graph4j.vsp.Node"));
        setField(term5494, term5494.getClass(), "alg", null);
        setIntField(term5494, term5494.getClass(), "vertex", 0);
        setIntField(term5494, term5494.getClass(), "value", 0);
        setField(term5494, term5494.getClass(), "parent", null);
        setField(term5494, term5494.getClass(), "separator", null);
        setField(term5494, term5494.getClass(), "domains", null);
        setField(term5494, term5494.getClass(), "minDomain", null);
        setBooleanField(term5494, term5494.getClass(), "propagator", false);
        setBooleanField(term5494, term5494.getClass(), "failed", false);
        term5499 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5499;
        callMethod(klass, "domain", argTypes, term5494, args);
    }

};


