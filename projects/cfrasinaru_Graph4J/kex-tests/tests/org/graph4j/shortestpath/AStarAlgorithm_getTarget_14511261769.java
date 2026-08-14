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

public class AStarAlgorithm_getTarget_14511261769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3200;

    public AStarAlgorithm_getTarget_14511261769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3200 = newInstance(Class.forName("org.graph4j.shortestpath.AStarAlgorithm"));
        setIntField(term3200, term3200.getClass(), "source", 0);
        setIntField(term3200, term3200.getClass(), "target", 0);
        setField(term3200, term3200.getClass(), "vertices", null);
        setField(term3200, term3200.getClass(), "cost", null);
        setField(term3200, term3200.getClass(), "before", null);
        setField(term3200, term3200.getClass(), "size", null);
        setField(term3200, term3200.getClass(), "solved", null);
        setIntField(term3200, term3200.getClass(), "numSolved", 0);
        setField(term3200, term3200.getClass(), "heap", null);
        setField(term3200, term3200.getClass(), "heuristic", null);
        setField(term3200, term3200.getClass(), "graph", null);
        setBooleanField(term3200, term3200.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.AStarAlgorithm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTarget", argTypes, term3200, args);
    }

};


