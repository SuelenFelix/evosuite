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

public class demo1_main_17285071971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121;

    public demo1_main_17285071971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121 = (Object[]) newArray("java.lang.String", 4);
        setElement(term121, 0, "EGtDIRbSSb");
        setElement(term121, 1, "SzjVpOQTyS");
        setElement(term121, 2, "MjGYSRKTNF");
        setElement(term121, 3, "hRNSzYYIrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.java.practice.generics.demo1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term121;
        callMethod(klass, "main", argTypes, null, args);
    }

};


