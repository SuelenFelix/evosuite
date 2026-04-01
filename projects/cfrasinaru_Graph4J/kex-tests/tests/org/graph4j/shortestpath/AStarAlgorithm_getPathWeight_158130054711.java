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

public class AStarAlgorithm_getPathWeight_158130054711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3210;

    public AStarAlgorithm_getPathWeight_158130054711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3210 = newInstance(Class.forName("org.graph4j.shortestpath.AStarAlgorithm"));
        setIntField(term3210, term3210.getClass(), "source", 0);
        setIntField(term3210, term3210.getClass(), "target", 0);
        setField(term3210, term3210.getClass(), "vertices", null);
        setField(term3210, term3210.getClass(), "cost", null);
        setField(term3210, term3210.getClass(), "before", null);
        setField(term3210, term3210.getClass(), "size", null);
        setField(term3210, term3210.getClass(), "solved", null);
        setIntField(term3210, term3210.getClass(), "numSolved", 0);
        setField(term3210, term3210.getClass(), "heap", null);
        setField(term3210, term3210.getClass(), "heuristic", null);
        setField(term3210, term3210.getClass(), "graph", null);
        setBooleanField(term3210, term3210.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.AStarAlgorithm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPathWeight", argTypes, term3210, args);
    }

};


