package com.zxl.dailypractice.card.two.april.april29;

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
import static com.zxl.dailypractice.card.two.april.april29.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class Solution_dfs_2295024392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209;
     Object term218;
     Object term220;
     Object term222;
     Object term224;

    public Solution_dfs_2295024392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209 = newInstance(Class.forName("com.zxl.dailypractice.card.two.april.april29.Solution"));
        Object[] term210 = (Object[]) newArray("[I", 1);
        int[] term211 = (int[]) newIntArray(6);
        setIntElement(term211, 0, -1179120542);
        setIntElement(term211, 1, -73683645);
        setIntElement(term211, 2, -226514366);
        setIntElement(term211, 3, 1193880199);
        setIntElement(term211, 4, -1087774327);
        setIntElement(term211, 5, -1530420153);
        setElement(term210, 0, term211);
        setField(term209, term209.getClass(), "g", term210);
        term218 = new Integer(-469968304);
        term220 = new Integer(-1145578966);
        term222 = new Integer(679763016);
        term224 = new Integer(1962444399);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.april.april29.Solution");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term218;
        args[1] = term220;
        args[2] = term222;
        args[3] = term224;
        callMethod(klass, "dfs", argTypes, term209, args);
    }

};


