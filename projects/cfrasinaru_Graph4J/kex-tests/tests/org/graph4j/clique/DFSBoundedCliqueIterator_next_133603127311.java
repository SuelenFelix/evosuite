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

public class DFSBoundedCliqueIterator_next_133603127311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1748;

    public DFSBoundedCliqueIterator_next_133603127311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1748 = newInstance(Class.forName("org.graph4j.clique.DFSBoundedCliqueIterator"));
        setIntField(term1748, term1748.getClass(), "minSize", 0);
        setIntField(term1748, term1748.getClass(), "maxSize", 0);
        setDoubleField(term1748, term1748.getClass(), "maxWeight", 0.0);
        setLongField(term1748, term1748.getClass(), "timeout", 0L);
        setField(term1748, term1748.getClass(), "stack", null);
        setField(term1748, term1748.getClass(), "currentClique", null);
        setField(term1748, term1748.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.clique.DFSBoundedCliqueIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "next", argTypes, term1748, args);
    }

};


