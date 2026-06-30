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
import java.lang.Integer;

public class Solution_helper_21413601608 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194;
     Object term195;
     Object term197;
     Object term199;
     Object term201;

    public Solution_helper_21413601608() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day7.Solution"));
        term195 = new Integer(0);
        term197 = new Integer(0);
        term199 = new Integer(0);
        term201 = new Integer(0);
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
        args[0] = null;
        args[1] = term195;
        args[2] = term197;
        args[3] = term199;
        args[4] = term201;
        callMethod(klass, "helper", argTypes, term194, args);
    }

};


