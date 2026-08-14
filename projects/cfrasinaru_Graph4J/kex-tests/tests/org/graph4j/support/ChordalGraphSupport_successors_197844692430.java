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
import java.lang.Integer;

public class ChordalGraphSupport_successors_197844692430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3877;
     Object term3884;

    public ChordalGraphSupport_successors_197844692430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3877 = newInstance(Class.forName("org.graph4j.support.ChordalGraphSupport"));
        setField(term3877, term3877.getClass(), "chordal", null);
        setField(term3877, term3877.getClass(), "ordering", null);
        setField(term3877, term3877.getClass(), "positions", null);
        setIntField(term3877, term3877.getClass(), "holeOrderingPos", 0);
        setIntField(term3877, term3877.getClass(), "holeVertex0", 0);
        setIntField(term3877, term3877.getClass(), "holeVertex1", 0);
        setIntField(term3877, term3877.getClass(), "holeVertex2", 0);
        setField(term3877, term3877.getClass(), "hole", null);
        setIntField(term3877, term3877.getClass(), "maxCliquePos", 0);
        setIntField(term3877, term3877.getClass(), "maxCliqueSize", 0);
        setField(term3877, term3877.getClass(), "maximumClique", null);
        setField(term3877, term3877.getClass(), "maximalCliques", null);
        setField(term3877, term3877.getClass(), "coloring", null);
        setField(term3877, term3877.getClass(), "maximumStableSet", null);
        setField(term3877, term3877.getClass(), "minimumCliqueCover", null);
        setField(term3877, term3877.getClass(), "minimalVertexSeparators", null);
        setField(term3877, term3877.getClass(), "graph", null);
        term3884 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.support.ChordalGraphSupport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3884;
        callMethod(klass, "successors", argTypes, term3877, args);
    }

};


