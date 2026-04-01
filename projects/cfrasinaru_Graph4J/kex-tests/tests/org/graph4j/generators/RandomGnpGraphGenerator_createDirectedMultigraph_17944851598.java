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

public class RandomGnpGraphGenerator_createDirectedMultigraph_17944851598 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term592;

    public RandomGnpGraphGenerator_createDirectedMultigraph_17944851598() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term592 = newInstance(Class.forName("org.graph4j.generators.RandomGnpGraphGenerator"));
        int[] term594 = (int[]) newIntArray(0);
        setDoubleField(term592, term592.getClass(), "edgeProbability", 0.5840714198152577);
        setField(term592, term592.getClass(), "vertices", term594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomGnpGraphGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createDirectedMultigraph", argTypes, term592, args);
    }

};


