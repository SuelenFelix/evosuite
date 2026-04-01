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

public class PathFinder_findShortestPath_1743613961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term911;
     Object term913;
     Object term915;
     Object term917;

    public PathFinder_findShortestPath_1743613961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term911 = newInstance(Class.forName("org.graph4j.route.PathFinder"));
        setField(term911, term911.getClass(), "graph", null);
        setBooleanField(term911, term911.getClass(), "directed", true);
        term913 = new Integer(723812297);
        term915 = new Integer(1639448749);
        term917 = (int[]) newIntArray(1);
        setIntElement(term917, 0, 873659088);
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
        args[1] = term913;
        args[2] = term915;
        args[3] = term917;
        callMethod(klass, "findShortestPath", argTypes, term911, args);
    }

};


