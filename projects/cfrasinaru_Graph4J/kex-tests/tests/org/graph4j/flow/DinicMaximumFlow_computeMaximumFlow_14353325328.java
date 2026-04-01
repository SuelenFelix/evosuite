package org.graph4j.flow;

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
import static org.graph4j.flow.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DinicMaximumFlow_computeMaximumFlow_14353325328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2907;

    public DinicMaximumFlow_computeMaximumFlow_14353325328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2907 = newInstance(Class.forName("org.graph4j.flow.DinicMaximumFlow"));
        setField(term2907, term2907.getClass(), "levels", null);
        setField(term2907, term2907.getClass(), "succPos", null);
        setField(term2907, term2907.getClass(), "predPos", null);
        setField(term2907, term2907.getClass(), "stack", null);
        setField(term2907, term2907.getClass(), "visited", null);
        setField(term2907, term2907.getClass(), "residual", null);
        setField(term2907, term2907.getClass(), "parent", null);
        setField(term2907, term2907.getClass(), "forward", null);
        setField(term2907, term2907.getClass(), "graph", null);
        setField(term2907, term2907.getClass(), "initialFlow", null);
        setIntField(term2907, term2907.getClass(), "numVertices", 0);
        setIntField(term2907, term2907.getClass(), "source", 0);
        setIntField(term2907, term2907.getClass(), "sink", 0);
        setIntField(term2907, term2907.getClass(), "sourceIndex", 0);
        setIntField(term2907, term2907.getClass(), "sinkIndex", 0);
        setBooleanField(term2907, term2907.getClass(), "computed", false);
        setField(term2907, term2907.getClass(), "sourcePart", null);
        setField(term2907, term2907.getClass(), "sinkPart", null);
        setField(term2907, term2907.getClass(), "cutEdges", null);
        setField(term2907, term2907.getClass(), "ekAlg", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.flow.DinicMaximumFlow");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "computeMaximumFlow", argTypes, term2907, args);
    }

};


