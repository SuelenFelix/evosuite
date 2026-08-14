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
     Object term2300;

    public KruskalMinimumSpanningTree_compute_3758628261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term2302 = new Double(0.0994826944883106);
        term2300 = newInstance(Class.forName("org.graph4j.spanning.KruskalMinimumSpanningTree"));
        Object term2301 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setField(term2300, term2300.getClass(), "tree", null);
        setField(term2301, term2301.getClass(), "graph", null);
        setField(term2301, term2301.getClass(), "map", null);
        setField(term2300, term2300.getClass(), "treeEdges", term2301);
        setField(term2300, term2300.getClass(), "minWeight", term2302);
        setField(term2300, term2300.getClass(), "graph", null);
        setBooleanField(term2300, term2300.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.KruskalMinimumSpanningTree");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "compute", argTypes, term2300, args);
    }

};


