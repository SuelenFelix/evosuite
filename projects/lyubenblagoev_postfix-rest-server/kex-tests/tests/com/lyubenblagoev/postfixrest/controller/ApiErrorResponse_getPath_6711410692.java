package com.lyubenblagoev.postfixrest.controller;

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
import static com.lyubenblagoev.postfixrest.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ApiErrorResponse_getPath_6711410692 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1034;

    public ApiErrorResponse_getPath_6711410692() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1034 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.controller.ApiErrorResponse"));
        setField(term1034, term1034.getClass(), "message", "tShwQLRGNe");
        setField(term1034, term1034.getClass(), "path", "LvtrsXUliU");
        setField(term1034, term1034.getClass(), "method", "xLbjWUgOIL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.controller.ApiErrorResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPath", argTypes, term1034, args);
    }

};


