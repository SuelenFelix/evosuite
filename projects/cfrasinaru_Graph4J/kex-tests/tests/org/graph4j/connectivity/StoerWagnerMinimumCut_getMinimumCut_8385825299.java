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

public class StoerWagnerMinimumCut_getMinimumCut_8385825299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term394;

    public StoerWagnerMinimumCut_getMinimumCut_8385825299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term394 = newInstance(Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut"));
        setBooleanField(term394, term394.getClass(), "ignoreWeights", false);
        setField(term394, term394.getClass(), "workGraph", null);
        setField(term394, term394.getClass(), "maxHeap", null);
        setField(term394, term394.getClass(), "processed", null);
        setField(term394, term394.getClass(), "weight", null);
        setField(term394, term394.getClass(), "vertexMap", null);
        setField(term394, term394.getClass(), "minWeight", null);
        setField(term394, term394.getClass(), "minCutVertex", null);
        setField(term394, term394.getClass(), "minCut", null);
        setField(term394, term394.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinimumCut", argTypes, term394, args);
    }

};


