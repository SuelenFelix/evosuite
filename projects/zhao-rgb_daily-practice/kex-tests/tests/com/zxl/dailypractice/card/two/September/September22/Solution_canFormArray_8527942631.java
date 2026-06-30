package com.zxl.dailypractice.card.two.September.September22;

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
import static com.zxl.dailypractice.card.two.September.September22.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Solution_canFormArray_8527942631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;
     Object term8;

    public Solution_canFormArray_8527942631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.zxl.dailypractice.card.two.September.September22.Solution"));
        term2 = (int[]) newIntArray(5);
        setIntElement(term2, 0, 568599855);
        setIntElement(term2, 1, 1162663216);
        setIntElement(term2, 2, 1484323161);
        setIntElement(term2, 3, 391863371);
        setIntElement(term2, 4, -1922583790);
        term8 = (Object[]) newArray("[I", 4);
        int[] term9 = (int[]) newIntArray(3);
        int[] term13 = (int[]) newIntArray(4);
        int[] term18 = (int[]) newIntArray(1);
        int[] term20 = (int[]) newIntArray(6);
        setIntElement(term9, 0, -616727354);
        setIntElement(term9, 1, -1955890973);
        setIntElement(term9, 2, -2038273078);
        setElement(term8, 0, term9);
        setIntElement(term13, 0, 1227103734);
        setIntElement(term13, 1, -1339778481);
        setIntElement(term13, 2, 1725571209);
        setIntElement(term13, 3, -522618178);
        setElement(term8, 1, term13);
        setIntElement(term18, 0, 1134449235);
        setElement(term8, 2, term18);
        setIntElement(term20, 0, -883034806);
        setIntElement(term20, 1, 1585847225);
        setIntElement(term20, 2, 597278769);
        setIntElement(term20, 3, -1685132342);
        setIntElement(term20, 4, -1456670397);
        setIntElement(term20, 5, 1622346318);
        setElement(term8, 3, term20);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.September.September22.Solution");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term2;
        args[1] = term8;
        callMethod(klass, "canFormArray", argTypes, term1, args);
    }

};


