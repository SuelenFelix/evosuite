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
import java.lang.Integer;

public class BinarySearch_search_8851646741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term732;
     Object term739;

    public BinarySearch_search_8851646741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term732 = newInstance(Class.forName("com.pd.algorithms.BinarySearch"));
        int[] term733 = (int[]) newIntArray(4);
        setIntElement(term733, 0, -523949691);
        setIntElement(term733, 1, 1398204340);
        setIntElement(term733, 2, 229204365);
        setIntElement(term733, 3, -461771056);
        setField(term732, term732.getClass(), "array", term733);
        setIntField(term732, term732.getClass(), "size", -243422082);
        term739 = new Integer(1384592638);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pd.algorithms.BinarySearch");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term739;
        callMethod(klass, "search", argTypes, term732, args);
    }

};


