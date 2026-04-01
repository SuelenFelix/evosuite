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

public class BFSSingleSourceShortestPath_getSource_17573028559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term600;

    public BFSSingleSourceShortestPath_getSource_17573028559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term600 = newInstance(Class.forName("org.graph4j.shortestpath.BFSSingleSourceShortestPath"));
        setIntField(term600, term600.getClass(), "source", 0);
        setField(term600, term600.getClass(), "dist", null);
        setField(term600, term600.getClass(), "before", null);
        setField(term600, term600.getClass(), "graph", null);
        setBooleanField(term600, term600.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BFSSingleSourceShortestPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSource", argTypes, term600, args);
    }

};


