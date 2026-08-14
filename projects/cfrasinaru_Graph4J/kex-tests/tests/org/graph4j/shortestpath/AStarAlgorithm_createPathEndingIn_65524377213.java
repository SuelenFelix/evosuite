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

public class AStarAlgorithm_createPathEndingIn_65524377213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3220;
     Object term3225;

    public AStarAlgorithm_createPathEndingIn_65524377213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3220 = newInstance(Class.forName("org.graph4j.shortestpath.AStarAlgorithm"));
        setIntField(term3220, term3220.getClass(), "source", 0);
        setIntField(term3220, term3220.getClass(), "target", 0);
        setField(term3220, term3220.getClass(), "vertices", null);
        setField(term3220, term3220.getClass(), "cost", null);
        setField(term3220, term3220.getClass(), "before", null);
        setField(term3220, term3220.getClass(), "size", null);
        setField(term3220, term3220.getClass(), "solved", null);
        setIntField(term3220, term3220.getClass(), "numSolved", 0);
        setField(term3220, term3220.getClass(), "heap", null);
        setField(term3220, term3220.getClass(), "heuristic", null);
        setField(term3220, term3220.getClass(), "graph", null);
        setBooleanField(term3220, term3220.getClass(), "directed", false);
        term3225 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.AStarAlgorithm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3225;
        callMethod(klass, "createPathEndingIn", argTypes, term3220, args);
    }

};


