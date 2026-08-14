package org.graph4j.support;

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
import static org.graph4j.support.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ChordalGraphSupport_getOptimalColoring_142740788736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3923;

    public ChordalGraphSupport_getOptimalColoring_142740788736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3923 = newInstance(Class.forName("org.graph4j.support.ChordalGraphSupport"));
        setField(term3923, term3923.getClass(), "chordal", null);
        setField(term3923, term3923.getClass(), "ordering", null);
        setField(term3923, term3923.getClass(), "positions", null);
        setIntField(term3923, term3923.getClass(), "holeOrderingPos", 0);
        setIntField(term3923, term3923.getClass(), "holeVertex0", 0);
        setIntField(term3923, term3923.getClass(), "holeVertex1", 0);
        setIntField(term3923, term3923.getClass(), "holeVertex2", 0);
        setField(term3923, term3923.getClass(), "hole", null);
        setIntField(term3923, term3923.getClass(), "maxCliquePos", 0);
        setIntField(term3923, term3923.getClass(), "maxCliqueSize", 0);
        setField(term3923, term3923.getClass(), "maximumClique", null);
        setField(term3923, term3923.getClass(), "maximalCliques", null);
        setField(term3923, term3923.getClass(), "coloring", null);
        setField(term3923, term3923.getClass(), "maximumStableSet", null);
        setField(term3923, term3923.getClass(), "minimumCliqueCover", null);
        setField(term3923, term3923.getClass(), "minimalVertexSeparators", null);
        setField(term3923, term3923.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.support.ChordalGraphSupport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOptimalColoring", argTypes, term3923, args);
    }

};


