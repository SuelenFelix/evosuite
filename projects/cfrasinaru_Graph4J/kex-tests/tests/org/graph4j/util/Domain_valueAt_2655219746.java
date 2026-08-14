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

public class Domain_valueAt_2655219746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9916;
     Object term9931;

    public Domain_valueAt_2655219746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9916 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term9918 = (int[]) newIntArray(9);
        int[] term9928 = (int[]) newIntArray(1);
        setIntField(term9916, term9916.getClass(), "vertex", -649940550);
        setIntElement(term9918, 0, 36785954);
        setIntElement(term9918, 1, -907057089);
        setIntElement(term9918, 2, -1740998635);
        setIntElement(term9918, 3, 183857482);
        setIntElement(term9918, 4, -1845135476);
        setIntElement(term9918, 5, -811321521);
        setIntElement(term9918, 6, 449172516);
        setIntElement(term9918, 7, -1224535182);
        setIntElement(term9918, 8, 1181771633);
        setField(term9916, term9916.getClass(), "values", term9918);
        setIntElement(term9928, 0, -21975974);
        setField(term9916, term9916.getClass(), "positions", term9928);
        setIntField(term9916, term9916.getClass(), "size", -862969915);
        term9931 = new Integer(-1289681614);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Domain");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9931;
        callMethod(klass, "valueAt", argTypes, term9916, args);
    }

};


