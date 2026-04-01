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

public class RandomGnpGraphGenerator_builder_15596994673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term539;

    public RandomGnpGraphGenerator_builder_15596994673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term539 = newInstance(Class.forName("org.graph4j.generators.RandomGnpGraphGenerator"));
        int[] term541 = (int[]) newIntArray(5);
        setDoubleField(term539, term539.getClass(), "edgeProbability", 0.8598297828918529);
        setIntElement(term541, 0, 229204365);
        setIntElement(term541, 1, -461771056);
        setIntElement(term541, 2, -243422082);
        setIntElement(term541, 3, 1384592638);
        setIntElement(term541, 4, -1002370457);
        setField(term539, term539.getClass(), "vertices", term541);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomGnpGraphGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "builder", argTypes, term539, args);
    }

};


