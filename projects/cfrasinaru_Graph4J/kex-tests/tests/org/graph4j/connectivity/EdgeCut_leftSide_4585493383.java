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

public class EdgeCut_leftSide_4585493383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6459;

    public EdgeCut_leftSide_4585493383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term6470 = new Double(0.20737514139742264);
        term6459 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        int[] term6460 = (int[]) newIntArray(2);
        int[] term6463 = (int[]) newIntArray(6);
        Object term6472 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setField(term6459, term6459.getClass(), "graph", null);
        setIntElement(term6460, 0, -315070279);
        setIntElement(term6460, 1, 62449386);
        setField(term6459, term6459.getClass(), "leftSide", term6460);
        setIntElement(term6463, 0, -1488558129);
        setIntElement(term6463, 1, -929614389);
        setIntElement(term6463, 2, 1585326879);
        setIntElement(term6463, 3, 1161195592);
        setIntElement(term6463, 4, -1012640616);
        setIntElement(term6463, 5, -552664740);
        setField(term6459, term6459.getClass(), "rightSide", term6463);
        setField(term6459, term6459.getClass(), "weight", term6470);
        setField(term6472, term6472.getClass(), "graph", null);
        setField(term6472, term6472.getClass(), "map", null);
        setField(term6459, term6459.getClass(), "edges", term6472);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.EdgeCut");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "leftSide", argTypes, term6459, args);
    }

};


