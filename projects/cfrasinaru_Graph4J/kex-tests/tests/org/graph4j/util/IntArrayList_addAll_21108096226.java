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
     Object term156498;
     Object term156511;

    public IntArrayList_addAll_21108096226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156498 = newInstance(Class.forName("org.graph4j.util.IntArrayList"));
        int[] term156499 = (int[]) newIntArray(10);
        setField(term156498, term156498.getClass(), "values", term156499);
        setIntField(term156498, term156498.getClass(), "size", -194523828);
        term156511 = (int[]) newIntArray(7);
        setIntElement(term156511, 0, 1296079248);
        setIntElement(term156511, 1, 480183177);
        setIntElement(term156511, 2, 2099670623);
        setIntElement(term156511, 3, 1255393076);
        setIntElement(term156511, 4, -2088393132);
        setIntElement(term156511, 5, -1893862682);
        setIntElement(term156511, 6, -1770523092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntArrayList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term156511;
        callMethod(klass, "addAll", argTypes, term156498, args);
    }

};


