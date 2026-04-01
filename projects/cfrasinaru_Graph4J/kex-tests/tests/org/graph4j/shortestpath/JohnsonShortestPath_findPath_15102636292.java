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

public class JohnsonShortestPath_findPath_15102636292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term746;
     Object term758;
     Object term760;

    public JohnsonShortestPath_findPath_15102636292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term746 = newInstance(Class.forName("org.graph4j.shortestpath.JohnsonShortestPath"));
        double[] term747 = (double[]) newDoubleArray(6);
        Object[] term754 = (Object[]) newArray("org.graph4j.shortestpath.SingleSourceShortestPath", 5);
        Object[] term755 = (Object[]) newArray("[D", 1);
        double[] term756 = (double[]) newDoubleArray(0);
        setField(term746, term746.getClass(), "auxGraph", null);
        setDoubleElement(term747, 0, 0.9165240441138934);
        setDoubleElement(term747, 1, 0.22227423914231126);
        setDoubleElement(term747, 2, 0.06480976831423468);
        setDoubleElement(term747, 3, 0.8490790645379176);
        setDoubleElement(term747, 4, 0.23129126164078717);
        setDoubleElement(term747, 5, 0.6047138318674447);
        setField(term746, term746.getClass(), "h", term747);
        setField(term746, term746.getClass(), "algs", term754);
        setElement(term755, 0, term756);
        setField(term746, term746.getClass(), "weights", term755);
        setField(term746, term746.getClass(), "graph", null);
        setBooleanField(term746, term746.getClass(), "directed", true);
        term758 = new Integer(96566506);
        term760 = new Integer(-343325701);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.JohnsonShortestPath");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term758;
        args[1] = term760;
        callMethod(klass, "findPath", argTypes, term746, args);
    }

};


