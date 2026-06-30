package com.zxl.dailypractice.sort;

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
import static com.zxl.dailypractice.sort.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SelectSort_Select_18003772841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104;
     Object term105;

    public SelectSort_Select_18003772841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104 = newInstance(Class.forName("com.zxl.dailypractice.sort.SelectSort"));
        term105 = (int[]) newIntArray(3);
        setIntElement(term105, 0, -616727354);
        setIntElement(term105, 1, -1955890973);
        setIntElement(term105, 2, -2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.sort.SelectSort");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term105;
        callMethod(klass, "Select", argTypes, term104, args);
    }

};


