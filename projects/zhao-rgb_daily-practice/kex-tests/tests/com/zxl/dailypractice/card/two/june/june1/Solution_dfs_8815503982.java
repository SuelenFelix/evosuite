package com.zxl.dailypractice.card.two.june.june1;

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
import static com.zxl.dailypractice.card.two.june.june1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Solution_dfs_8815503982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;
     Object term14;
     Object term16;
     Object term21;
     Object term25;

    public Solution_dfs_8815503982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = newInstance(Class.forName("com.zxl.dailypractice.card.two.june.june1.Solution"));
        term14 = new Integer(-616727354);
        term16 = (int[]) newIntArray(4);
        setIntElement(term16, 0, -1955890973);
        setIntElement(term16, 1, -2038273078);
        setIntElement(term16, 2, 1227103734);
        setIntElement(term16, 3, -1339778481);
        term21 = (int[]) newIntArray(3);
        setIntElement(term21, 0, 1725571209);
        setIntElement(term21, 1, -522618178);
        setIntElement(term21, 2, 1134449235);
        term25 = new Integer(-883034806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.june.june1.Solution");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        argTypes[2] = Array.newInstance(int.class, 0).getClass();
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term14;
        args[1] = term16;
        args[2] = term21;
        args[3] = term25;
        callMethod(klass, "dfs", argTypes, term13, args);
    }

};


