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

public class DinicMaximumFlow_createLevels_5547407249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2914;

    public DinicMaximumFlow_createLevels_5547407249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2914 = newInstance(Class.forName("org.graph4j.flow.DinicMaximumFlow"));
        setField(term2914, term2914.getClass(), "levels", null);
        setField(term2914, term2914.getClass(), "succPos", null);
        setField(term2914, term2914.getClass(), "predPos", null);
        setField(term2914, term2914.getClass(), "stack", null);
        setField(term2914, term2914.getClass(), "visited", null);
        setField(term2914, term2914.getClass(), "residual", null);
        setField(term2914, term2914.getClass(), "parent", null);
        setField(term2914, term2914.getClass(), "forward", null);
        setField(term2914, term2914.getClass(), "graph", null);
        setField(term2914, term2914.getClass(), "initialFlow", null);
        setIntField(term2914, term2914.getClass(), "numVertices", 0);
        setIntField(term2914, term2914.getClass(), "source", 0);
        setIntField(term2914, term2914.getClass(), "sink", 0);
        setIntField(term2914, term2914.getClass(), "sourceIndex", 0);
        setIntField(term2914, term2914.getClass(), "sinkIndex", 0);
        setBooleanField(term2914, term2914.getClass(), "computed", false);
        setField(term2914, term2914.getClass(), "sourcePart", null);
        setField(term2914, term2914.getClass(), "sinkPart", null);
        setField(term2914, term2914.getClass(), "cutEdges", null);
        setField(term2914, term2914.getClass(), "ekAlg", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.flow.DinicMaximumFlow");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createLevels", argTypes, term2914, args);
    }

};


