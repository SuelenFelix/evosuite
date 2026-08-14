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

public class RandomGnpGraphGenerator_createNetwork_11199636716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term574;

    public RandomGnpGraphGenerator_createNetwork_11199636716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term574 = newInstance(Class.forName("org.graph4j.generators.RandomGnpGraphGenerator"));
        int[] term576 = (int[]) newIntArray(5);
        setDoubleField(term574, term574.getClass(), "edgeProbability", 0.13481025392611334);
        setIntElement(term576, 0, -2066804303);
        setIntElement(term576, 1, -1731761810);
        setIntElement(term576, 2, 197109649);
        setIntElement(term576, 3, -1239406390);
        setIntElement(term576, 4, 1557431527);
        setField(term574, term574.getClass(), "vertices", term576);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomGnpGraphGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createNetwork", argTypes, term574, args);
    }

};


