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

public class Node_separator_28340736116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5501;

    public Node_separator_28340736116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5501 = newInstance(Class.forName("org.graph4j.vsp.Node"));
        setField(term5501, term5501.getClass(), "alg", null);
        setIntField(term5501, term5501.getClass(), "vertex", 0);
        setIntField(term5501, term5501.getClass(), "value", 0);
        setField(term5501, term5501.getClass(), "parent", null);
        setField(term5501, term5501.getClass(), "separator", null);
        setField(term5501, term5501.getClass(), "domains", null);
        setField(term5501, term5501.getClass(), "minDomain", null);
        setBooleanField(term5501, term5501.getClass(), "propagator", false);
        setBooleanField(term5501, term5501.getClass(), "failed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "separator", argTypes, term5501, args);
    }

};


