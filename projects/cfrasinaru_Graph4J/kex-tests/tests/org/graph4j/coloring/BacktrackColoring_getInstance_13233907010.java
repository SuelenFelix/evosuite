package org.graph4j.coloring;

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
import static org.graph4j.coloring.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class BacktrackColoring_getInstance_13233907010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5859;
     Object term5866;

    public BacktrackColoring_getInstance_13233907010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5859 = newInstance(Class.forName("org.graph4j.coloring.BacktrackColoring"));
        setField(term5859, term5859.getClass(), "workers", null);
        setLongField(term5859, term5859.getClass(), "nodesExplored", 0L);
        setLongField(term5859, term5859.getClass(), "timeLimit", 0L);
        setLongField(term5859, term5859.getClass(), "startTime", 0L);
        setBooleanField(term5859, term5859.getClass(), "timeExpired", false);
        setField(term5859, term5859.getClass(), "initialColoring", null);
        setField(term5859, term5859.getClass(), "components", null);
        setField(term5859, term5859.getClass(), "solutions", null);
        setIntField(term5859, term5859.getClass(), "solutionsLimit", 0);
        setBooleanField(term5859, term5859.getClass(), "outputEnabled", false);
        setField(term5859, term5859.getClass(), "maxClique", null);
        setField(term5859, term5859.getClass(), "graph", null);
        term5866 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.BacktrackColoring");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term5866;
        callMethod(klass, "getInstance", argTypes, term5859, args);
    }

};


