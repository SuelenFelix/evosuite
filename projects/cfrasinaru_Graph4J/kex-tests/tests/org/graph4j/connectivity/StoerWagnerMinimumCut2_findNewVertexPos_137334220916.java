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

public class StoerWagnerMinimumCut2_findNewVertexPos_137334220916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5085;

    public StoerWagnerMinimumCut2_findNewVertexPos_137334220916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5085 = newInstance(Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut2"));
        setBooleanField(term5085, term5085.getClass(), "ignoreWeights", false);
        setField(term5085, term5085.getClass(), "workGraph", null);
        setField(term5085, term5085.getClass(), "maxHeap", null);
        setField(term5085, term5085.getClass(), "processed", null);
        setField(term5085, term5085.getClass(), "weight", null);
        setField(term5085, term5085.getClass(), "ordering", null);
        setField(term5085, term5085.getClass(), "orderingIndex", null);
        setField(term5085, term5085.getClass(), "vertexMap", null);
        setField(term5085, term5085.getClass(), "minWeight", null);
        setField(term5085, term5085.getClass(), "minCutVertex", null);
        setField(term5085, term5085.getClass(), "minCut", null);
        setField(term5085, term5085.getClass(), "newVertex", null);
        setField(term5085, term5085.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut2");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findNewVertexPos", argTypes, term5085, args);
    }

};


