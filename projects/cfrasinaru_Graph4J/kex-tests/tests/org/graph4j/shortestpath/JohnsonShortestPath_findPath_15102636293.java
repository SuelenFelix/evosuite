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

public class JohnsonShortestPath_findPath_15102636293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70955;
     Object term70974;
     Object term70976;

    public JohnsonShortestPath_findPath_15102636293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70955 = newInstance(Class.forName("org.graph4j.shortestpath.JohnsonShortestPath"));
        double[] term70956 = (double[]) newDoubleArray(1);
        Object[] term70958 = (Object[]) newArray("org.graph4j.shortestpath.SingleSourceShortestPath", 0);
        Object[] term70959 = (Object[]) newArray("[D", 2);
        double[] term70960 = (double[]) newDoubleArray(3);
        double[] term70964 = (double[]) newDoubleArray(8);
        setField(term70955, term70955.getClass(), "auxGraph", null);
        setDoubleElement(term70956, 0, 0.841837458693896);
        setField(term70955, term70955.getClass(), "h", term70956);
        setField(term70955, term70955.getClass(), "algs", term70958);
        setDoubleElement(term70960, 0, 0.736416697746672);
        setDoubleElement(term70960, 1, 0.018369089859091248);
        setDoubleElement(term70960, 2, 0.5101266569203141);
        setElement(term70959, 0, term70960);
        setDoubleElement(term70964, 0, 0.3489392479613673);
        setDoubleElement(term70964, 1, 0.5523710694493319);
        setDoubleElement(term70964, 2, 0.6471133671501836);
        setDoubleElement(term70964, 3, 0.8507902492268682);
        setDoubleElement(term70964, 4, 0.4021435407016829);
        setDoubleElement(term70964, 5, 0.31671192812476);
        setDoubleElement(term70964, 6, 0.3736507356101546);
        setDoubleElement(term70964, 7, 0.1423296244978659);
        setElement(term70959, 1, term70964);
        setField(term70955, term70955.getClass(), "weights", term70959);
        setField(term70955, term70955.getClass(), "graph", null);
        setBooleanField(term70955, term70955.getClass(), "directed", true);
        term70974 = new Integer(-2047169809);
        term70976 = new Integer(1874665757);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.JohnsonShortestPath");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term70974;
        args[1] = term70976;
        callMethod(klass, "findPath", argTypes, term70955, args);
    }

};


