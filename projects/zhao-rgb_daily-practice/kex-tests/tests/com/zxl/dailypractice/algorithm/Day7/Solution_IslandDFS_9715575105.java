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
import java.lang.Integer;

public class Solution_IslandDFS_9715575105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151;
     Object term152;
     Object term169;
     Object term171;

    public Solution_IslandDFS_9715575105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day7.Solution"));
        term152 = (Object[]) newArray("[I", 2);
        int[] term153 = (int[]) newIntArray(8);
        int[] term162 = (int[]) newIntArray(6);
        setIntElement(term153, 0, -1048298087);
        setIntElement(term153, 1, 292681826);
        setIntElement(term153, 2, 458147407);
        setIntElement(term153, 3, -184153539);
        setIntElement(term153, 4, 493620644);
        setIntElement(term153, 5, 1328271830);
        setIntElement(term153, 6, 1596070772);
        setIntElement(term153, 7, 97029295);
        setElement(term152, 0, term153);
        setIntElement(term162, 0, -1371869594);
        setIntElement(term162, 1, -2095575670);
        setIntElement(term162, 2, 1225272962);
        setIntElement(term162, 3, 1324040357);
        setIntElement(term162, 4, -1588772968);
        setIntElement(term162, 5, -93135961);
        setElement(term152, 1, term162);
        term169 = new Integer(-112921587);
        term171 = new Integer(933028652);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.algorithm.Day7.Solution");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term152;
        args[1] = term169;
        args[2] = term171;
        callMethod(klass, "IslandDFS", argTypes, term151, args);
    }

};


