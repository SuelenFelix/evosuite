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
import java.lang.Object;
import java.lang.Double;
import java.lang.Integer;

public class EdgeConnectivityAlgorithm_getMinimumCut_5776659653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term778;
     Object term790;
     Object term792;

    public EdgeConnectivityAlgorithm_getMinimumCut_5776659653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term784 = new Double(0.7655020693602768);
        Integer term787 = new Integer(-655067527);
        term778 = newInstance(Class.forName("org.graph4j.connectivity.EdgeConnectivityAlgorithm"));
        Object term779 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        int[] term780 = (int[]) newIntArray(0);
        int[] term781 = (int[]) newIntArray(2);
        Object term786 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setField(term778, term778.getClass(), "network", null);
        setField(term779, term779.getClass(), "graph", null);
        setField(term779, term779.getClass(), "leftSide", term780);
        setIntElement(term781, 0, 282916351);
        setIntElement(term781, 1, 880977281);
        setField(term779, term779.getClass(), "rightSide", term781);
        setField(term779, term779.getClass(), "weight", term784);
        setField(term786, term786.getClass(), "graph", null);
        setField(term786, term786.getClass(), "map", null);
        setField(term779, term779.getClass(), "edges", term786);
        setField(term778, term778.getClass(), "globalMinCut", term779);
        setField(term778, term778.getClass(), "connectivityNumber", term787);
        setField(term778, term778.getClass(), "graph", null);
        setBooleanField(term778, term778.getClass(), "directed", true);
        term790 = new Integer(371943306);
        term792 = new Integer(982388293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.EdgeConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term790;
        args[1] = term792;
        callMethod(klass, "getMinimumCut", argTypes, term778, args);
    }

};


