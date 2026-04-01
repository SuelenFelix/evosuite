package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RadixSort_sort_18202220561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150995;
     Object term150996;

    public RadixSort_sort_18202220561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150995 = newInstance(Class.forName("org.graph4j.util.RadixSort"));
        term150996 = (int[]) newIntArray(6);
        setIntElement(term150996, 0, -803640857);
        setIntElement(term150996, 1, -1644305992);
        setIntElement(term150996, 2, -1595117587);
        setIntElement(term150996, 3, 295067450);
        setIntElement(term150996, 4, -375467282);
        setIntElement(term150996, 5, 1724848604);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.RadixSort");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term150996;
        callMethod(klass, "sort", argTypes, term150995, args);
    }

};


