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

public class DFSCliqueIterator_neighbors_5694208339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1497;
     Object term1501;

    public DFSCliqueIterator_neighbors_5694208339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1497 = newInstance(Class.forName("org.graph4j.clique.DFSCliqueIterator"));
        setIntField(term1497, term1497.getClass(), "minSize", 0);
        setIntField(term1497, term1497.getClass(), "maxSize", 0);
        setLongField(term1497, term1497.getClass(), "timeout", 0L);
        setField(term1497, term1497.getClass(), "stack", null);
        setField(term1497, term1497.getClass(), "currentClique", null);
        setField(term1497, term1497.getClass(), "graph", null);
        term1501 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.clique.DFSCliqueIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1501;
        args[1] = null;
        callMethod(klass, "neighbors", argTypes, term1497, args);
    }

};


