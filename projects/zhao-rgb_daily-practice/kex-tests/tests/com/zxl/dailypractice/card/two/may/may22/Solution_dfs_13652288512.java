package com.zxl.dailypractice.card.two.may.may22;

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
import static com.zxl.dailypractice.card.two.may.may22.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Solution_dfs_13652288512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50016;
     Object term50019;
     Object term50021;
     Object term50023;

    public Solution_dfs_13652288512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50016 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may22.Solution"));
        setIntField(term50016, term50016.getClass(), "n", 0);
        setIntField(term50016, term50016.getClass(), "t", 0);
        setField(term50016, term50016.getClass(), "f", null);
        term50019 = new Integer(0);
        term50021 = new Integer(0);
        term50023 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.may.may22.Solution");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term50019;
        args[1] = term50021;
        args[2] = term50023;
        callMethod(klass, "dfs", argTypes, term50016, args);
    }

};


