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

public class ChordalGraphSupport_createMinimumCliqueCover_82504192534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51845;

    public ChordalGraphSupport_createMinimumCliqueCover_82504192534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51845 = newInstance(Class.forName("org.graph4j.support.ChordalGraphSupport"));
        setField(term51845, term51845.getClass(), "chordal", null);
        setField(term51845, term51845.getClass(), "ordering", null);
        setField(term51845, term51845.getClass(), "positions", null);
        setIntField(term51845, term51845.getClass(), "holeOrderingPos", 0);
        setIntField(term51845, term51845.getClass(), "holeVertex0", 0);
        setIntField(term51845, term51845.getClass(), "holeVertex1", 0);
        setIntField(term51845, term51845.getClass(), "holeVertex2", 0);
        setField(term51845, term51845.getClass(), "hole", null);
        setIntField(term51845, term51845.getClass(), "maxCliquePos", 0);
        setIntField(term51845, term51845.getClass(), "maxCliqueSize", 0);
        setField(term51845, term51845.getClass(), "maximumClique", null);
        setField(term51845, term51845.getClass(), "maximalCliques", null);
        setField(term51845, term51845.getClass(), "coloring", null);
        setField(term51845, term51845.getClass(), "maximumStableSet", null);
        setField(term51845, term51845.getClass(), "minimumCliqueCover", null);
        setField(term51845, term51845.getClass(), "minimalVertexSeparators", null);
        setField(term51845, term51845.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.support.ChordalGraphSupport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createMinimumCliqueCover", argTypes, term51845, args);
    }

};


