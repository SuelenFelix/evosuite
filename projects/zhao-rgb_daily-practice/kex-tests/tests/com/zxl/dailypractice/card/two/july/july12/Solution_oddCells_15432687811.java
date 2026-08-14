package com.zxl.dailypractice.card.two.july.july12;

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
import static com.zxl.dailypractice.card.two.july.july12.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Solution_oddCells_15432687811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;
     Object term4;
     Object term6;

    public Solution_oddCells_15432687811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.zxl.dailypractice.card.two.july.july12.Solution"));
        term2 = new Integer(568599855);
        term4 = new Integer(1162663216);
        term6 = (Object[]) newArray("[I", 5);
        int[] term7 = (int[]) newIntArray(4);
        int[] term12 = (int[]) newIntArray(3);
        int[] term16 = (int[]) newIntArray(4);
        int[] term21 = (int[]) newIntArray(1);
        int[] term23 = (int[]) newIntArray(6);
        setIntElement(term7, 0, 1484323161);
        setIntElement(term7, 1, 391863371);
        setIntElement(term7, 2, -1922583790);
        setIntElement(term7, 3, -616727354);
        setElement(term6, 0, term7);
        setIntElement(term12, 0, -1955890973);
        setIntElement(term12, 1, -2038273078);
        setIntElement(term12, 2, 1227103734);
        setElement(term6, 1, term12);
        setIntElement(term16, 0, -1339778481);
        setIntElement(term16, 1, 1725571209);
        setIntElement(term16, 2, -522618178);
        setIntElement(term16, 3, 1134449235);
        setElement(term6, 2, term16);
        setIntElement(term21, 0, -883034806);
        setElement(term6, 3, term21);
        setIntElement(term23, 0, 1585847225);
        setIntElement(term23, 1, 597278769);
        setIntElement(term23, 2, -1685132342);
        setIntElement(term23, 3, -1456670397);
        setIntElement(term23, 4, 1622346318);
        setIntElement(term23, 5, 1048535127);
        setElement(term6, 4, term23);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.july.july12.Solution");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term2;
        args[1] = term4;
        args[2] = term6;
        callMethod(klass, "oddCells", argTypes, term1, args);
    }

};


