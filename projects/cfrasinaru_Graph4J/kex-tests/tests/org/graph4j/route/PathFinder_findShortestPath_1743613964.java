package org.graph4j.route;

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
import static org.graph4j.route.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class PathFinder_findShortestPath_1743613964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term926;
     Object term928;
     Object term930;

    public PathFinder_findShortestPath_1743613964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term926 = newInstance(Class.forName("org.graph4j.route.PathFinder"));
        setField(term926, term926.getClass(), "graph", null);
        setBooleanField(term926, term926.getClass(), "directed", false);
        term928 = new Integer(0);
        term930 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.route.PathFinder");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term928;
        args[2] = term930;
        args[3] = null;
        callMethod(klass, "findShortestPath", argTypes, term926, args);
    }

};


