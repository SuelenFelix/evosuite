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
import java.util.HashMap;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Long;

public class LoggerDto_LoggerDtoBuilder_build_18058668439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2947;

    public LoggerDto_LoggerDtoBuilder_build_18058668439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2984 = new HashMap();
        Integer term2995 = new Integer(-1530420153);
        Long term2997 = new Long(6617340557564669657L);
        term2947 = newInstance(Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto$LoggerDtoBuilder"));
        Object term2994 = newInstance(Class.forName("java.lang.Object"));
        setField(term2947, term2947.getClass(), "method", "vKQukfbJUd");
        setField(term2947, term2947.getClass(), "ip", "lFRJFUMVbx");
        setField(term2947, term2947.getClass(), "path", "sZdUNdggUW");
        setField(term2947, term2947.getClass(), "parametersIn", term2984);
        setField(term2947, term2947.getClass(), "parametersOut", term2994);
        setField(term2947, term2947.getClass(), "codeResponse", term2995);
        setField(term2947, term2947.getClass(), "timeConsumeService", term2997);
        setField(term2947, term2947.getClass(), "timeResponseService", "tRxZafjqIx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto$LoggerDtoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term2947, args);
    }

};


