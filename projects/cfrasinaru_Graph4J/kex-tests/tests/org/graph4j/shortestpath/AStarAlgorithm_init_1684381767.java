package org.graph4j.shortestpath;

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
import static org.graph4j.shortestpath.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class AStarAlgorithm_init_1684381767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122981;
     Object term122983;

    public AStarAlgorithm_init_1684381767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122981 = new Integer(0);
        term122983 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.AStarAlgorithm");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("org.graph4j.shortestpath.AStarEstimator");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term122981;
        args[2] = term122983;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


