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
import java.lang.Object;

public class Find2DMatrixSum_init_2275186180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;

    public Find2DMatrixSum_init_2275186180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = (Object[]) newArray("[I", 3);
        int[] term24 = (int[]) newIntArray(4);
        int[] term29 = (int[]) newIntArray(1);
        int[] term31 = (int[]) newIntArray(6);
        setIntElement(term24, 0, -1339778481);
        setIntElement(term24, 1, 1725571209);
        setIntElement(term24, 2, -522618178);
        setIntElement(term24, 3, 1134449235);
        setElement(term23, 0, term24);
        setIntElement(term29, 0, -883034806);
        setElement(term23, 1, term29);
        setIntElement(term31, 0, 1585847225);
        setIntElement(term31, 1, 597278769);
        setIntElement(term31, 2, -1685132342);
        setIntElement(term31, 3, -1456670397);
        setIntElement(term31, 4, 1622346318);
        setIntElement(term31, 5, 1048535127);
        setElement(term23, 2, term31);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pd.algorithms.Find2DMatrixSum");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term23;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


