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

public class LoggerDto_LoggerDtoBuilder_codeResponse_14511013076 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2609;
     Object term2673;

    public LoggerDto_LoggerDtoBuilder_codeResponse_14511013076() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2646 = new HashMap();
        Integer term2657 = new Integer(-73683645);
        Long term2659 = new Long(5262507301787091109L);
        term2609 = newInstance(Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto$LoggerDtoBuilder"));
        Object term2656 = newInstance(Class.forName("java.lang.Object"));
        setField(term2609, term2609.getClass(), "method", "vwbEQQNQrx");
        setField(term2609, term2609.getClass(), "ip", "xtftXXMbem");
        setField(term2609, term2609.getClass(), "path", "cudZvLMQon");
        setField(term2609, term2609.getClass(), "parametersIn", term2646);
        setField(term2609, term2609.getClass(), "parametersOut", term2656);
        setField(term2609, term2609.getClass(), "codeResponse", term2657);
        setField(term2609, term2609.getClass(), "timeConsumeService", term2659);
        setField(term2609, term2609.getClass(), "timeResponseService", "JmcmxoGhIK");
        term2673 = new Integer(-226514366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto$LoggerDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term2673;
        callMethod(klass, "codeResponse", argTypes, term2609, args);
    }

};


