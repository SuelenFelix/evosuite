package org.graph4j.examples;

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
import static org.graph4j.examples.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ShortestPathExample_findShortestPath_12154542411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term963;

    public ShortestPathExample_findShortestPath_12154542411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term963 = newInstance(Class.forName("org.graph4j.examples.ShortestPathExample"));
        setIntField(term963, term963.getClass(), "numLocations", 0);
        setField(term963, term963.getClass(), "locations", null);
        setField(term963, term963.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.examples.ShortestPathExample");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.examples.Location");
        argTypes[1] = Class.forName("org.graph4j.examples.Location");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "findShortestPath", argTypes, term963, args);
    }

};


