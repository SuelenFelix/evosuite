package com.todense.viewmodel.random;

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
import static com.todense.viewmodel.random.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RandomGraphGenerator_generateEdges_5682460446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2887;

    public RandomGraphGenerator_generateEdges_5682460446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2887 = newInstance(Class.forName("com.todense.viewmodel.random.RandomGraphGenerator"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.todense.viewmodel.random.RandomGraphGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.todense.model.graph.Graph");
        argTypes[1] = Class.forName("com.todense.viewmodel.random.EdgeGenerator");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "generateEdges", argTypes, term2887, args);
    }

};


