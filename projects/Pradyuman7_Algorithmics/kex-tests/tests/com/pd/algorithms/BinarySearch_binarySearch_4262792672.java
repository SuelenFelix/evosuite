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

public class BinarySearch_binarySearch_4262792672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term745;
     Object term750;
     Object term752;
     Object term754;

    public BinarySearch_binarySearch_4262792672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term745 = newInstance(Class.forName("com.pd.algorithms.BinarySearch"));
        int[] term746 = (int[]) newIntArray(2);
        setIntElement(term746, 0, -1002370457);
        setIntElement(term746, 1, -2014576105);
        setField(term745, term745.getClass(), "array", term746);
        setIntField(term745, term745.getClass(), "size", 1296895584);
        term750 = new Integer(628918458);
        term752 = new Integer(-1274456137);
        term754 = new Integer(1041916673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pd.algorithms.BinarySearch");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term750;
        args[1] = term752;
        args[2] = term754;
        callMethod(klass, "binarySearch", argTypes, term745, args);
    }

};


