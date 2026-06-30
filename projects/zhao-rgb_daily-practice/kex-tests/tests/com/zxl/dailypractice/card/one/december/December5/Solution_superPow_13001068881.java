package com.zxl.dailypractice.card.one.december.December5;

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
import static com.zxl.dailypractice.card.one.december.December5.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Solution_superPow_13001068881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term3;
     Object term5;

    public Solution_superPow_13001068881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.zxl.dailypractice.card.one.december.December5.Solution"));
        setIntField(term1, term1.getClass(), "base", 1337);
        term3 = new Integer(568599855);
        term5 = (int[]) newIntArray(5);
        setIntElement(term5, 0, 1162663216);
        setIntElement(term5, 1, 1484323161);
        setIntElement(term5, 2, 391863371);
        setIntElement(term5, 3, -1922583790);
        setIntElement(term5, 4, -616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.one.december.December5.Solution");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term3;
        args[1] = term5;
        callMethod(klass, "superPow", argTypes, term1, args);
    }

};


