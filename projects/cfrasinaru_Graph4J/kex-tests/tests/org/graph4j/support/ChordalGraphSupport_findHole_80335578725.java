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

public class ChordalGraphSupport_findHole_80335578725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3842;

    public ChordalGraphSupport_findHole_80335578725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3842 = newInstance(Class.forName("org.graph4j.support.ChordalGraphSupport"));
        setField(term3842, term3842.getClass(), "chordal", null);
        setField(term3842, term3842.getClass(), "ordering", null);
        setField(term3842, term3842.getClass(), "positions", null);
        setIntField(term3842, term3842.getClass(), "holeOrderingPos", 0);
        setIntField(term3842, term3842.getClass(), "holeVertex0", 0);
        setIntField(term3842, term3842.getClass(), "holeVertex1", 0);
        setIntField(term3842, term3842.getClass(), "holeVertex2", 0);
        setField(term3842, term3842.getClass(), "hole", null);
        setIntField(term3842, term3842.getClass(), "maxCliquePos", 0);
        setIntField(term3842, term3842.getClass(), "maxCliqueSize", 0);
        setField(term3842, term3842.getClass(), "maximumClique", null);
        setField(term3842, term3842.getClass(), "maximalCliques", null);
        setField(term3842, term3842.getClass(), "coloring", null);
        setField(term3842, term3842.getClass(), "maximumStableSet", null);
        setField(term3842, term3842.getClass(), "minimumCliqueCover", null);
        setField(term3842, term3842.getClass(), "minimalVertexSeparators", null);
        setField(term3842, term3842.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.support.ChordalGraphSupport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findHole", argTypes, term3842, args);
    }

};


