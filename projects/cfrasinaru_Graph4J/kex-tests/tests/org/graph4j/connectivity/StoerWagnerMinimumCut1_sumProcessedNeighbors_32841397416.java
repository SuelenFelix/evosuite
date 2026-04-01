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
import java.lang.Integer;

public class StoerWagnerMinimumCut1_sumProcessedNeighbors_32841397416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5876;
     Object term5878;

    public StoerWagnerMinimumCut1_sumProcessedNeighbors_32841397416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5876 = newInstance(Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut1"));
        setBooleanField(term5876, term5876.getClass(), "ignoreWeights", false);
        setField(term5876, term5876.getClass(), "workGraph", null);
        setField(term5876, term5876.getClass(), "maxHeap", null);
        setField(term5876, term5876.getClass(), "processed", null);
        setField(term5876, term5876.getClass(), "weight", null);
        setField(term5876, term5876.getClass(), "ordering", null);
        setField(term5876, term5876.getClass(), "orderingIndex", null);
        setField(term5876, term5876.getClass(), "vertexMap", null);
        setField(term5876, term5876.getClass(), "minWeight", null);
        setField(term5876, term5876.getClass(), "minCutVertex", null);
        setField(term5876, term5876.getClass(), "minCut", null);
        setField(term5876, term5876.getClass(), "newVertex", null);
        setField(term5876, term5876.getClass(), "graph", null);
        term5878 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5878;
        callMethod(klass, "sumProcessedNeighbors", argTypes, term5876, args);
    }

};


