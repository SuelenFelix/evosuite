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
import java.util.LinkedHashMap;

public class LoggerDto_LoggerDtoBuilder_parametersIn_19529376524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2378;
     Object term2442;

    public LoggerDto_LoggerDtoBuilder_parametersIn_19529376524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2415 = new HashMap();
        Integer term2426 = new Integer(-203030934);
        Long term2428 = new Long(6855071767938501807L);
        term2378 = newInstance(Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto$LoggerDtoBuilder"));
        Object term2425 = newInstance(Class.forName("java.lang.Object"));
        setField(term2378, term2378.getClass(), "method", "BRIVNtfUWU");
        setField(term2378, term2378.getClass(), "ip", "DbiCVtPPCT");
        setField(term2378, term2378.getClass(), "path", "WzFopsaDuG");
        setField(term2378, term2378.getClass(), "parametersIn", term2415);
        setField(term2378, term2378.getClass(), "parametersOut", term2425);
        setField(term2378, term2378.getClass(), "codeResponse", term2426);
        setField(term2378, term2378.getClass(), "timeConsumeService", term2428);
        setField(term2378, term2378.getClass(), "timeResponseService", "smnHEqRFRx");
        term2442 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto$LoggerDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term2442;
        callMethod(klass, "parametersIn", argTypes, term2378, args);
    }

};


