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

public class StoerWagnerMinimumCut_minCutPhase_179254873512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term400;

    public StoerWagnerMinimumCut_minCutPhase_179254873512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term400 = newInstance(Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut"));
        setBooleanField(term400, term400.getClass(), "ignoreWeights", false);
        setField(term400, term400.getClass(), "workGraph", null);
        setField(term400, term400.getClass(), "maxHeap", null);
        setField(term400, term400.getClass(), "processed", null);
        setField(term400, term400.getClass(), "weight", null);
        setField(term400, term400.getClass(), "vertexMap", null);
        setField(term400, term400.getClass(), "minWeight", null);
        setField(term400, term400.getClass(), "minCutVertex", null);
        setField(term400, term400.getClass(), "minCut", null);
        setField(term400, term400.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "minCutPhase", argTypes, term400, args);
    }

};


