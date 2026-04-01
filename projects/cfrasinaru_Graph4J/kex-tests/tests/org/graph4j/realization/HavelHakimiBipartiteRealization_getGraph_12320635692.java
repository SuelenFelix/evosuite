package org.graph4j.realization;

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
import static org.graph4j.realization.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class HavelHakimiBipartiteRealization_getGraph_12320635692 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40;

    public HavelHakimiBipartiteRealization_getGraph_12320635692() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term50 = new Boolean(false);
        term40 = newInstance(Class.forName("org.graph4j.realization.HavelHakimiBipartiteRealization"));
        int[] term41 = (int[]) newIntArray(1);
        int[] term43 = (int[]) newIntArray(6);
        setIntElement(term41, 0, -1685132342);
        setField(term40, term40.getClass(), "leftDegrees", term41);
        setIntElement(term43, 0, -1456670397);
        setIntElement(term43, 1, 1622346318);
        setIntElement(term43, 2, 1048535127);
        setIntElement(term43, 3, -655067527);
        setIntElement(term43, 4, -6029667);
        setIntElement(term43, 5, -2068769794);
        setField(term40, term40.getClass(), "rightDegrees", term43);
        setField(term40, term40.getClass(), "bigraphic", term50);
        setField(term40, term40.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.realization.HavelHakimiBipartiteRealization");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGraph", argTypes, term40, args);
    }

};


