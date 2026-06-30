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

public class LoggerDto_setIp_35837150911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term959;

    public LoggerDto_setIp_35837150911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term996 = new HashMap();
        Integer term1007 = new Integer(1622346318);
        Long term1009 = new Long(-6573104506744284592L);
        term959 = newInstance(Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto"));
        Object term1006 = newInstance(Class.forName("java.lang.Object"));
        setField(term959, term959.getClass(), "method", "xOcJIiQQDu");
        setField(term959, term959.getClass(), "ip", "GVizqqzXpy");
        setField(term959, term959.getClass(), "path", "JqXGgAhZPl");
        setField(term959, term959.getClass(), "parametersIn", term996);
        setField(term959, term959.getClass(), "parametersOut", term1006);
        setField(term959, term959.getClass(), "codeResponse", term1007);
        setField(term959, term959.getClass(), "timeConsumeService", term1009);
        setField(term959, term959.getClass(), "timeResponseService", "DfISiziTgG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XqgfKFvPSD";
        callMethod(klass, "setIp", argTypes, term959, args);
    }

};


