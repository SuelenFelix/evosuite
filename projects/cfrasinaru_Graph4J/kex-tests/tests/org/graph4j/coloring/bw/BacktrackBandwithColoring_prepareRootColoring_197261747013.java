package org.graph4j.coloring.bw;

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
import static org.graph4j.coloring.bw.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class BacktrackBandwithColoring_prepareRootColoring_197261747013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term891;
     Object term898;

    public BacktrackBandwithColoring_prepareRootColoring_197261747013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term891 = newInstance(Class.forName("org.graph4j.coloring.bw.BacktrackBandwithColoring"));
        setField(term891, term891.getClass(), "workers", null);
        setLongField(term891, term891.getClass(), "nodesExplored", 0L);
        setLongField(term891, term891.getClass(), "timeLimit", 0L);
        setLongField(term891, term891.getClass(), "startTime", 0L);
        setBooleanField(term891, term891.getClass(), "timeExpired", false);
        setField(term891, term891.getClass(), "initialColoring", null);
        setField(term891, term891.getClass(), "components", null);
        setField(term891, term891.getClass(), "solutions", null);
        setIntField(term891, term891.getClass(), "solutionsLimit", 0);
        setBooleanField(term891, term891.getClass(), "outputEnabled", false);
        setField(term891, term891.getClass(), "maxClique", null);
        setField(term891, term891.getClass(), "graph", null);
        term898 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.bw.BacktrackBandwithColoring");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.coloring.Coloring");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term898;
        callMethod(klass, "prepareRootColoring", argTypes, term891, args);
    }

};


