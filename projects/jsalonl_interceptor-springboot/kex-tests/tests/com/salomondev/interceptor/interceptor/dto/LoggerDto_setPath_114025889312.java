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

public class LoggerDto_setPath_114025889312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1085;

    public LoggerDto_setPath_114025889312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1122 = new HashMap();
        Integer term1133 = new Integer(1048535127);
        Long term1135 = new Long(-4920224193275732920L);
        term1085 = newInstance(Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto"));
        Object term1132 = newInstance(Class.forName("java.lang.Object"));
        setField(term1085, term1085.getClass(), "method", "JiVRgTZvKc");
        setField(term1085, term1085.getClass(), "ip", "XPKmummaqg");
        setField(term1085, term1085.getClass(), "path", "BKLfkLiZTH");
        setField(term1085, term1085.getClass(), "parametersIn", term1122);
        setField(term1085, term1085.getClass(), "parametersOut", term1132);
        setField(term1085, term1085.getClass(), "codeResponse", term1133);
        setField(term1085, term1085.getClass(), "timeConsumeService", term1135);
        setField(term1085, term1085.getClass(), "timeResponseService", "sEccwbJKYE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AWRooQKkdW";
        callMethod(klass, "setPath", argTypes, term1085, args);
    }

};


