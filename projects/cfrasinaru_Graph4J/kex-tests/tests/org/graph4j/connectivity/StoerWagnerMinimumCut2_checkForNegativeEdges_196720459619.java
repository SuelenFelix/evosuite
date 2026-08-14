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

public class StoerWagnerMinimumCut2_checkForNegativeEdges_196720459619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5095;

    public StoerWagnerMinimumCut2_checkForNegativeEdges_196720459619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5095 = newInstance(Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut2"));
        setBooleanField(term5095, term5095.getClass(), "ignoreWeights", false);
        setField(term5095, term5095.getClass(), "workGraph", null);
        setField(term5095, term5095.getClass(), "maxHeap", null);
        setField(term5095, term5095.getClass(), "processed", null);
        setField(term5095, term5095.getClass(), "weight", null);
        setField(term5095, term5095.getClass(), "ordering", null);
        setField(term5095, term5095.getClass(), "orderingIndex", null);
        setField(term5095, term5095.getClass(), "vertexMap", null);
        setField(term5095, term5095.getClass(), "minWeight", null);
        setField(term5095, term5095.getClass(), "minCutVertex", null);
        setField(term5095, term5095.getClass(), "minCut", null);
        setField(term5095, term5095.getClass(), "newVertex", null);
        setField(term5095, term5095.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut2");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkForNegativeEdges", argTypes, term5095, args);
    }

};


