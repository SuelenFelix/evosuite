package com.zxl.dailypractice.card.two.june.june7;

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
import static com.zxl.dailypractice.card.two.june.june7.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Solution_getTime_18893800582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15;
     Object term16;
     Object term21;

    public Solution_getTime_18893800582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15 = newInstance(Class.forName("com.zxl.dailypractice.card.two.june.june7.Solution"));
        term16 = (int[]) newIntArray(4);
        setIntElement(term16, 0, -1955890973);
        setIntElement(term16, 1, -2038273078);
        setIntElement(term16, 2, 1227103734);
        setIntElement(term16, 3, -1339778481);
        term21 = new Integer(1725571209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.june.june7.Solution");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term16;
        args[1] = term21;
        callMethod(klass, "getTime", argTypes, term15, args);
    }

};


