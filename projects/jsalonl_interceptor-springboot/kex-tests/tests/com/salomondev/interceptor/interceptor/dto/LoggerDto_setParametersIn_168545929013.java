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

public class LoggerDto_setParametersIn_168545929013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1211;
     Object term1275;

    public LoggerDto_setParametersIn_168545929013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1248 = new HashMap();
        Integer term1259 = new Integer(-655067527);
        Long term1261 = new Long(8428634514691209827L);
        term1211 = newInstance(Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto"));
        Object term1258 = newInstance(Class.forName("java.lang.Object"));
        setField(term1211, term1211.getClass(), "method", "vjxIhXHxGR");
        setField(term1211, term1211.getClass(), "ip", "QXzGXbEXMu");
        setField(term1211, term1211.getClass(), "path", "qxSDVejjiY");
        setField(term1211, term1211.getClass(), "parametersIn", term1248);
        setField(term1211, term1211.getClass(), "parametersOut", term1258);
        setField(term1211, term1211.getClass(), "codeResponse", term1259);
        setField(term1211, term1211.getClass(), "timeConsumeService", term1261);
        setField(term1211, term1211.getClass(), "timeResponseService", "sEnIVFtZuQ");
        term1275 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term1275;
        callMethod(klass, "setParametersIn", argTypes, term1211, args);
    }

};


