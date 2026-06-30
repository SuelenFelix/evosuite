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

public class LoggerDto_LoggerDtoBuilder_timeConsumeService_18163636717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2715;
     Object term2779;

    public LoggerDto_LoggerDtoBuilder_timeConsumeService_18163636717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2752 = new HashMap();
        Integer term2763 = new Integer(1193880199);
        Long term2765 = new Long(-6823727938421990489L);
        term2715 = newInstance(Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto$LoggerDtoBuilder"));
        Object term2762 = newInstance(Class.forName("java.lang.Object"));
        setField(term2715, term2715.getClass(), "method", "jXzmYyrnnT");
        setField(term2715, term2715.getClass(), "ip", "igCAtimmYB");
        setField(term2715, term2715.getClass(), "path", "DyiXbeYIaN");
        setField(term2715, term2715.getClass(), "parametersIn", term2752);
        setField(term2715, term2715.getClass(), "parametersOut", term2762);
        setField(term2715, term2715.getClass(), "codeResponse", term2763);
        setField(term2715, term2715.getClass(), "timeConsumeService", term2765);
        setField(term2715, term2715.getClass(), "timeResponseService", "kVEZMHmRtR");
        term2779 = new Long(-484994522244390100L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto$LoggerDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term2779;
        callMethod(klass, "timeConsumeService", argTypes, term2715, args);
    }

};


