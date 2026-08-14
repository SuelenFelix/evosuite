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

public class JohnsonShortestPath_prepare_13689871548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term989;

    public JohnsonShortestPath_prepare_13689871548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term989 = newInstance(Class.forName("org.graph4j.shortestpath.JohnsonShortestPath"));
        setField(term989, term989.getClass(), "auxGraph", null);
        setField(term989, term989.getClass(), "h", null);
        setField(term989, term989.getClass(), "algs", null);
        setField(term989, term989.getClass(), "weights", null);
        setField(term989, term989.getClass(), "graph", null);
        setBooleanField(term989, term989.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.JohnsonShortestPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "prepare", argTypes, term989, args);
    }

};


