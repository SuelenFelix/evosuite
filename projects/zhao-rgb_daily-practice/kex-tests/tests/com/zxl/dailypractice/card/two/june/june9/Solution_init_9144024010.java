package com.zxl.dailypractice.card.two.june.june9;

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
import static com.zxl.dailypractice.card.two.june.june9.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Solution_init_9144024010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Solution_init_9144024010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = (Object[]) newArray("[I", 5);
        int[] term2 = (int[]) newIntArray(4);
        int[] term7 = (int[]) newIntArray(3);
        int[] term11 = (int[]) newIntArray(4);
        int[] term16 = (int[]) newIntArray(1);
        int[] term18 = (int[]) newIntArray(6);
        setIntElement(term2, 0, 568599855);
        setIntElement(term2, 1, 1162663216);
        setIntElement(term2, 2, 1484323161);
        setIntElement(term2, 3, 391863371);
        setElement(term1, 0, term2);
        setIntElement(term7, 0, -1922583790);
        setIntElement(term7, 1, -616727354);
        setIntElement(term7, 2, -1955890973);
        setElement(term1, 1, term7);
        setIntElement(term11, 0, -2038273078);
        setIntElement(term11, 1, 1227103734);
        setIntElement(term11, 2, -1339778481);
        setIntElement(term11, 3, 1725571209);
        setElement(term1, 2, term11);
        setIntElement(term16, 0, -522618178);
        setElement(term1, 3, term16);
        setIntElement(term18, 0, 1134449235);
        setIntElement(term18, 1, -883034806);
        setIntElement(term18, 2, 1585847225);
        setIntElement(term18, 3, 597278769);
        setIntElement(term18, 4, -1685132342);
        setIntElement(term18, 5, -1456670397);
        setElement(term1, 4, term18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.june.june9.Solution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


