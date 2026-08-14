package com.leosam.tvbox.mv.utils;

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
import static com.leosam.tvbox.mv.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ClassPathReaderUtils_main_3250815869 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1730;

    public ClassPathReaderUtils_main_3250815869() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1730 = (Object[]) newArray("java.lang.String", 9);
        setElement(term1730, 0, "MLqYREekMl");
        setElement(term1730, 1, "ytSBIKXogI");
        setElement(term1730, 2, "nHXjMycHlU");
        setElement(term1730, 3, "ieCtQFdkii");
        setElement(term1730, 4, "dEnhdmILtU");
        setElement(term1730, 5, "hoicvmsovO");
        setElement(term1730, 6, "eqJfYWRaEL");
        setElement(term1730, 7, "fhkbdRViHi");
        setElement(term1730, 8, "uWHnvSvaPl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.utils.ClassPathReaderUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1730;
        callMethod(klass, "main", argTypes, null, args);
    }

};


