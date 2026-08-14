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

public class EdgeCut_size_17440270376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6549;

    public EdgeCut_size_17440270376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term6567 = new Double(0.3227335400819148);
        term6549 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        int[] term6550 = (int[]) newIntArray(6);
        int[] term6557 = (int[]) newIntArray(9);
        Object term6569 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setField(term6549, term6549.getClass(), "graph", null);
        setIntElement(term6550, 0, 1199950979);
        setIntElement(term6550, 1, 733812186);
        setIntElement(term6550, 2, -840076719);
        setIntElement(term6550, 3, 2002762153);
        setIntElement(term6550, 4, -531666058);
        setIntElement(term6550, 5, -1659995523);
        setField(term6549, term6549.getClass(), "leftSide", term6550);
        setIntElement(term6557, 0, -1384058110);
        setIntElement(term6557, 1, -109584269);
        setIntElement(term6557, 2, -682334474);
        setIntElement(term6557, 3, -666332937);
        setIntElement(term6557, 4, 1661615099);
        setIntElement(term6557, 5, 1908136627);
        setIntElement(term6557, 6, 824600792);
        setIntElement(term6557, 7, -1498923569);
        setIntElement(term6557, 8, 1082643319);
        setField(term6549, term6549.getClass(), "rightSide", term6557);
        setField(term6549, term6549.getClass(), "weight", term6567);
        setField(term6569, term6569.getClass(), "graph", null);
        setField(term6569, term6569.getClass(), "map", null);
        setField(term6549, term6549.getClass(), "edges", term6569);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.EdgeCut");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "size", argTypes, term6549, args);
    }

};


