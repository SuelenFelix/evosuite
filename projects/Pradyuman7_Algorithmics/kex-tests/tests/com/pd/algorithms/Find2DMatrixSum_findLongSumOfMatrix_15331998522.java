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

public class Find2DMatrixSum_findLongSumOfMatrix_15331998522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79;

    public Find2DMatrixSum_findLongSumOfMatrix_15331998522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79 = newInstance(Class.forName("com.pd.algorithms.Find2DMatrixSum"));
        Object[] term80 = (Object[]) newArray("[I", 1);
        int[] term81 = (int[]) newIntArray(6);
        setIntElement(term81, 0, -226514366);
        setIntElement(term81, 1, 1193880199);
        setIntElement(term81, 2, -1087774327);
        setIntElement(term81, 3, -1530420153);
        setIntElement(term81, 4, -469968304);
        setIntElement(term81, 5, -1145578966);
        setElement(term80, 0, term81);
        setField(term79, term79.getClass(), "arr", term80);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pd.algorithms.Find2DMatrixSum");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findLongSumOfMatrix", argTypes, term79, args);
    }

};


