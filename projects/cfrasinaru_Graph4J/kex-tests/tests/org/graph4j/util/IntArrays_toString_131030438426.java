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
import java.lang.Integer;

public class IntArrays_toString_131030438426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9278;
     Object term9284;
     Object term9286;

    public IntArrays_toString_131030438426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9278 = (int[]) newIntArray(5);
        setIntElement(term9278, 0, -637767208);
        setIntElement(term9278, 1, 844890845);
        setIntElement(term9278, 2, -989538894);
        setIntElement(term9278, 3, 1316863342);
        setIntElement(term9278, 4, 735033722);
        term9284 = new Integer(-1409886459);
        term9286 = new Integer(666379561);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntArrays");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term9278;
        args[1] = term9284;
        args[2] = term9286;
        callMethod(klass, "toString", argTypes, null, args);
    }

};


