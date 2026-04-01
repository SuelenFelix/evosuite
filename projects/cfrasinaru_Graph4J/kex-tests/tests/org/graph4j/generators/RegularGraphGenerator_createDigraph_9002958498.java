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

public class RegularGraphGenerator_createDigraph_9002958498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1497;

    public RegularGraphGenerator_createDigraph_9002958498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1497 = newInstance(Class.forName("org.graph4j.generators.RegularGraphGenerator"));
        setIntField(term1497, term1497.getClass(), "degree", 0);
        setField(term1497, term1497.getClass(), "vertices", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RegularGraphGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createDigraph", argTypes, term1497, args);
    }

};


