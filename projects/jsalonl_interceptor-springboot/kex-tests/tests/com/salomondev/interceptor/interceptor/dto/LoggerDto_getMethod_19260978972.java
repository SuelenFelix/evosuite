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

public class LoggerDto_getMethod_19260978972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public LoggerDto_getMethod_19260978972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term38 = new HashMap();
        Integer term49 = new Integer(568599855);
        Long term51 = new Long(2442117782898005296L);
        term1 = newInstance(Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto"));
        Object term48 = newInstance(Class.forName("java.lang.Object"));
        setField(term1, term1.getClass(), "method", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "ip", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "path", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "parametersIn", term38);
        setField(term1, term1.getClass(), "parametersOut", term48);
        setField(term1, term1.getClass(), "codeResponse", term49);
        setField(term1, term1.getClass(), "timeConsumeService", term51);
        setField(term1, term1.getClass(), "timeResponseService", "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMethod", argTypes, term1, args);
    }

};


