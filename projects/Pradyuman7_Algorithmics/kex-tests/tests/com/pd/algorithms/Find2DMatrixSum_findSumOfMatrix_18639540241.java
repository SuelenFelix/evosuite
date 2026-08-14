package com.pd.algorithms;

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
import static com.pd.algorithms.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Find2DMatrixSum_findSumOfMatrix_18639540241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49;

    public Find2DMatrixSum_findSumOfMatrix_18639540241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49 = newInstance(Class.forName("com.pd.algorithms.Find2DMatrixSum"));
        Object[] term50 = (Object[]) newArray("[I", 2);
        int[] term51 = (int[]) newIntArray(6);
        int[] term58 = (int[]) newIntArray(7);
        setIntElement(term51, 0, -655067527);
        setIntElement(term51, 1, -6029667);
        setIntElement(term51, 2, -2068769794);
        setIntElement(term51, 3, -117576464);
        setIntElement(term51, 4, -1007160944);
        setIntElement(term51, 5, 1135664017);
        setElement(term50, 0, term51);
        setIntElement(term58, 0, 590364439);
        setIntElement(term58, 1, 865208305);
        setIntElement(term58, 2, -1275173084);
        setIntElement(term58, 3, -244121226);
        setIntElement(term58, 4, -203030934);
        setIntElement(term58, 5, -1179120542);
        setIntElement(term58, 6, -73683645);
        setElement(term50, 1, term58);
        setField(term49, term49.getClass(), "arr", term50);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pd.algorithms.Find2DMatrixSum");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findSumOfMatrix", argTypes, term49, args);
    }

};


