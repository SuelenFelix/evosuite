package com.zxl.dailypractice.algorithm.Day7;

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
import static com.zxl.dailypractice.algorithm.Day7.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class Solution_helper_21413601602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50;
     Object term51;
     Object term67;
     Object term69;
     Object term71;
     Object term73;

    public Solution_helper_21413601602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day7.Solution"));
        term51 = (Object[]) newArray("[I", 2);
        int[] term52 = (int[]) newIntArray(6);
        int[] term59 = (int[]) newIntArray(7);
        setIntElement(term52, 0, -6029667);
        setIntElement(term52, 1, -2068769794);
        setIntElement(term52, 2, -117576464);
        setIntElement(term52, 3, -1007160944);
        setIntElement(term52, 4, 1135664017);
        setIntElement(term52, 5, 590364439);
        setElement(term51, 0, term52);
        setIntElement(term59, 0, 865208305);
        setIntElement(term59, 1, -1275173084);
        setIntElement(term59, 2, -244121226);
        setIntElement(term59, 3, -203030934);
        setIntElement(term59, 4, -1179120542);
        setIntElement(term59, 5, -73683645);
        setIntElement(term59, 6, -226514366);
        setElement(term51, 1, term59);
        term67 = new Integer(1193880199);
        term69 = new Integer(-1087774327);
        term71 = new Integer(-1530420153);
        term73 = new Integer(-469968304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.algorithm.Day7.Solution");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = term51;
        args[1] = term67;
        args[2] = term69;
        args[3] = term71;
        args[4] = term73;
        callMethod(klass, "helper", argTypes, term50, args);
    }

};


