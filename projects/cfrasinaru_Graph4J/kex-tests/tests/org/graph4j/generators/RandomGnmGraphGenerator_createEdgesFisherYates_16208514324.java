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

public class RandomGnmGraphGenerator_createEdgesFisherYates_16208514324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term308;
     Object term310;

    public RandomGnmGraphGenerator_createEdgesFisherYates_16208514324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term308 = newInstance(Class.forName("org.graph4j.generators.RandomGnmGraphGenerator"));
        setLongField(term308, term308.getClass(), "numEdges", 0L);
        setField(term308, term308.getClass(), "random", null);
        setField(term308, term308.getClass(), "edgeValues", null);
        setField(term308, term308.getClass(), "vertices", null);
        term310 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomGnmGraphGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term310;
        callMethod(klass, "createEdgesFisherYates", argTypes, term308, args);
    }

};


