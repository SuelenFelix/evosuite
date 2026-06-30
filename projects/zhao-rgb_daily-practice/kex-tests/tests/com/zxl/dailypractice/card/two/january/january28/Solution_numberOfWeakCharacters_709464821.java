package com.zxl.dailypractice.card.two.january.january28;

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
import static com.zxl.dailypractice.card.two.january.january28.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Solution_numberOfWeakCharacters_709464821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public Solution_numberOfWeakCharacters_709464821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.zxl.dailypractice.card.two.january.january28.Solution"));
        term2 = (Object[]) newArray("[I", 5);
        int[] term3 = (int[]) newIntArray(4);
        int[] term8 = (int[]) newIntArray(3);
        int[] term12 = (int[]) newIntArray(4);
        int[] term17 = (int[]) newIntArray(1);
        int[] term19 = (int[]) newIntArray(6);
        setIntElement(term3, 0, 568599855);
        setIntElement(term3, 1, 1162663216);
        setIntElement(term3, 2, 1484323161);
        setIntElement(term3, 3, 391863371);
        setElement(term2, 0, term3);
        setIntElement(term8, 0, -1922583790);
        setIntElement(term8, 1, -616727354);
        setIntElement(term8, 2, -1955890973);
        setElement(term2, 1, term8);
        setIntElement(term12, 0, -2038273078);
        setIntElement(term12, 1, 1227103734);
        setIntElement(term12, 2, -1339778481);
        setIntElement(term12, 3, 1725571209);
        setElement(term2, 2, term12);
        setIntElement(term17, 0, -522618178);
        setElement(term2, 3, term17);
        setIntElement(term19, 0, 1134449235);
        setIntElement(term19, 1, -883034806);
        setIntElement(term19, 2, 1585847225);
        setIntElement(term19, 3, 597278769);
        setIntElement(term19, 4, -1685132342);
        setIntElement(term19, 5, -1456670397);
        setElement(term2, 4, term19);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.january.january28.Solution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "numberOfWeakCharacters", argTypes, term1, args);
    }

};


