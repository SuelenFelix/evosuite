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
import java.lang.Integer;
import java.lang.Double;

public class RandomGraphGenerator_generateNodesMinDist_16242209753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2840;
     Object term2841;
     Object term2843;

    public RandomGraphGenerator_generateNodesMinDist_16242209753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2840 = newInstance(Class.forName("com.todense.viewmodel.random.RandomGraphGenerator"));
        term2841 = new Integer(0);
        term2843 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.todense.viewmodel.random.RandomGraphGenerator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        argTypes[2] = Class.forName("com.todense.model.graph.Graph");
        argTypes[3] = Class.forName("com.todense.viewmodel.random.Generator");
        Object[] args = new Object[4];
        args[0] = term2841;
        args[1] = term2843;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "generateNodesMinDist", argTypes, term2840, args);
    }

};


