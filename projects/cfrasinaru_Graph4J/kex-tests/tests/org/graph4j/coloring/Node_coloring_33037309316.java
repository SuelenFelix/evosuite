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

public class Node_coloring_33037309316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term920;

    public Node_coloring_33037309316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term920 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        setField(term920, term920.getClass(), "alg", null);
        setIntField(term920, term920.getClass(), "vertex", 0);
        setIntField(term920, term920.getClass(), "color", 0);
        setField(term920, term920.getClass(), "parent", null);
        setField(term920, term920.getClass(), "coloring", null);
        setField(term920, term920.getClass(), "domains", null);
        setField(term920, term920.getClass(), "minDomain", null);
        setBooleanField(term920, term920.getClass(), "removeSymmetricalColors", false);
        setBooleanField(term920, term920.getClass(), "propagator", false);
        setBooleanField(term920, term920.getClass(), "failed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "coloring", argTypes, term920, args);
    }

};


