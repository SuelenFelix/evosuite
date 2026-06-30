package com.zxl.dailypractice.card.one.december.December19;

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
import static com.zxl.dailypractice.card.one.december.December19.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Solution_findJudge_20991265461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;
     Object term4;

    public Solution_findJudge_20991265461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.zxl.dailypractice.card.one.december.December19.Solution"));
        term2 = new Integer(568599855);
        term4 = (Object[]) newArray("[I", 5);
        int[] term5 = (int[]) newIntArray(4);
        int[] term10 = (int[]) newIntArray(3);
        int[] term14 = (int[]) newIntArray(4);
        int[] term19 = (int[]) newIntArray(1);
        int[] term21 = (int[]) newIntArray(6);
        setIntElement(term5, 0, 1162663216);
        setIntElement(term5, 1, 1484323161);
        setIntElement(term5, 2, 391863371);
        setIntElement(term5, 3, -1922583790);
        setElement(term4, 0, term5);
        setIntElement(term10, 0, -616727354);
        setIntElement(term10, 1, -1955890973);
        setIntElement(term10, 2, -2038273078);
        setElement(term4, 1, term10);
        setIntElement(term14, 0, 1227103734);
        setIntElement(term14, 1, -1339778481);
        setIntElement(term14, 2, 1725571209);
        setIntElement(term14, 3, -522618178);
        setElement(term4, 2, term14);
        setIntElement(term19, 0, 1134449235);
        setElement(term4, 3, term19);
        setIntElement(term21, 0, -883034806);
        setIntElement(term21, 1, 1585847225);
        setIntElement(term21, 2, 597278769);
        setIntElement(term21, 3, -1685132342);
        setIntElement(term21, 4, -1456670397);
        setIntElement(term21, 5, 1622346318);
        setElement(term4, 4, term21);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.one.december.December19.Solution");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term2;
        args[1] = term4;
        callMethod(klass, "findJudge", argTypes, term1, args);
    }

};


