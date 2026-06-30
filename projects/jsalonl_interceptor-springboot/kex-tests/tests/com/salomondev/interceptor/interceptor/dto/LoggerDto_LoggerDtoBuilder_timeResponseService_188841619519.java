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

public class LoggerDto_LoggerDtoBuilder_timeResponseService_188841619519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3162;

    public LoggerDto_LoggerDtoBuilder_timeResponseService_188841619519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3162 = newInstance(Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto$LoggerDtoBuilder"));
        setField(term3162, term3162.getClass(), "method", null);
        setField(term3162, term3162.getClass(), "ip", null);
        setField(term3162, term3162.getClass(), "path", null);
        setField(term3162, term3162.getClass(), "parametersIn", null);
        setField(term3162, term3162.getClass(), "parametersOut", null);
        setField(term3162, term3162.getClass(), "codeResponse", null);
        setField(term3162, term3162.getClass(), "timeConsumeService", null);
        setField(term3162, term3162.getClass(), "timeResponseService", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto$LoggerDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "timeResponseService", argTypes, term3162, args);
    }

};


