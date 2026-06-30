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
import java.lang.Object;

public class Solution_maxAreaOfIsland_8994873014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111;
     Object term112;

    public Solution_maxAreaOfIsland_8994873014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day7.Solution"));
        term112 = (Object[]) newArray("[I", 6);
        int[] term113 = (int[]) newIntArray(5);
        int[] term119 = (int[]) newIntArray(5);
        int[] term125 = (int[]) newIntArray(2);
        int[] term128 = (int[]) newIntArray(3);
        int[] term132 = (int[]) newIntArray(1);
        int[] term134 = (int[]) newIntArray(0);
        setIntElement(term113, 0, -1145578966);
        setIntElement(term113, 1, 679763016);
        setIntElement(term113, 2, 1962444399);
        setIntElement(term113, 3, 767834723);
        setIntElement(term113, 4, -602026508);
        setElement(term112, 0, term113);
        setIntElement(term119, 0, -157887805);
        setIntElement(term119, 1, 1876565163);
        setIntElement(term119, 2, -817164822);
        setIntElement(term119, 3, -1016503459);
        setIntElement(term119, 4, -1968847291);
        setElement(term112, 1, term119);
        setIntElement(term125, 0, 579005622);
        setIntElement(term125, 1, -14890619);
        setElement(term112, 2, term125);
        setIntElement(term128, 0, 1632125673);
        setIntElement(term128, 1, 454281060);
        setIntElement(term128, 2, -1786399638);
        setElement(term112, 3, term128);
        setIntElement(term132, 0, 2055867847);
        setElement(term112, 4, term132);
        setElement(term112, 5, term134);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.algorithm.Day7.Solution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term112;
        callMethod(klass, "maxAreaOfIsland", argTypes, term111, args);
    }

};


