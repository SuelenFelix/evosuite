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

public class MaxSubArraySum_getSum_18438980881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291;

    public MaxSubArraySum_getSum_18438980881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291 = newInstance(Class.forName("com.pd.algorithms.MaxSubArraySum"));
        int[] term292 = (int[]) newIntArray(7);
        setIntElement(term292, 0, -1786399638);
        setIntElement(term292, 1, 2055867847);
        setIntElement(term292, 2, -1048298087);
        setIntElement(term292, 3, 292681826);
        setIntElement(term292, 4, 458147407);
        setIntElement(term292, 5, -184153539);
        setIntElement(term292, 6, 493620644);
        setField(term291, term291.getClass(), "arr", term292);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pd.algorithms.MaxSubArraySum");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSum", argTypes, term291, args);
    }

};


