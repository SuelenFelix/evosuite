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

public class StoerWagnerMinimumCut2_findFirstNeighborPos_163866485917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5087;
     Object term5089;

    public StoerWagnerMinimumCut2_findFirstNeighborPos_163866485917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5087 = newInstance(Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut2"));
        setBooleanField(term5087, term5087.getClass(), "ignoreWeights", false);
        setField(term5087, term5087.getClass(), "workGraph", null);
        setField(term5087, term5087.getClass(), "maxHeap", null);
        setField(term5087, term5087.getClass(), "processed", null);
        setField(term5087, term5087.getClass(), "weight", null);
        setField(term5087, term5087.getClass(), "ordering", null);
        setField(term5087, term5087.getClass(), "orderingIndex", null);
        setField(term5087, term5087.getClass(), "vertexMap", null);
        setField(term5087, term5087.getClass(), "minWeight", null);
        setField(term5087, term5087.getClass(), "minCutVertex", null);
        setField(term5087, term5087.getClass(), "minCut", null);
        setField(term5087, term5087.getClass(), "newVertex", null);
        setField(term5087, term5087.getClass(), "graph", null);
        term5089 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5089;
        callMethod(klass, "findFirstNeighborPos", argTypes, term5087, args);
    }

};


