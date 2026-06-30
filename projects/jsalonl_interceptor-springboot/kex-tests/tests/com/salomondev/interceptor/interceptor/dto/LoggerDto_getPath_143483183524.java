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

public class LoggerDto_getPath_143483183524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1986;

    public LoggerDto_getPath_143483183524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1986 = newInstance(Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto"));
        setField(term1986, term1986.getClass(), "method", null);
        setField(term1986, term1986.getClass(), "ip", null);
        setField(term1986, term1986.getClass(), "path", null);
        setField(term1986, term1986.getClass(), "parametersIn", null);
        setField(term1986, term1986.getClass(), "parametersOut", null);
        setField(term1986, term1986.getClass(), "codeResponse", null);
        setField(term1986, term1986.getClass(), "timeConsumeService", null);
        setField(term1986, term1986.getClass(), "timeResponseService", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPath", argTypes, term1986, args);
    }

};


