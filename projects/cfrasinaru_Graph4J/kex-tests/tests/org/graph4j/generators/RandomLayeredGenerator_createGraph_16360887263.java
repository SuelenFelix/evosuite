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

public class RandomLayeredGenerator_createGraph_16360887263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2583;

    public RandomLayeredGenerator_createGraph_16360887263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2583 = newInstance(Class.forName("org.graph4j.generators.RandomLayeredGenerator"));
        setIntField(term2583, term2583.getClass(), "numLayers", 0);
        setIntField(term2583, term2583.getClass(), "minVerticesLayer", 0);
        setIntField(term2583, term2583.getClass(), "maxVerticesLayer", 0);
        setDoubleField(term2583, term2583.getClass(), "intraLayerEdgeProbability", 0.0);
        setDoubleField(term2583, term2583.getClass(), "interLayerEdgeProbability", 0.0);
        setField(term2583, term2583.getClass(), "interLayerDecrease", null);
        setField(term2583, term2583.getClass(), "vertices", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomLayeredGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createGraph", argTypes, term2583, args);
    }

};


