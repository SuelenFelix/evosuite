package org.graph4j.coloring.eq;

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
import static org.graph4j.coloring.eq.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class BacktrackEquitableColoring_solve_188545629013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term831;
     Object term840;

    public BacktrackEquitableColoring_solve_188545629013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term831 = newInstance(Class.forName("org.graph4j.coloring.eq.BacktrackEquitableColoring"));
        setIntField(term831, term831.getClass(), "maxClassSize", 0);
        setIntField(term831, term831.getClass(), "maxClassCount", 0);
        setField(term831, term831.getClass(), "workers", null);
        setLongField(term831, term831.getClass(), "nodesExplored", 0L);
        setLongField(term831, term831.getClass(), "timeLimit", 0L);
        setLongField(term831, term831.getClass(), "startTime", 0L);
        setBooleanField(term831, term831.getClass(), "timeExpired", false);
        setField(term831, term831.getClass(), "initialColoring", null);
        setField(term831, term831.getClass(), "components", null);
        setField(term831, term831.getClass(), "solutions", null);
        setIntField(term831, term831.getClass(), "solutionsLimit", 0);
        setBooleanField(term831, term831.getClass(), "outputEnabled", false);
        setField(term831, term831.getClass(), "maxClique", null);
        setField(term831, term831.getClass(), "graph", null);
        term840 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.eq.BacktrackEquitableColoring");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term840;
        callMethod(klass, "solve", argTypes, term831, args);
    }

};


