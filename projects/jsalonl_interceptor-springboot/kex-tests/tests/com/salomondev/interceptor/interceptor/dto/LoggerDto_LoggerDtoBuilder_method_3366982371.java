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

public class LoggerDto_LoggerDtoBuilder_method_3366982371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2000;

    public LoggerDto_LoggerDtoBuilder_method_3366982371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2037 = new HashMap();
        Integer term2048 = new Integer(865208305);
        Long term2050 = new Long(-4502405999831680926L);
        term2000 = newInstance(Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto$LoggerDtoBuilder"));
        Object term2047 = newInstance(Class.forName("java.lang.Object"));
        setField(term2000, term2000.getClass(), "method", "GgZWSjxjyE");
        setField(term2000, term2000.getClass(), "ip", "EeBVbzjcCI");
        setField(term2000, term2000.getClass(), "path", "UfQtPRyWRC");
        setField(term2000, term2000.getClass(), "parametersIn", term2037);
        setField(term2000, term2000.getClass(), "parametersOut", term2047);
        setField(term2000, term2000.getClass(), "codeResponse", term2048);
        setField(term2000, term2000.getClass(), "timeConsumeService", term2050);
        setField(term2000, term2000.getClass(), "timeResponseService", "WHcwFgsGFC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto$LoggerDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HzqpegHiRq";
        callMethod(klass, "method", argTypes, term2000, args);
    }

};


