package org.graph4j.coloring;

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
import static org.graph4j.coloring.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Node_domain_131055830815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term912;
     Object term918;

    public Node_domain_131055830815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term912 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        setField(term912, term912.getClass(), "alg", null);
        setIntField(term912, term912.getClass(), "vertex", 0);
        setIntField(term912, term912.getClass(), "color", 0);
        setField(term912, term912.getClass(), "parent", null);
        setField(term912, term912.getClass(), "coloring", null);
        setField(term912, term912.getClass(), "domains", null);
        setField(term912, term912.getClass(), "minDomain", null);
        setBooleanField(term912, term912.getClass(), "removeSymmetricalColors", false);
        setBooleanField(term912, term912.getClass(), "propagator", false);
        setBooleanField(term912, term912.getClass(), "failed", false);
        term918 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term918;
        callMethod(klass, "domain", argTypes, term912, args);
    }

};


