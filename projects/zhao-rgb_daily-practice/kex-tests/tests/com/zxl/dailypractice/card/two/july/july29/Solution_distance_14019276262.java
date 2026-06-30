package com.zxl.dailypractice.card.two.july.july29;

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
import static com.zxl.dailypractice.card.two.july.july29.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Solution_distance_14019276262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38;
     Object term39;
     Object term41;

    public Solution_distance_14019276262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38 = newInstance(Class.forName("com.zxl.dailypractice.card.two.july.july29.Solution"));
        term39 = (int[]) newIntArray(1);
        setIntElement(term39, 0, -1685132342);
        term41 = (int[]) newIntArray(6);
        setIntElement(term41, 0, -1456670397);
        setIntElement(term41, 1, 1622346318);
        setIntElement(term41, 2, 1048535127);
        setIntElement(term41, 3, -655067527);
        setIntElement(term41, 4, -6029667);
        setIntElement(term41, 5, -2068769794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.july.july29.Solution");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term39;
        args[1] = term41;
        callMethod(klass, "distance", argTypes, term38, args);
    }

};


