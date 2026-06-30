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

public class LoggerDto_getParametersOut_145167641226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1988;

    public LoggerDto_getParametersOut_145167641226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1988 = newInstance(Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto"));
        setField(term1988, term1988.getClass(), "method", null);
        setField(term1988, term1988.getClass(), "ip", null);
        setField(term1988, term1988.getClass(), "path", null);
        setField(term1988, term1988.getClass(), "parametersIn", null);
        setField(term1988, term1988.getClass(), "parametersOut", null);
        setField(term1988, term1988.getClass(), "codeResponse", null);
        setField(term1988, term1988.getClass(), "timeConsumeService", null);
        setField(term1988, term1988.getClass(), "timeResponseService", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParametersOut", argTypes, term1988, args);
    }

};


