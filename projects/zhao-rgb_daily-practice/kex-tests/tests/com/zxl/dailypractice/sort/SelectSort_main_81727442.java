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
import java.lang.Object;

public class SelectSort_main_81727442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112;

    public SelectSort_main_81727442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112 = (Object[]) newArray("java.lang.String", 4);
        setElement(term112, 0, "jJCZpVmanW");
        setElement(term112, 1, "EGtDIRbSSb");
        setElement(term112, 2, "SzjVpOQTyS");
        setElement(term112, 3, "MjGYSRKTNF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.sort.SelectSort");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term112;
        callMethod(klass, "main", argTypes, null, args);
    }

};


