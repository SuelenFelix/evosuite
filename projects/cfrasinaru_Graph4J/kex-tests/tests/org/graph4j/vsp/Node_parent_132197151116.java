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

public class Node_parent_132197151116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86730;

    public Node_parent_132197151116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86730 = newInstance(Class.forName("org.graph4j.vsp.Node"));
        setField(term86730, term86730.getClass(), "alg", null);
        setIntField(term86730, term86730.getClass(), "vertex", 0);
        setIntField(term86730, term86730.getClass(), "value", 0);
        setField(term86730, term86730.getClass(), "parent", null);
        setField(term86730, term86730.getClass(), "separator", null);
        setField(term86730, term86730.getClass(), "domains", null);
        setField(term86730, term86730.getClass(), "minDomain", null);
        setBooleanField(term86730, term86730.getClass(), "propagator", false);
        setBooleanField(term86730, term86730.getClass(), "failed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "parent", argTypes, term86730, args);
    }

};


