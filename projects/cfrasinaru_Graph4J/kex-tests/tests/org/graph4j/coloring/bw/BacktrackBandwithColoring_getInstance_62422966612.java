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
import java.lang.Long;

public class BacktrackBandwithColoring_getInstance_62422966612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term882;
     Object term889;

    public BacktrackBandwithColoring_getInstance_62422966612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term882 = newInstance(Class.forName("org.graph4j.coloring.bw.BacktrackBandwithColoring"));
        setField(term882, term882.getClass(), "workers", null);
        setLongField(term882, term882.getClass(), "nodesExplored", 0L);
        setLongField(term882, term882.getClass(), "timeLimit", 0L);
        setLongField(term882, term882.getClass(), "startTime", 0L);
        setBooleanField(term882, term882.getClass(), "timeExpired", false);
        setField(term882, term882.getClass(), "initialColoring", null);
        setField(term882, term882.getClass(), "components", null);
        setField(term882, term882.getClass(), "solutions", null);
        setIntField(term882, term882.getClass(), "solutionsLimit", 0);
        setBooleanField(term882, term882.getClass(), "outputEnabled", false);
        setField(term882, term882.getClass(), "maxClique", null);
        setField(term882, term882.getClass(), "graph", null);
        term889 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.bw.BacktrackBandwithColoring");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term889;
        callMethod(klass, "getInstance", argTypes, term882, args);
    }

};


