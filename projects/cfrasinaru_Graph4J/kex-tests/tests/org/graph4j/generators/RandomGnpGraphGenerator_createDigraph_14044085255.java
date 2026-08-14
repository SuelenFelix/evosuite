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

public class RandomGnpGraphGenerator_createDigraph_14044085255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term561;

    public RandomGnpGraphGenerator_createDigraph_14044085255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term561 = newInstance(Class.forName("org.graph4j.generators.RandomGnpGraphGenerator"));
        int[] term563 = (int[]) newIntArray(5);
        setDoubleField(term561, term561.getClass(), "edgeProbability", 0.7633268466829064);
        setIntElement(term563, 0, -1274456137);
        setIntElement(term563, 1, 1041916673);
        setIntElement(term563, 2, -601863069);
        setIntElement(term563, 3, 663292551);
        setIntElement(term563, 4, -1885090354);
        setField(term561, term561.getClass(), "vertices", term563);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomGnpGraphGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createDigraph", argTypes, term561, args);
    }

};


