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

public class Solution_construct_19725784951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137;
     Object term162;

    public Solution_construct_19725784951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137 = newInstance(Class.forName("com.zxl.dailypractice.card.two.april.april29.Solution"));
        Object[] term138 = (Object[]) newArray("[I", 5);
        int[] term139 = (int[]) newIntArray(4);
        int[] term144 = (int[]) newIntArray(3);
        int[] term148 = (int[]) newIntArray(4);
        int[] term153 = (int[]) newIntArray(1);
        int[] term155 = (int[]) newIntArray(6);
        setIntElement(term139, 0, 568599855);
        setIntElement(term139, 1, 1162663216);
        setIntElement(term139, 2, 1484323161);
        setIntElement(term139, 3, 391863371);
        setElement(term138, 0, term139);
        setIntElement(term144, 0, -1922583790);
        setIntElement(term144, 1, -616727354);
        setIntElement(term144, 2, -1955890973);
        setElement(term138, 1, term144);
        setIntElement(term148, 0, -2038273078);
        setIntElement(term148, 1, 1227103734);
        setIntElement(term148, 2, -1339778481);
        setIntElement(term148, 3, 1725571209);
        setElement(term138, 2, term148);
        setIntElement(term153, 0, -522618178);
        setElement(term138, 3, term153);
        setIntElement(term155, 0, 1134449235);
        setIntElement(term155, 1, -883034806);
        setIntElement(term155, 2, 1585847225);
        setIntElement(term155, 3, 597278769);
        setIntElement(term155, 4, -1685132342);
        setIntElement(term155, 5, -1456670397);
        setElement(term138, 4, term155);
        setField(term137, term137.getClass(), "g", term138);
        term162 = (Object[]) newArray("[I", 2);
        int[] term163 = (int[]) newIntArray(6);
        int[] term170 = (int[]) newIntArray(7);
        setIntElement(term163, 0, 1622346318);
        setIntElement(term163, 1, 1048535127);
        setIntElement(term163, 2, -655067527);
        setIntElement(term163, 3, -6029667);
        setIntElement(term163, 4, -2068769794);
        setIntElement(term163, 5, -117576464);
        setElement(term162, 0, term163);
        setIntElement(term170, 0, -1007160944);
        setIntElement(term170, 1, 1135664017);
        setIntElement(term170, 2, 590364439);
        setIntElement(term170, 3, 865208305);
        setIntElement(term170, 4, -1275173084);
        setIntElement(term170, 5, -244121226);
        setIntElement(term170, 6, -203030934);
        setElement(term162, 1, term170);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.april.april29.Solution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term162;
        callMethod(klass, "construct", argTypes, term137, args);
    }

};


