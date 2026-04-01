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

public class KruskalMinimumSpanningTree_compute_3758628263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155866;

    public KruskalMinimumSpanningTree_compute_3758628263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155866 = newInstance(Class.forName("org.graph4j.spanning.KruskalMinimumSpanningTree"));
        setField(term155866, term155866.getClass(), "tree", null);
        setField(term155866, term155866.getClass(), "treeEdges", null);
        setField(term155866, term155866.getClass(), "minWeight", null);
        setField(term155866, term155866.getClass(), "graph", null);
        setBooleanField(term155866, term155866.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.KruskalMinimumSpanningTree");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "compute", argTypes, term155866, args);
    }

};


