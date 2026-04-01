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

public class EdgeCut_toString_19572100679 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6627;

    public EdgeCut_toString_19572100679() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term6632 = new Double(0.9126850255993704);
        term6627 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        int[] term6628 = (int[]) newIntArray(2);
        int[] term6631 = (int[]) newIntArray(0);
        Object term6634 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setField(term6627, term6627.getClass(), "graph", null);
        setIntElement(term6628, 0, -444451515);
        setIntElement(term6628, 1, -545419660);
        setField(term6627, term6627.getClass(), "leftSide", term6628);
        setField(term6627, term6627.getClass(), "rightSide", term6631);
        setField(term6627, term6627.getClass(), "weight", term6632);
        setField(term6634, term6634.getClass(), "graph", null);
        setField(term6634, term6634.getClass(), "map", null);
        setField(term6627, term6627.getClass(), "edges", term6634);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.EdgeCut");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term6627, args);
    }

};


