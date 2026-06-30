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

public class LoggerDto_LoggerDtoBuilder_parametersOut_19807177105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2504;
     Object term2568;

    public LoggerDto_LoggerDtoBuilder_parametersOut_19807177105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2541 = new HashMap();
        Integer term2552 = new Integer(-1179120542);
        Long term2554 = new Long(-5892135042702373494L);
        term2504 = newInstance(Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto$LoggerDtoBuilder"));
        Object term2551 = newInstance(Class.forName("java.lang.Object"));
        setField(term2504, term2504.getClass(), "method", "OYbzXylRWW");
        setField(term2504, term2504.getClass(), "ip", "DSNsTGYXDF");
        setField(term2504, term2504.getClass(), "path", "sQvGcVjdEx");
        setField(term2504, term2504.getClass(), "parametersIn", term2541);
        setField(term2504, term2504.getClass(), "parametersOut", term2551);
        setField(term2504, term2504.getClass(), "codeResponse", term2552);
        setField(term2504, term2504.getClass(), "timeConsumeService", term2554);
        setField(term2504, term2504.getClass(), "timeResponseService", "zUlRdimJtU");
        term2568 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto$LoggerDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2568;
        callMethod(klass, "parametersOut", argTypes, term2504, args);
    }

};


