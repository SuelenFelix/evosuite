package org.graph4j.connectivity;

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
import static org.graph4j.connectivity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;
import java.lang.Object;

public class EdgeCut_isValid_19975612988 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6601;

    public EdgeCut_isValid_19975612988() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term6614 = new Double(0.13246999699526574);
        term6601 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        int[] term6602 = (int[]) newIntArray(3);
        int[] term6606 = (int[]) newIntArray(7);
        Object term6616 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setField(term6601, term6601.getClass(), "graph", null);
        setIntElement(term6602, 0, 846881911);
        setIntElement(term6602, 1, 780077059);
        setIntElement(term6602, 2, -924663332);
        setField(term6601, term6601.getClass(), "leftSide", term6602);
        setIntElement(term6606, 0, 579787883);
        setIntElement(term6606, 1, -1104816537);
        setIntElement(term6606, 2, 1997406081);
        setIntElement(term6606, 3, -160995016);
        setIntElement(term6606, 4, -849730731);
        setIntElement(term6606, 5, -1965240023);
        setIntElement(term6606, 6, -86860026);
        setField(term6601, term6601.getClass(), "rightSide", term6606);
        setField(term6601, term6601.getClass(), "weight", term6614);
        setField(term6616, term6616.getClass(), "graph", null);
        setField(term6616, term6616.getClass(), "map", null);
        setField(term6601, term6601.getClass(), "edges", term6616);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.EdgeCut");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isValid", argTypes, term6601, args);
    }

};


