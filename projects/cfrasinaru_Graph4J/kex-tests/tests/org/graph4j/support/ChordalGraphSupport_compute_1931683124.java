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

public class ChordalGraphSupport_compute_1931683124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48378;

    public ChordalGraphSupport_compute_1931683124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48378 = newInstance(Class.forName("org.graph4j.support.ChordalGraphSupport"));
        setField(term48378, term48378.getClass(), "chordal", null);
        setField(term48378, term48378.getClass(), "ordering", null);
        setField(term48378, term48378.getClass(), "positions", null);
        setIntField(term48378, term48378.getClass(), "holeOrderingPos", 0);
        setIntField(term48378, term48378.getClass(), "holeVertex0", 0);
        setIntField(term48378, term48378.getClass(), "holeVertex1", 0);
        setIntField(term48378, term48378.getClass(), "holeVertex2", 0);
        setField(term48378, term48378.getClass(), "hole", null);
        setIntField(term48378, term48378.getClass(), "maxCliquePos", 0);
        setIntField(term48378, term48378.getClass(), "maxCliqueSize", 0);
        setField(term48378, term48378.getClass(), "maximumClique", null);
        setField(term48378, term48378.getClass(), "maximalCliques", null);
        setField(term48378, term48378.getClass(), "coloring", null);
        setField(term48378, term48378.getClass(), "maximumStableSet", null);
        setField(term48378, term48378.getClass(), "minimumCliqueCover", null);
        setField(term48378, term48378.getClass(), "minimalVertexSeparators", null);
        setField(term48378, term48378.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.support.ChordalGraphSupport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "compute", argTypes, term48378, args);
    }

};


