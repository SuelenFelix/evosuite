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

public class LoggerDto_getParametersIn_4850073245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313;

    public LoggerDto_getParametersIn_4850073245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term350 = new HashMap();
        Integer term361 = new Integer(1134449235);
        Long term363 = new Long(-4325723315152823407L);
        term313 = newInstance(Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto"));
        Object term360 = newInstance(Class.forName("java.lang.Object"));
        setField(term313, term313.getClass(), "method", "ieCtQFdkii");
        setField(term313, term313.getClass(), "ip", "dEnhdmILtU");
        setField(term313, term313.getClass(), "path", "hoicvmsovO");
        setField(term313, term313.getClass(), "parametersIn", term350);
        setField(term313, term313.getClass(), "parametersOut", term360);
        setField(term313, term313.getClass(), "codeResponse", term361);
        setField(term313, term313.getClass(), "timeConsumeService", term363);
        setField(term313, term313.getClass(), "timeResponseService", "fhkbdRViHi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParametersIn", argTypes, term313, args);
    }

};


