package org.graph4j.spanning;

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
import static org.graph4j.spanning.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class KruskalMinimumSpanningTree_compute_3758628261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155861;

    public KruskalMinimumSpanningTree_compute_3758628261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term155863 = new Double(0.8100133883198262);
        term155861 = newInstance(Class.forName("org.graph4j.spanning.KruskalMinimumSpanningTree"));
        Object term155862 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setField(term155861, term155861.getClass(), "tree", null);
        setField(term155862, term155862.getClass(), "graph", null);
        setField(term155862, term155862.getClass(), "map", null);
        setField(term155861, term155861.getClass(), "treeEdges", term155862);
        setField(term155861, term155861.getClass(), "minWeight", term155863);
        setField(term155861, term155861.getClass(), "graph", null);
        setBooleanField(term155861, term155861.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.KruskalMinimumSpanningTree");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "compute", argTypes, term155861, args);
    }

};


