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

public class LoggerDto_getTimeResponseService_20384970739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term729;

    public LoggerDto_getTimeResponseService_20384970739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term766 = new HashMap();
        Integer term777 = new Integer(-1685132342);
        Long term779 = new Long(-316468845751588286L);
        term729 = newInstance(Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto"));
        Object term776 = newInstance(Class.forName("java.lang.Object"));
        setField(term729, term729.getClass(), "method", "idgaQsnJpQ");
        setField(term729, term729.getClass(), "ip", "VgZnGoIFwQ");
        setField(term729, term729.getClass(), "path", "jUbSRrkrYZ");
        setField(term729, term729.getClass(), "parametersIn", term766);
        setField(term729, term729.getClass(), "parametersOut", term776);
        setField(term729, term729.getClass(), "codeResponse", term777);
        setField(term729, term729.getClass(), "timeConsumeService", term779);
        setField(term729, term729.getClass(), "timeResponseService", "cAPeiZHKGJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimeResponseService", argTypes, term729, args);
    }

};


