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

public class RandomKNNGenerator_createGraph_15210981391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2021;

    public RandomKNNGenerator_createGraph_15210981391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2021 = newInstance(Class.forName("org.graph4j.generators.RandomKNNGenerator"));
        int[] term2023 = (int[]) newIntArray(5);
        setIntField(term2021, term2021.getClass(), "k", -1518419301);
        setIntElement(term2023, 0, 674879025);
        setIntElement(term2023, 1, -1538936030);
        setIntElement(term2023, 2, -752870423);
        setIntElement(term2023, 3, -1698809299);
        setIntElement(term2023, 4, 401512128);
        setField(term2021, term2021.getClass(), "vertices", term2023);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomKNNGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createGraph", argTypes, term2021, args);
    }

};


