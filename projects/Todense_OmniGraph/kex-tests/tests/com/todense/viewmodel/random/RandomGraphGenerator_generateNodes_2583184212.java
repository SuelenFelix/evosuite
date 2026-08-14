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

public class RandomGraphGenerator_generateNodes_2583184212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2835;
     Object term2836;
     Object term2838;

    public RandomGraphGenerator_generateNodes_2583184212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2835 = newInstance(Class.forName("com.todense.viewmodel.random.RandomGraphGenerator"));
        term2836 = new Integer(0);
        term2838 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.todense.viewmodel.random.RandomGraphGenerator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.todense.model.graph.Graph");
        argTypes[2] = Class.forName("com.todense.viewmodel.random.Generator");
        argTypes[3] = double.class;
        Object[] args = new Object[4];
        args[0] = term2836;
        args[1] = null;
        args[2] = null;
        args[3] = term2838;
        callMethod(klass, "generateNodes", argTypes, term2835, args);
    }

};


