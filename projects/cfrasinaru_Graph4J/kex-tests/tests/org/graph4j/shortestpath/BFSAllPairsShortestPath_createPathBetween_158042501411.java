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

public class BFSAllPairsShortestPath_createPathBetween_158042501411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326;
     Object term328;
     Object term330;

    public BFSAllPairsShortestPath_createPathBetween_158042501411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term326 = newInstance(Class.forName("org.graph4j.shortestpath.BFSAllPairsShortestPath"));
        setField(term326, term326.getClass(), "dist", null);
        setField(term326, term326.getClass(), "before", null);
        setField(term326, term326.getClass(), "graph", null);
        setBooleanField(term326, term326.getClass(), "directed", false);
        term328 = new Integer(0);
        term330 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BFSAllPairsShortestPath");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term328;
        args[1] = term330;
        callMethod(klass, "createPathBetween", argTypes, term326, args);
    }

};


