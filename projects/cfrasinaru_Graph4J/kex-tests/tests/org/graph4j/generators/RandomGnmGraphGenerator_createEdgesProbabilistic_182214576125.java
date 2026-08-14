package org.graph4j.generators;

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
import static org.graph4j.generators.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class RandomGnmGraphGenerator_createEdgesProbabilistic_182214576125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312;
     Object term314;
     Object term316;

    public RandomGnmGraphGenerator_createEdgesProbabilistic_182214576125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term312 = newInstance(Class.forName("org.graph4j.generators.RandomGnmGraphGenerator"));
        setLongField(term312, term312.getClass(), "numEdges", 0L);
        setField(term312, term312.getClass(), "random", null);
        setField(term312, term312.getClass(), "edgeValues", null);
        setField(term312, term312.getClass(), "vertices", null);
        term314 = new Boolean(false);
        term316 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomGnmGraphGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term314;
        args[2] = term316;
        callMethod(klass, "createEdgesProbabilistic", argTypes, term312, args);
    }

};


