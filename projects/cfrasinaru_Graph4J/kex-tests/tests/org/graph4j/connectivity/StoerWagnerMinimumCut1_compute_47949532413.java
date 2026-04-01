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

public class StoerWagnerMinimumCut1_compute_47949532413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5868;

    public StoerWagnerMinimumCut1_compute_47949532413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5868 = newInstance(Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut1"));
        setBooleanField(term5868, term5868.getClass(), "ignoreWeights", false);
        setField(term5868, term5868.getClass(), "workGraph", null);
        setField(term5868, term5868.getClass(), "maxHeap", null);
        setField(term5868, term5868.getClass(), "processed", null);
        setField(term5868, term5868.getClass(), "weight", null);
        setField(term5868, term5868.getClass(), "ordering", null);
        setField(term5868, term5868.getClass(), "orderingIndex", null);
        setField(term5868, term5868.getClass(), "vertexMap", null);
        setField(term5868, term5868.getClass(), "minWeight", null);
        setField(term5868, term5868.getClass(), "minCutVertex", null);
        setField(term5868, term5868.getClass(), "minCut", null);
        setField(term5868, term5868.getClass(), "newVertex", null);
        setField(term5868, term5868.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "compute", argTypes, term5868, args);
    }

};


