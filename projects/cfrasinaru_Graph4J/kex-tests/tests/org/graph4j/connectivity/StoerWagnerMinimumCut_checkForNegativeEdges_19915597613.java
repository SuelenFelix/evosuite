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

public class StoerWagnerMinimumCut_checkForNegativeEdges_19915597613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term402;

    public StoerWagnerMinimumCut_checkForNegativeEdges_19915597613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term402 = newInstance(Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut"));
        setBooleanField(term402, term402.getClass(), "ignoreWeights", false);
        setField(term402, term402.getClass(), "workGraph", null);
        setField(term402, term402.getClass(), "maxHeap", null);
        setField(term402, term402.getClass(), "processed", null);
        setField(term402, term402.getClass(), "weight", null);
        setField(term402, term402.getClass(), "vertexMap", null);
        setField(term402, term402.getClass(), "minWeight", null);
        setField(term402, term402.getClass(), "minCutVertex", null);
        setField(term402, term402.getClass(), "minCut", null);
        setField(term402, term402.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkForNegativeEdges", argTypes, term402, args);
    }

};


