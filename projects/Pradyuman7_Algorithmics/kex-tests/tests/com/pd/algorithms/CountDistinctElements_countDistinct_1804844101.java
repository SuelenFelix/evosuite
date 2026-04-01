package com.pd.algorithms;

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
import static com.pd.algorithms.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CountDistinctElements_countDistinct_1804844101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term353;

    public CountDistinctElements_countDistinct_1804844101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term353 = newInstance(Class.forName("com.pd.algorithms.CountDistinctElements"));
        int[] term354 = (int[]) newIntArray(6);
        setIntElement(term354, 0, -93135961);
        setIntElement(term354, 1, -112921587);
        setIntElement(term354, 2, 933028652);
        setIntElement(term354, 3, 287287233);
        setIntElement(term354, 4, 962840079);
        setIntElement(term354, 5, 1540719661);
        setField(term353, term353.getClass(), "arr", term354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pd.algorithms.CountDistinctElements");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "countDistinct", argTypes, term353, args);
    }

};


