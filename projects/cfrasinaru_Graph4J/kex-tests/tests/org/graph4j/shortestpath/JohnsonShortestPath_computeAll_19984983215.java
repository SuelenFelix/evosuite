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

public class JohnsonShortestPath_computeAll_19984983215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term861;

    public JohnsonShortestPath_computeAll_19984983215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term861 = newInstance(Class.forName("org.graph4j.shortestpath.JohnsonShortestPath"));
        double[] term862 = (double[]) newDoubleArray(6);
        Object[] term869 = (Object[]) newArray("org.graph4j.shortestpath.SingleSourceShortestPath", 7);
        Object[] term870 = (Object[]) newArray("[D", 0);
        setField(term861, term861.getClass(), "auxGraph", null);
        setDoubleElement(term862, 0, 0.8732511635701926);
        setDoubleElement(term862, 1, 0.8977760608415547);
        setDoubleElement(term862, 2, 0.3107086749915061);
        setDoubleElement(term862, 3, 0.18330246984174836);
        setDoubleElement(term862, 4, 0.1941255640189572);
        setDoubleElement(term862, 5, 0.2889811903417371);
        setField(term861, term861.getClass(), "h", term862);
        setField(term861, term861.getClass(), "algs", term869);
        setField(term861, term861.getClass(), "weights", term870);
        setField(term861, term861.getClass(), "graph", null);
        setBooleanField(term861, term861.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.JohnsonShortestPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "computeAll", argTypes, term861, args);
    }

};


