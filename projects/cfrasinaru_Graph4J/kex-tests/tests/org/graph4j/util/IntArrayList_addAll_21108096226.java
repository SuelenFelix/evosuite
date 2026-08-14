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

public class IntArrayList_addAll_21108096226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9446;
     Object term9459;

    public IntArrayList_addAll_21108096226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9446 = newInstance(Class.forName("org.graph4j.util.IntArrayList"));
        int[] term9447 = (int[]) newIntArray(10);
        setField(term9446, term9446.getClass(), "values", term9447);
        setIntField(term9446, term9446.getClass(), "size", -1576801556);
        term9459 = (int[]) newIntArray(3);
        setIntElement(term9459, 0, -1572718384);
        setIntElement(term9459, 1, 1623201205);
        setIntElement(term9459, 2, 259489188);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntArrayList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term9459;
        callMethod(klass, "addAll", argTypes, term9446, args);
    }

};


