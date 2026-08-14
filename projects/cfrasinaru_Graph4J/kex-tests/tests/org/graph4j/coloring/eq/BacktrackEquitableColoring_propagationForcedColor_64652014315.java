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

public class BacktrackEquitableColoring_propagationForcedColor_64652014315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term855;
     Object term864;
     Object term866;

    public BacktrackEquitableColoring_propagationForcedColor_64652014315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term855 = newInstance(Class.forName("org.graph4j.coloring.eq.BacktrackEquitableColoring"));
        setIntField(term855, term855.getClass(), "maxClassSize", 0);
        setIntField(term855, term855.getClass(), "maxClassCount", 0);
        setField(term855, term855.getClass(), "workers", null);
        setLongField(term855, term855.getClass(), "nodesExplored", 0L);
        setLongField(term855, term855.getClass(), "timeLimit", 0L);
        setLongField(term855, term855.getClass(), "startTime", 0L);
        setBooleanField(term855, term855.getClass(), "timeExpired", false);
        setField(term855, term855.getClass(), "initialColoring", null);
        setField(term855, term855.getClass(), "components", null);
        setField(term855, term855.getClass(), "solutions", null);
        setIntField(term855, term855.getClass(), "solutionsLimit", 0);
        setBooleanField(term855, term855.getClass(), "outputEnabled", false);
        setField(term855, term855.getClass(), "maxClique", null);
        setField(term855, term855.getClass(), "graph", null);
        term864 = new Integer(0);
        term866 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.eq.BacktrackEquitableColoring");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.graph4j.coloring.Node");
        Object[] args = new Object[3];
        args[0] = term864;
        args[1] = term866;
        args[2] = null;
        callMethod(klass, "propagationForcedColor", argTypes, term855, args);
    }

};


