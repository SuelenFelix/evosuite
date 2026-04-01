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

public class CountingSort_sort_16590103571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58185;
     Object term58186;

    public CountingSort_sort_16590103571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58185 = newInstance(Class.forName("org.graph4j.util.CountingSort"));
        term58186 = (int[]) newIntArray(7);
        setIntElement(term58186, 0, 2128836583);
        setIntElement(term58186, 1, 1644897809);
        setIntElement(term58186, 2, 1814048906);
        setIntElement(term58186, 3, -113356049);
        setIntElement(term58186, 4, 1523433206);
        setIntElement(term58186, 5, -353002245);
        setIntElement(term58186, 6, 1307822619);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.CountingSort");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term58186;
        callMethod(klass, "sort", argTypes, term58185, args);
    }

};


