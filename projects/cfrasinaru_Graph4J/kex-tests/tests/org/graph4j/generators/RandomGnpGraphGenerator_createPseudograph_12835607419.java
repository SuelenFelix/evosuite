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

public class RandomGnpGraphGenerator_createPseudograph_12835607419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term595;

    public RandomGnpGraphGenerator_createPseudograph_12835607419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term595 = newInstance(Class.forName("org.graph4j.generators.RandomGnpGraphGenerator"));
        int[] term597 = (int[]) newIntArray(9);
        setDoubleField(term595, term595.getClass(), "edgeProbability", 0.7559240768573477);
        setIntElement(term597, 0, 1358829571);
        setIntElement(term597, 1, 991356662);
        setIntElement(term597, 2, -506958186);
        setIntElement(term597, 3, -507387516);
        setIntElement(term597, 4, -1970452551);
        setIntElement(term597, 5, -1896376975);
        setIntElement(term597, 6, 729658803);
        setIntElement(term597, 7, 114754804);
        setIntElement(term597, 8, 1687361082);
        setField(term595, term595.getClass(), "vertices", term597);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomGnpGraphGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createPseudograph", argTypes, term595, args);
    }

};


