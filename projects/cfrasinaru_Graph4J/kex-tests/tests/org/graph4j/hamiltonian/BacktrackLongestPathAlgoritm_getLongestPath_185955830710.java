package org.graph4j.hamiltonian;

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
import static org.graph4j.hamiltonian.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class BacktrackLongestPathAlgoritm_getLongestPath_185955830710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309;
     Object term313;

    public BacktrackLongestPathAlgoritm_getLongestPath_185955830710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term309 = newInstance(Class.forName("org.graph4j.hamiltonian.BacktrackLongestPathAlgoritm"));
        setField(term309, term309.getClass(), "currentBest", null);
        setField(term309, term309.getClass(), "currentPath", null);
        setIntField(term309, term309.getClass(), "source", 0);
        setIntField(term309, term309.getClass(), "target", 0);
        setField(term309, term309.getClass(), "graph", null);
        setBooleanField(term309, term309.getClass(), "directed", false);
        term313 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.hamiltonian.BacktrackLongestPathAlgoritm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term313;
        callMethod(klass, "getLongestPath", argTypes, term309, args);
    }

};


