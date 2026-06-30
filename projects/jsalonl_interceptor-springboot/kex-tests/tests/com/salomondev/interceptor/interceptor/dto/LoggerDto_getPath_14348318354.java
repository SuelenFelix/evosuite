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

public class LoggerDto_getPath_14348318354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209;

    public LoggerDto_getPath_14348318354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term246 = new HashMap();
        Integer term257 = new Integer(-522618178);
        Long term259 = new Long(-8885298608300233488L);
        term209 = newInstance(Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto"));
        Object term256 = newInstance(Class.forName("java.lang.Object"));
        setField(term209, term209.getClass(), "method", "YRHGsAkhxb");
        setField(term209, term209.getClass(), "ip", "ffYhPOzlUs");
        setField(term209, term209.getClass(), "path", "MLqYREekMl");
        setField(term209, term209.getClass(), "parametersIn", term246);
        setField(term209, term209.getClass(), "parametersOut", term256);
        setField(term209, term209.getClass(), "codeResponse", term257);
        setField(term209, term209.getClass(), "timeConsumeService", term259);
        setField(term209, term209.getClass(), "timeResponseService", "nHXjMycHlU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPath", argTypes, term209, args);
    }

};


