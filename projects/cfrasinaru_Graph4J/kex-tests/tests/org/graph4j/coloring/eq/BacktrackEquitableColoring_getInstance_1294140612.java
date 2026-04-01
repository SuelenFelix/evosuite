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
import java.lang.Long;

public class BacktrackEquitableColoring_getInstance_1294140612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term820;
     Object term829;

    public BacktrackEquitableColoring_getInstance_1294140612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term820 = newInstance(Class.forName("org.graph4j.coloring.eq.BacktrackEquitableColoring"));
        setIntField(term820, term820.getClass(), "maxClassSize", 0);
        setIntField(term820, term820.getClass(), "maxClassCount", 0);
        setField(term820, term820.getClass(), "workers", null);
        setLongField(term820, term820.getClass(), "nodesExplored", 0L);
        setLongField(term820, term820.getClass(), "timeLimit", 0L);
        setLongField(term820, term820.getClass(), "startTime", 0L);
        setBooleanField(term820, term820.getClass(), "timeExpired", false);
        setField(term820, term820.getClass(), "initialColoring", null);
        setField(term820, term820.getClass(), "components", null);
        setField(term820, term820.getClass(), "solutions", null);
        setIntField(term820, term820.getClass(), "solutionsLimit", 0);
        setBooleanField(term820, term820.getClass(), "outputEnabled", false);
        setField(term820, term820.getClass(), "maxClique", null);
        setField(term820, term820.getClass(), "graph", null);
        term829 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.eq.BacktrackEquitableColoring");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term829;
        callMethod(klass, "getInstance", argTypes, term820, args);
    }

};


