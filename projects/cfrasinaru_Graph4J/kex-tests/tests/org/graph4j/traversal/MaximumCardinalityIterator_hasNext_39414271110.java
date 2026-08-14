package org.graph4j.traversal;

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
import static org.graph4j.traversal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MaximumCardinalityIterator_hasNext_39414271110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2616;

    public MaximumCardinalityIterator_hasNext_39414271110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2616 = newInstance(Class.forName("org.graph4j.traversal.MaximumCardinalityIterator"));
        setField(term2616, term2616.getClass(), "graph", null);
        setIntField(term2616, term2616.getClass(), "startVertex", 0);
        setField(term2616, term2616.getClass(), "visited", null);
        setField(term2616, term2616.getClass(), "heap", null);
        setField(term2616, term2616.getClass(), "count", null);
        setIntField(term2616, term2616.getClass(), "numIterations", 0);
        setIntField(term2616, term2616.getClass(), "currentVertex", 0);
        setIntField(term2616, term2616.getClass(), "currentVertexId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.MaximumCardinalityIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term2616, args);
    }

};


