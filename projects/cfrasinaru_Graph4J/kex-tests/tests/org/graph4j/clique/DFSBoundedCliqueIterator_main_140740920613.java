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

public class DFSBoundedCliqueIterator_main_140740920613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1758;

    public DFSBoundedCliqueIterator_main_140740920613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1758 = newInstance(Class.forName("org.graph4j.clique.DFSBoundedCliqueIterator"));
        setIntField(term1758, term1758.getClass(), "minSize", 0);
        setIntField(term1758, term1758.getClass(), "maxSize", 0);
        setDoubleField(term1758, term1758.getClass(), "maxWeight", 0.0);
        setLongField(term1758, term1758.getClass(), "timeout", 0L);
        setField(term1758, term1758.getClass(), "stack", null);
        setField(term1758, term1758.getClass(), "currentClique", null);
        setField(term1758, term1758.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.clique.DFSBoundedCliqueIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "main", argTypes, term1758, args);
    }

};


