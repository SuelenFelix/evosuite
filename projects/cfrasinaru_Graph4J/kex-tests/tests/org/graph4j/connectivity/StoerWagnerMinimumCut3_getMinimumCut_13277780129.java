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

public class StoerWagnerMinimumCut3_getMinimumCut_13277780129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4180;

    public StoerWagnerMinimumCut3_getMinimumCut_13277780129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4180 = newInstance(Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut3"));
        setBooleanField(term4180, term4180.getClass(), "ignoreWeights", false);
        setField(term4180, term4180.getClass(), "workGraph", null);
        setField(term4180, term4180.getClass(), "maxHeap", null);
        setField(term4180, term4180.getClass(), "processed", null);
        setField(term4180, term4180.getClass(), "weight", null);
        setIntField(term4180, term4180.getClass(), "startId", 0);
        setField(term4180, term4180.getClass(), "map", null);
        setField(term4180, term4180.getClass(), "minWeight", null);
        setField(term4180, term4180.getClass(), "minCutVertex", null);
        setField(term4180, term4180.getClass(), "minCut", null);
        setField(term4180, term4180.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinimumCut", argTypes, term4180, args);
    }

};


