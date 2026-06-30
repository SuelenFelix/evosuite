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

public class LoggerDto_setCodeResponse_79453095315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1478;
     Object term1542;

    public LoggerDto_setCodeResponse_79453095315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1515 = new HashMap();
        Integer term1526 = new Integer(-2068769794);
        Long term1528 = new Long(8059786003080744426L);
        term1478 = newInstance(Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto"));
        Object term1525 = newInstance(Class.forName("java.lang.Object"));
        setField(term1478, term1478.getClass(), "method", "pORebkoRdD");
        setField(term1478, term1478.getClass(), "ip", "mXGCWJDOqA");
        setField(term1478, term1478.getClass(), "path", "dpNsDgfPso");
        setField(term1478, term1478.getClass(), "parametersIn", term1515);
        setField(term1478, term1478.getClass(), "parametersOut", term1525);
        setField(term1478, term1478.getClass(), "codeResponse", term1526);
        setField(term1478, term1478.getClass(), "timeConsumeService", term1528);
        setField(term1478, term1478.getClass(), "timeResponseService", "WzMEhMXkKx");
        term1542 = new Integer(-117576464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1542;
        callMethod(klass, "setCodeResponse", argTypes, term1478, args);
    }

};


