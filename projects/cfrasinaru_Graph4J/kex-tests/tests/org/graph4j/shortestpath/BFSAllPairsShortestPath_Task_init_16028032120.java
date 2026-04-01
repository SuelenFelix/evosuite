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
import java.lang.Object;
import java.lang.Integer;

public class BFSAllPairsShortestPath_Task_init_16028032120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3235;
     Object term3249;

    public BFSAllPairsShortestPath_Task_init_16028032120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3235 = newInstance(Class.forName("org.graph4j.shortestpath.BFSAllPairsShortestPath"));
        Object[] term3236 = (Object[]) newArray("[D", 3);
        double[] term3237 = (double[]) newDoubleArray(0);
        double[] term3238 = (double[]) newDoubleArray(2);
        double[] term3241 = (double[]) newDoubleArray(5);
        Object[] term3247 = (Object[]) newArray("[I", 0);
        setElement(term3236, 0, term3237);
        setDoubleElement(term3238, 0, 0.23604395020255575);
        setDoubleElement(term3238, 1, 0.7752202944026838);
        setElement(term3236, 1, term3238);
        setDoubleElement(term3241, 0, 0.6814473488244137);
        setDoubleElement(term3241, 1, 0.7526628774283542);
        setDoubleElement(term3241, 2, 0.6609555690482892);
        setDoubleElement(term3241, 3, 0.20773286305836303);
        setDoubleElement(term3241, 4, 0.6902120717646517);
        setElement(term3236, 2, term3241);
        setField(term3235, term3235.getClass(), "dist", term3236);
        setField(term3235, term3235.getClass(), "before", term3247);
        setField(term3235, term3235.getClass(), "graph", null);
        setBooleanField(term3235, term3235.getClass(), "directed", true);
        term3249 = new Integer(2059896693);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BFSAllPairsShortestPath$Task");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.shortestpath.BFSAllPairsShortestPath");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term3235;
        args[1] = term3249;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


