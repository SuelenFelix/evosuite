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

public class BronKerboschCliqueFinder_expand_10507405569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2636;

    public BronKerboschCliqueFinder_expand_10507405569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2636 = newInstance(Class.forName("org.graph4j.clique.BronKerboschCliqueFinder"));
        setField(term2636, term2636.getClass(), "workingClique", null);
        setField(term2636, term2636.getClass(), "cliques", null);
        setField(term2636, term2636.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.clique.BronKerboschCliqueFinder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet");
        argTypes[1] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "expand", argTypes, term2636, args);
    }

};


