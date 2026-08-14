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

public class RandomGnpGraphGenerator_createDirectedPseudograph_149983026110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term616;

    public RandomGnpGraphGenerator_createDirectedPseudograph_149983026110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term616 = newInstance(Class.forName("org.graph4j.generators.RandomGnpGraphGenerator"));
        int[] term618 = (int[]) newIntArray(4);
        setDoubleField(term616, term616.getClass(), "edgeProbability", 0.10667076642995188);
        setIntElement(term618, 0, 584893196);
        setIntElement(term618, 1, 497269071);
        setIntElement(term618, 2, -1899301124);
        setIntElement(term618, 3, -1882480155);
        setField(term616, term616.getClass(), "vertices", term618);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomGnpGraphGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createDirectedPseudograph", argTypes, term616, args);
    }

};


