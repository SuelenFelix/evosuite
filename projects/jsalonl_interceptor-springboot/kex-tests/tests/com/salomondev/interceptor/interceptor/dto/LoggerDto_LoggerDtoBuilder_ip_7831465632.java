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

public class LoggerDto_LoggerDtoBuilder_ip_7831465632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2126;

    public LoggerDto_LoggerDtoBuilder_ip_7831465632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2163 = new HashMap();
        Integer term2174 = new Integer(-1275173084);
        Long term2176 = new Long(1967728129628047933L);
        term2126 = newInstance(Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto$LoggerDtoBuilder"));
        Object term2173 = newInstance(Class.forName("java.lang.Object"));
        setField(term2126, term2126.getClass(), "method", "jwsfVjMoJT");
        setField(term2126, term2126.getClass(), "ip", "ZfdXfCCFDf");
        setField(term2126, term2126.getClass(), "path", "MwwjNtdOFT");
        setField(term2126, term2126.getClass(), "parametersIn", term2163);
        setField(term2126, term2126.getClass(), "parametersOut", term2173);
        setField(term2126, term2126.getClass(), "codeResponse", term2174);
        setField(term2126, term2126.getClass(), "timeConsumeService", term2176);
        setField(term2126, term2126.getClass(), "timeResponseService", "XkIoWJRNwN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto$LoggerDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aNWLJdrZMq";
        callMethod(klass, "ip", argTypes, term2126, args);
    }

};


