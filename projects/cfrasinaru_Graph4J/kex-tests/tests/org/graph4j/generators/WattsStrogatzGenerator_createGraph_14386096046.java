package org.graph4j.generators;

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
import static org.graph4j.generators.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class WattsStrogatzGenerator_createGraph_14386096046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2495;

    public WattsStrogatzGenerator_createGraph_14386096046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2495 = newInstance(Class.forName("org.graph4j.generators.WattsStrogatzGenerator"));
        setIntField(term2495, term2495.getClass(), "averageDegree", 0);
        setDoubleField(term2495, term2495.getClass(), "rewireProbability", 0.0);
        setDoubleField(term2495, term2495.getClass(), "addProbability", 0.0);
        setField(term2495, term2495.getClass(), "vertices", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.WattsStrogatzGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createGraph", argTypes, term2495, args);
    }

};


