package org.graph4j.clique;

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
import static org.graph4j.clique.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class MaximalCliqueFinder_getMaximalClique_12539624432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;
     Object term19;

    public MaximalCliqueFinder_getMaximalClique_12539624432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = newInstance(Class.forName("org.graph4j.clique.MaximalCliqueFinder"));
        boolean[] term14 = (boolean[]) newBooleanArray(4);
        setBooleanElement(term14, 0, true);
        setBooleanElement(term14, 1, true);
        setBooleanElement(term14, 2, true);
        setField(term13, term13.getClass(), "visited", term14);
        setField(term13, term13.getClass(), "graph", null);
        term19 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.clique.MaximalCliqueFinder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term19;
        callMethod(klass, "getMaximalClique", argTypes, term13, args);
    }

};


