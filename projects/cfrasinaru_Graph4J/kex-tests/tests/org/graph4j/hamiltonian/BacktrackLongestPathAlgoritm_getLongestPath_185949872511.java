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

public class BacktrackLongestPathAlgoritm_getLongestPath_185949872511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315;
     Object term319;
     Object term321;

    public BacktrackLongestPathAlgoritm_getLongestPath_185949872511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term315 = newInstance(Class.forName("org.graph4j.hamiltonian.BacktrackLongestPathAlgoritm"));
        setField(term315, term315.getClass(), "currentBest", null);
        setField(term315, term315.getClass(), "currentPath", null);
        setIntField(term315, term315.getClass(), "source", 0);
        setIntField(term315, term315.getClass(), "target", 0);
        setField(term315, term315.getClass(), "graph", null);
        setBooleanField(term315, term315.getClass(), "directed", false);
        term319 = new Integer(0);
        term321 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.hamiltonian.BacktrackLongestPathAlgoritm");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term319;
        args[1] = term321;
        callMethod(klass, "getLongestPath", argTypes, term315, args);
    }

};


