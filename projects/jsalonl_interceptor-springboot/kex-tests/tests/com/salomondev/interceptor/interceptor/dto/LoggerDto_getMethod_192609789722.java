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

public class LoggerDto_getMethod_192609789722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1984;

    public LoggerDto_getMethod_192609789722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1984 = newInstance(Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto"));
        setField(term1984, term1984.getClass(), "method", null);
        setField(term1984, term1984.getClass(), "ip", null);
        setField(term1984, term1984.getClass(), "path", null);
        setField(term1984, term1984.getClass(), "parametersIn", null);
        setField(term1984, term1984.getClass(), "parametersOut", null);
        setField(term1984, term1984.getClass(), "codeResponse", null);
        setField(term1984, term1984.getClass(), "timeConsumeService", null);
        setField(term1984, term1984.getClass(), "timeResponseService", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMethod", argTypes, term1984, args);
    }

};


