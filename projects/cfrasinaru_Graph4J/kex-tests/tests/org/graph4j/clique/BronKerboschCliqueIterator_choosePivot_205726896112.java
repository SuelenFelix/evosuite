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

public class BronKerboschCliqueIterator_choosePivot_205726896112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1301;

    public BronKerboschCliqueIterator_choosePivot_205726896112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1301 = newInstance(Class.forName("org.graph4j.clique.BronKerboschCliqueIterator"));
        setField(term1301, term1301.getClass(), "adjMatrix", null);
        setField(term1301, term1301.getClass(), "stack", null);
        setField(term1301, term1301.getClass(), "workingClique", null);
        setField(term1301, term1301.getClass(), "currentClique", null);
        setField(term1301, term1301.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.clique.BronKerboschCliqueIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet");
        argTypes[1] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "choosePivot", argTypes, term1301, args);
    }

};


