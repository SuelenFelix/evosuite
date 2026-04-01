package org.graph4j.eulerian;

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
import static org.graph4j.eulerian.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class HierholzerEulerianCircuit_findCircuit_11100828491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17;

    public HierholzerEulerianCircuit_findCircuit_11100828491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17 = newInstance(Class.forName("org.graph4j.eulerian.HierholzerEulerianCircuit"));
        setField(term17, term17.getClass(), "graph", null);
        setBooleanField(term17, term17.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.eulerian.HierholzerEulerianCircuit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findCircuit", argTypes, term17, args);
    }

};


