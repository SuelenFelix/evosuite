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

public class AStarAlgorithm_getSource_6555623268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3195;

    public AStarAlgorithm_getSource_6555623268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3195 = newInstance(Class.forName("org.graph4j.shortestpath.AStarAlgorithm"));
        setIntField(term3195, term3195.getClass(), "source", 0);
        setIntField(term3195, term3195.getClass(), "target", 0);
        setField(term3195, term3195.getClass(), "vertices", null);
        setField(term3195, term3195.getClass(), "cost", null);
        setField(term3195, term3195.getClass(), "before", null);
        setField(term3195, term3195.getClass(), "size", null);
        setField(term3195, term3195.getClass(), "solved", null);
        setIntField(term3195, term3195.getClass(), "numSolved", 0);
        setField(term3195, term3195.getClass(), "heap", null);
        setField(term3195, term3195.getClass(), "heuristic", null);
        setField(term3195, term3195.getClass(), "graph", null);
        setBooleanField(term3195, term3195.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.AStarAlgorithm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSource", argTypes, term3195, args);
    }

};


