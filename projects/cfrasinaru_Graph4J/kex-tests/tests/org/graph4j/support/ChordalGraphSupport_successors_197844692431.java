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

public class ChordalGraphSupport_successors_197844692431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51822;
     Object term51829;

    public ChordalGraphSupport_successors_197844692431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51822 = newInstance(Class.forName("org.graph4j.support.ChordalGraphSupport"));
        setField(term51822, term51822.getClass(), "chordal", null);
        setField(term51822, term51822.getClass(), "ordering", null);
        setField(term51822, term51822.getClass(), "positions", null);
        setIntField(term51822, term51822.getClass(), "holeOrderingPos", 0);
        setIntField(term51822, term51822.getClass(), "holeVertex0", 0);
        setIntField(term51822, term51822.getClass(), "holeVertex1", 0);
        setIntField(term51822, term51822.getClass(), "holeVertex2", 0);
        setField(term51822, term51822.getClass(), "hole", null);
        setIntField(term51822, term51822.getClass(), "maxCliquePos", 0);
        setIntField(term51822, term51822.getClass(), "maxCliqueSize", 0);
        setField(term51822, term51822.getClass(), "maximumClique", null);
        setField(term51822, term51822.getClass(), "maximalCliques", null);
        setField(term51822, term51822.getClass(), "coloring", null);
        setField(term51822, term51822.getClass(), "maximumStableSet", null);
        setField(term51822, term51822.getClass(), "minimumCliqueCover", null);
        setField(term51822, term51822.getClass(), "minimalVertexSeparators", null);
        setField(term51822, term51822.getClass(), "graph", null);
        term51829 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.support.ChordalGraphSupport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term51829;
        callMethod(klass, "successors", argTypes, term51822, args);
    }

};


