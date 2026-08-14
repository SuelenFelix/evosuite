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

public class WattsStrogatzGenerator_addEdges_17668769797 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2499;

    public WattsStrogatzGenerator_addEdges_17668769797() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2499 = newInstance(Class.forName("org.graph4j.generators.WattsStrogatzGenerator"));
        setIntField(term2499, term2499.getClass(), "averageDegree", 0);
        setDoubleField(term2499, term2499.getClass(), "rewireProbability", 0.0);
        setDoubleField(term2499, term2499.getClass(), "addProbability", 0.0);
        setField(term2499, term2499.getClass(), "vertices", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.WattsStrogatzGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addEdges", argTypes, term2499, args);
    }

};


