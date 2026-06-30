package com.salomondev.interceptor.interceptor.dto;

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
import static com.salomondev.interceptor.interceptor.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedHashMap;
import java.lang.Integer;
import java.lang.Long;

public class LoggerDto_init_128036873418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1852;
     Object term1925;
     Object term1926;
     Object term1928;

    public LoggerDto_init_128036873418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1852 = new LinkedHashMap();
        term1925 = newInstance(Class.forName("java.lang.Object"));
        term1926 = new Integer(590364439);
        term1928 = new Long(-7672528020740371001L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.util.Map");
        argTypes[4] = Class.forName("java.lang.Object");
        argTypes[5] = Class.forName("java.lang.Integer");
        argTypes[6] = Class.forName("java.lang.Long");
        argTypes[7] = Class.forName("java.lang.String");
        Object[] args = new Object[8];
        args[0] = "gCWtLVKVVe";
        args[1] = "fWKJoSoCwE";
        args[2] = "wfaXBpWAUH";
        args[3] = term1852;
        args[4] = term1925;
        args[5] = term1926;
        args[6] = term1928;
        args[7] = "pXOkjyeIRb";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


