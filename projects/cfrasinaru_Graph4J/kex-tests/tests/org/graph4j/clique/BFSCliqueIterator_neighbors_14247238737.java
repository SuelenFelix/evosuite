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

public class BFSCliqueIterator_neighbors_14247238737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term479;
     Object term482;

    public BFSCliqueIterator_neighbors_14247238737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term479 = newInstance(Class.forName("org.graph4j.clique.BFSCliqueIterator"));
        setIntField(term479, term479.getClass(), "minSize", 0);
        setIntField(term479, term479.getClass(), "maxSize", 0);
        setField(term479, term479.getClass(), "queue", null);
        setField(term479, term479.getClass(), "currentClique", null);
        setField(term479, term479.getClass(), "graph", null);
        term482 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.clique.BFSCliqueIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term482;
        args[1] = null;
        callMethod(klass, "neighbors", argTypes, term479, args);
    }

};


