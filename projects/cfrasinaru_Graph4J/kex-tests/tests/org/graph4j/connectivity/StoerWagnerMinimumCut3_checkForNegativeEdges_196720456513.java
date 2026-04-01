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

public class StoerWagnerMinimumCut3_checkForNegativeEdges_196720456513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4192;

    public StoerWagnerMinimumCut3_checkForNegativeEdges_196720456513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4192 = newInstance(Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut3"));
        setBooleanField(term4192, term4192.getClass(), "ignoreWeights", false);
        setField(term4192, term4192.getClass(), "workGraph", null);
        setField(term4192, term4192.getClass(), "maxHeap", null);
        setField(term4192, term4192.getClass(), "processed", null);
        setField(term4192, term4192.getClass(), "weight", null);
        setIntField(term4192, term4192.getClass(), "startId", 0);
        setField(term4192, term4192.getClass(), "map", null);
        setField(term4192, term4192.getClass(), "minWeight", null);
        setField(term4192, term4192.getClass(), "minCutVertex", null);
        setField(term4192, term4192.getClass(), "minCut", null);
        setField(term4192, term4192.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkForNegativeEdges", argTypes, term4192, args);
    }

};


