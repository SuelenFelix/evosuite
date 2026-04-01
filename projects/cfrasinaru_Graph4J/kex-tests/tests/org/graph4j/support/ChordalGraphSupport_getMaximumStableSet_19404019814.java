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

public class ChordalGraphSupport_getMaximumStableSet_19404019814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50169;

    public ChordalGraphSupport_getMaximumStableSet_19404019814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50169 = newInstance(Class.forName("org.graph4j.support.ChordalGraphSupport"));
        setField(term50169, term50169.getClass(), "chordal", null);
        setField(term50169, term50169.getClass(), "ordering", null);
        setField(term50169, term50169.getClass(), "positions", null);
        setIntField(term50169, term50169.getClass(), "holeOrderingPos", 0);
        setIntField(term50169, term50169.getClass(), "holeVertex0", 0);
        setIntField(term50169, term50169.getClass(), "holeVertex1", 0);
        setIntField(term50169, term50169.getClass(), "holeVertex2", 0);
        setField(term50169, term50169.getClass(), "hole", null);
        setIntField(term50169, term50169.getClass(), "maxCliquePos", 0);
        setIntField(term50169, term50169.getClass(), "maxCliqueSize", 0);
        setField(term50169, term50169.getClass(), "maximumClique", null);
        setField(term50169, term50169.getClass(), "maximalCliques", null);
        setField(term50169, term50169.getClass(), "coloring", null);
        setField(term50169, term50169.getClass(), "maximumStableSet", null);
        setField(term50169, term50169.getClass(), "minimumCliqueCover", null);
        setField(term50169, term50169.getClass(), "minimalVertexSeparators", null);
        setField(term50169, term50169.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.support.ChordalGraphSupport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaximumStableSet", argTypes, term50169, args);
    }

};


