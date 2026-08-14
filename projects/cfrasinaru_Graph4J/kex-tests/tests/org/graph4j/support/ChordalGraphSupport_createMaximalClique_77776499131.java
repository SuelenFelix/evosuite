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

public class ChordalGraphSupport_createMaximalClique_77776499131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3886;
     Object term3893;

    public ChordalGraphSupport_createMaximalClique_77776499131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3886 = newInstance(Class.forName("org.graph4j.support.ChordalGraphSupport"));
        setField(term3886, term3886.getClass(), "chordal", null);
        setField(term3886, term3886.getClass(), "ordering", null);
        setField(term3886, term3886.getClass(), "positions", null);
        setIntField(term3886, term3886.getClass(), "holeOrderingPos", 0);
        setIntField(term3886, term3886.getClass(), "holeVertex0", 0);
        setIntField(term3886, term3886.getClass(), "holeVertex1", 0);
        setIntField(term3886, term3886.getClass(), "holeVertex2", 0);
        setField(term3886, term3886.getClass(), "hole", null);
        setIntField(term3886, term3886.getClass(), "maxCliquePos", 0);
        setIntField(term3886, term3886.getClass(), "maxCliqueSize", 0);
        setField(term3886, term3886.getClass(), "maximumClique", null);
        setField(term3886, term3886.getClass(), "maximalCliques", null);
        setField(term3886, term3886.getClass(), "coloring", null);
        setField(term3886, term3886.getClass(), "maximumStableSet", null);
        setField(term3886, term3886.getClass(), "minimumCliqueCover", null);
        setField(term3886, term3886.getClass(), "minimalVertexSeparators", null);
        setField(term3886, term3886.getClass(), "graph", null);
        term3893 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.support.ChordalGraphSupport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3893;
        callMethod(klass, "createMaximalClique", argTypes, term3886, args);
    }

};


