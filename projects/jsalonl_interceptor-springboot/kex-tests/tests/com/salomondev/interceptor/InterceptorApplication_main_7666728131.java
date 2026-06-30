package com.salomondev.interceptor;

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
import static com.salomondev.interceptor.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class InterceptorApplication_main_7666728131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2137;

    public InterceptorApplication_main_7666728131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2137 = (Object[]) newArray("java.lang.String", 4);
        setElement(term2137, 0, "jwsfVjMoJT");
        setElement(term2137, 1, "ZfdXfCCFDf");
        setElement(term2137, 2, "MwwjNtdOFT");
        setElement(term2137, 3, "VYkqXKVlAJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.InterceptorApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2137;
        callMethod(klass, "main", argTypes, null, args);
    }

};


