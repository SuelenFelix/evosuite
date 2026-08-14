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

public class IntArrays_contains_8587129807 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9002;
     Object term9007;

    public IntArrays_contains_8587129807() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9002 = (int[]) newIntArray(4);
        setIntElement(term9002, 0, -357630956);
        setIntElement(term9002, 1, -1068878345);
        setIntElement(term9002, 2, 1386128235);
        setIntElement(term9002, 3, -1047109164);
        term9007 = (int[]) newIntArray(4);
        setIntElement(term9007, 0, -1650626012);
        setIntElement(term9007, 1, -2045231879);
        setIntElement(term9007, 2, 1678025090);
        setIntElement(term9007, 3, 714453255);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntArrays");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term9002;
        args[1] = term9007;
        callMethod(klass, "contains", argTypes, null, args);
    }

};


