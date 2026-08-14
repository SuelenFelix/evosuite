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

public class ChordalGraphSupport_createMaximalClique_77776499112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49939;
     Object term49946;

    public ChordalGraphSupport_createMaximalClique_77776499112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49939 = newInstance(Class.forName("org.graph4j.support.ChordalGraphSupport"));
        setField(term49939, term49939.getClass(), "chordal", null);
        setField(term49939, term49939.getClass(), "ordering", null);
        setField(term49939, term49939.getClass(), "positions", null);
        setIntField(term49939, term49939.getClass(), "holeOrderingPos", 0);
        setIntField(term49939, term49939.getClass(), "holeVertex0", 0);
        setIntField(term49939, term49939.getClass(), "holeVertex1", 0);
        setIntField(term49939, term49939.getClass(), "holeVertex2", 0);
        setField(term49939, term49939.getClass(), "hole", null);
        setIntField(term49939, term49939.getClass(), "maxCliquePos", 0);
        setIntField(term49939, term49939.getClass(), "maxCliqueSize", 0);
        setField(term49939, term49939.getClass(), "maximumClique", null);
        setField(term49939, term49939.getClass(), "maximalCliques", null);
        setField(term49939, term49939.getClass(), "coloring", null);
        setField(term49939, term49939.getClass(), "maximumStableSet", null);
        setField(term49939, term49939.getClass(), "minimumCliqueCover", null);
        setField(term49939, term49939.getClass(), "minimalVertexSeparators", null);
        setField(term49939, term49939.getClass(), "graph", null);
        term49946 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.support.ChordalGraphSupport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term49946;
        callMethod(klass, "createMaximalClique", argTypes, term49939, args);
    }

};


