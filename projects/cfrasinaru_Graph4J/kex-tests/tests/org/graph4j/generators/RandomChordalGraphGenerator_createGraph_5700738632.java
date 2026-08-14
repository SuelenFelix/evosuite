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

public class RandomChordalGraphGenerator_createGraph_5700738632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2067;

    public RandomChordalGraphGenerator_createGraph_5700738632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2067 = newInstance(Class.forName("org.graph4j.generators.RandomChordalGraphGenerator"));
        int[] term2069 = (int[]) newIntArray(4);
        setIntField(term2067, term2067.getClass(), "maxSubtreeSize", 1163761623);
        setIntElement(term2069, 0, 718742281);
        setIntElement(term2069, 1, 1532723756);
        setIntElement(term2069, 2, -124088550);
        setIntElement(term2069, 3, 777492093);
        setField(term2067, term2067.getClass(), "vertices", term2069);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomChordalGraphGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createGraph", argTypes, term2067, args);
    }

};


