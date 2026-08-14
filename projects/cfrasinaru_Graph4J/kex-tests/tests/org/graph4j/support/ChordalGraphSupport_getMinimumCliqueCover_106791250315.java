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

public class ChordalGraphSupport_getMinimumCliqueCover_106791250315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2704;

    public ChordalGraphSupport_getMinimumCliqueCover_106791250315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2704 = newInstance(Class.forName("org.graph4j.support.ChordalGraphSupport"));
        setField(term2704, term2704.getClass(), "chordal", null);
        setField(term2704, term2704.getClass(), "ordering", null);
        setField(term2704, term2704.getClass(), "positions", null);
        setIntField(term2704, term2704.getClass(), "holeOrderingPos", 0);
        setIntField(term2704, term2704.getClass(), "holeVertex0", 0);
        setIntField(term2704, term2704.getClass(), "holeVertex1", 0);
        setIntField(term2704, term2704.getClass(), "holeVertex2", 0);
        setField(term2704, term2704.getClass(), "hole", null);
        setIntField(term2704, term2704.getClass(), "maxCliquePos", 0);
        setIntField(term2704, term2704.getClass(), "maxCliqueSize", 0);
        setField(term2704, term2704.getClass(), "maximumClique", null);
        setField(term2704, term2704.getClass(), "maximalCliques", null);
        setField(term2704, term2704.getClass(), "coloring", null);
        setField(term2704, term2704.getClass(), "maximumStableSet", null);
        setField(term2704, term2704.getClass(), "minimumCliqueCover", null);
        setField(term2704, term2704.getClass(), "minimalVertexSeparators", null);
        setField(term2704, term2704.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.support.ChordalGraphSupport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinimumCliqueCover", argTypes, term2704, args);
    }

};


