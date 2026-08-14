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
import java.lang.Integer;

public class CountSort_countSort_15880353251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term658;
     Object term659;
     Object term661;

    public CountSort_countSort_15880353251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term658 = newInstance(Class.forName("com.pd.algorithms.CountSort"));
        term659 = new Integer(-1697741339);
        term661 = (int[]) newIntArray(7);
        setIntElement(term661, 0, 98922530);
        setIntElement(term661, 1, -1388471422);
        setIntElement(term661, 2, -1498296052);
        setIntElement(term661, 3, 2098647989);
        setIntElement(term661, 4, 1598895173);
        setIntElement(term661, 5, 1830648570);
        setIntElement(term661, 6, -227365013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pd.algorithms.CountSort");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term659;
        args[1] = term661;
        callMethod(klass, "countSort", argTypes, term658, args);
    }

};


