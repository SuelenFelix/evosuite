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

public class LoggerDto_LoggerDtoBuilder_timeResponseService_18884161958 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2821;

    public LoggerDto_LoggerDtoBuilder_timeResponseService_18884161958() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2858 = new HashMap();
        Integer term2869 = new Integer(-1087774327);
        Long term2871 = new Long(1233889271256172047L);
        term2821 = newInstance(Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto$LoggerDtoBuilder"));
        Object term2868 = newInstance(Class.forName("java.lang.Object"));
        setField(term2821, term2821.getClass(), "method", "ekxGuOYIwi");
        setField(term2821, term2821.getClass(), "ip", "RbVQXSpxXy");
        setField(term2821, term2821.getClass(), "path", "YpJbIgJWWv");
        setField(term2821, term2821.getClass(), "parametersIn", term2858);
        setField(term2821, term2821.getClass(), "parametersOut", term2868);
        setField(term2821, term2821.getClass(), "codeResponse", term2869);
        setField(term2821, term2821.getClass(), "timeConsumeService", term2871);
        setField(term2821, term2821.getClass(), "timeResponseService", "iljANwuEjk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto$LoggerDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kNqaJKIATy";
        callMethod(klass, "timeResponseService", argTypes, term2821, args);
    }

};


