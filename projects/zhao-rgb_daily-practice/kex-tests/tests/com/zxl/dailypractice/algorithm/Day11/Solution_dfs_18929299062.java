package com.zxl.dailypractice.algorithm.Day11;

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
import static com.zxl.dailypractice.algorithm.Day11.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;

public class Solution_dfs_18929299062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;
     Object term14;
     Object term19;
     Object term22;
     Object term25;

    public Solution_dfs_18929299062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day11.Solution"));
        term14 = (int[]) newIntArray(4);
        setIntElement(term14, 0, -616727354);
        setIntElement(term14, 1, -1955890973);
        setIntElement(term14, 2, -2038273078);
        setIntElement(term14, 3, 1227103734);
        term19 = new LinkedList();
        term22 = new LinkedList();
        term25 = (boolean[]) newBooleanArray(4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.algorithm.Day11.Solution");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("java.util.List");
        argTypes[3] = Array.newInstance(boolean.class, 0).getClass();
        Object[] args = new Object[4];
        args[0] = term14;
        args[1] = term19;
        args[2] = term22;
        args[3] = term25;
        callMethod(klass, "dfs", argTypes, term13, args);
    }

};


