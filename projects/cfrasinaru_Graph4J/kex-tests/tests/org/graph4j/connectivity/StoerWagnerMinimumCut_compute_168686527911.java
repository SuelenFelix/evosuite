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

public class StoerWagnerMinimumCut_compute_168686527911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term398;

    public StoerWagnerMinimumCut_compute_168686527911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term398 = newInstance(Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut"));
        setBooleanField(term398, term398.getClass(), "ignoreWeights", false);
        setField(term398, term398.getClass(), "workGraph", null);
        setField(term398, term398.getClass(), "maxHeap", null);
        setField(term398, term398.getClass(), "processed", null);
        setField(term398, term398.getClass(), "weight", null);
        setField(term398, term398.getClass(), "vertexMap", null);
        setField(term398, term398.getClass(), "minWeight", null);
        setField(term398, term398.getClass(), "minCutVertex", null);
        setField(term398, term398.getClass(), "minCut", null);
        setField(term398, term398.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "compute", argTypes, term398, args);
    }

};


