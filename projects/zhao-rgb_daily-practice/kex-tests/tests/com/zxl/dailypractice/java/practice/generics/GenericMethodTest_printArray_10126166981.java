package com.zxl.dailypractice.java.practice.generics;

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
import static com.zxl.dailypractice.java.practice.generics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GenericMethodTest_printArray_10126166981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;

    public GenericMethodTest_printArray_10126166981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7 = (Object[]) newArray("java.lang.Object", 8);
        Object term8 = newInstance(Class.forName("java.lang.Object"));
        Object term9 = newInstance(Class.forName("java.lang.Object"));
        Object term10 = newInstance(Class.forName("java.lang.Object"));
        Object term11 = newInstance(Class.forName("java.lang.Object"));
        Object term12 = newInstance(Class.forName("java.lang.Object"));
        Object term13 = newInstance(Class.forName("java.lang.Object"));
        Object term14 = newInstance(Class.forName("java.lang.Object"));
        Object term15 = newInstance(Class.forName("java.lang.Object"));
        setElement(term7, 0, term8);
        setElement(term7, 1, term9);
        setElement(term7, 2, term10);
        setElement(term7, 3, term11);
        setElement(term7, 4, term12);
        setElement(term7, 5, term13);
        setElement(term7, 6, term14);
        setElement(term7, 7, term15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.java.practice.generics.GenericMethodTest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term7;
        callMethod(klass, "printArray", argTypes, null, args);
    }

};


