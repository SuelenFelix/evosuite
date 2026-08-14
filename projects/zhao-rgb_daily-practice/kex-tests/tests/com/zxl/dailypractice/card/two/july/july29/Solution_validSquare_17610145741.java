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

public class Solution_validSquare_17610145741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;
     Object term8;
     Object term13;
     Object term17;

    public Solution_validSquare_17610145741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.zxl.dailypractice.card.two.july.july29.Solution"));
        term2 = (int[]) newIntArray(5);
        setIntElement(term2, 0, 568599855);
        setIntElement(term2, 1, 1162663216);
        setIntElement(term2, 2, 1484323161);
        setIntElement(term2, 3, 391863371);
        setIntElement(term2, 4, -1922583790);
        term8 = (int[]) newIntArray(4);
        setIntElement(term8, 0, -616727354);
        setIntElement(term8, 1, -1955890973);
        setIntElement(term8, 2, -2038273078);
        setIntElement(term8, 3, 1227103734);
        term13 = (int[]) newIntArray(3);
        setIntElement(term13, 0, -1339778481);
        setIntElement(term13, 1, 1725571209);
        setIntElement(term13, 2, -522618178);
        term17 = (int[]) newIntArray(4);
        setIntElement(term17, 0, 1134449235);
        setIntElement(term17, 1, -883034806);
        setIntElement(term17, 2, 1585847225);
        setIntElement(term17, 3, 597278769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.july.july29.Solution");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        argTypes[2] = Array.newInstance(int.class, 0).getClass();
        argTypes[3] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[4];
        args[0] = term2;
        args[1] = term8;
        args[2] = term13;
        args[3] = term17;
        callMethod(klass, "validSquare", argTypes, term1, args);
    }

};


