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

public class LoggerDto_LoggerDtoBuilder_toString_5797952410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3051;

    public LoggerDto_LoggerDtoBuilder_toString_5797952410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3088 = new HashMap();
        Integer term3099 = new Integer(-469968304);
        Long term3101 = new Long(1439298019805881866L);
        term3051 = newInstance(Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto$LoggerDtoBuilder"));
        Object term3098 = newInstance(Class.forName("java.lang.Object"));
        setField(term3051, term3051.getClass(), "method", "DhjNLmRMCu");
        setField(term3051, term3051.getClass(), "ip", "PgPzMSEjjX");
        setField(term3051, term3051.getClass(), "path", "wzsPSPcRdj");
        setField(term3051, term3051.getClass(), "parametersIn", term3088);
        setField(term3051, term3051.getClass(), "parametersOut", term3098);
        setField(term3051, term3051.getClass(), "codeResponse", term3099);
        setField(term3051, term3051.getClass(), "timeConsumeService", term3101);
        setField(term3051, term3051.getClass(), "timeResponseService", "XJJNClzHRf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto$LoggerDtoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3051, args);
    }

};


