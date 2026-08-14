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

public class ChordalGraphSupport_getMaximumStableSet_19404019832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3895;

    public ChordalGraphSupport_getMaximumStableSet_19404019832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3895 = newInstance(Class.forName("org.graph4j.support.ChordalGraphSupport"));
        setField(term3895, term3895.getClass(), "chordal", null);
        setField(term3895, term3895.getClass(), "ordering", null);
        setField(term3895, term3895.getClass(), "positions", null);
        setIntField(term3895, term3895.getClass(), "holeOrderingPos", 0);
        setIntField(term3895, term3895.getClass(), "holeVertex0", 0);
        setIntField(term3895, term3895.getClass(), "holeVertex1", 0);
        setIntField(term3895, term3895.getClass(), "holeVertex2", 0);
        setField(term3895, term3895.getClass(), "hole", null);
        setIntField(term3895, term3895.getClass(), "maxCliquePos", 0);
        setIntField(term3895, term3895.getClass(), "maxCliqueSize", 0);
        setField(term3895, term3895.getClass(), "maximumClique", null);
        setField(term3895, term3895.getClass(), "maximalCliques", null);
        setField(term3895, term3895.getClass(), "coloring", null);
        setField(term3895, term3895.getClass(), "maximumStableSet", null);
        setField(term3895, term3895.getClass(), "minimumCliqueCover", null);
        setField(term3895, term3895.getClass(), "minimalVertexSeparators", null);
        setField(term3895, term3895.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.support.ChordalGraphSupport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaximumStableSet", argTypes, term3895, args);
    }

};


