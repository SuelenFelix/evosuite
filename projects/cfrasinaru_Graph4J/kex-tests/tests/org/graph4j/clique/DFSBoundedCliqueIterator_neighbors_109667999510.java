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
import java.lang.Double;

public class DFSBoundedCliqueIterator_neighbors_109667999510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1739;
     Object term1744;
     Object term1746;

    public DFSBoundedCliqueIterator_neighbors_109667999510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1739 = newInstance(Class.forName("org.graph4j.clique.DFSBoundedCliqueIterator"));
        setIntField(term1739, term1739.getClass(), "minSize", 0);
        setIntField(term1739, term1739.getClass(), "maxSize", 0);
        setDoubleField(term1739, term1739.getClass(), "maxWeight", 0.0);
        setLongField(term1739, term1739.getClass(), "timeout", 0L);
        setField(term1739, term1739.getClass(), "stack", null);
        setField(term1739, term1739.getClass(), "currentClique", null);
        setField(term1739, term1739.getClass(), "graph", null);
        term1744 = new Integer(0);
        term1746 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.clique.DFSBoundedCliqueIterator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term1744;
        args[1] = null;
        args[2] = term1746;
        callMethod(klass, "neighbors", argTypes, term1739, args);
    }

};


