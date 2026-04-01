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

public class ChordalGraphSupport_getMaximumCliqueSize_202800957527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51794;

    public ChordalGraphSupport_getMaximumCliqueSize_202800957527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51794 = newInstance(Class.forName("org.graph4j.support.ChordalGraphSupport"));
        setField(term51794, term51794.getClass(), "chordal", null);
        setField(term51794, term51794.getClass(), "ordering", null);
        setField(term51794, term51794.getClass(), "positions", null);
        setIntField(term51794, term51794.getClass(), "holeOrderingPos", 0);
        setIntField(term51794, term51794.getClass(), "holeVertex0", 0);
        setIntField(term51794, term51794.getClass(), "holeVertex1", 0);
        setIntField(term51794, term51794.getClass(), "holeVertex2", 0);
        setField(term51794, term51794.getClass(), "hole", null);
        setIntField(term51794, term51794.getClass(), "maxCliquePos", 0);
        setIntField(term51794, term51794.getClass(), "maxCliqueSize", 0);
        setField(term51794, term51794.getClass(), "maximumClique", null);
        setField(term51794, term51794.getClass(), "maximalCliques", null);
        setField(term51794, term51794.getClass(), "coloring", null);
        setField(term51794, term51794.getClass(), "maximumStableSet", null);
        setField(term51794, term51794.getClass(), "minimumCliqueCover", null);
        setField(term51794, term51794.getClass(), "minimalVertexSeparators", null);
        setField(term51794, term51794.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.support.ChordalGraphSupport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaximumCliqueSize", argTypes, term51794, args);
    }

};


