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

public class LoggerDto_setTimeResponseService_112605761517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1690;

    public LoggerDto_setTimeResponseService_112605761517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1727 = new HashMap();
        Integer term1738 = new Integer(1135664017);
        Long term1740 = new Long(7009926388951271268L);
        term1690 = newInstance(Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto"));
        Object term1737 = newInstance(Class.forName("java.lang.Object"));
        setField(term1690, term1690.getClass(), "method", "xIeFjkHkOe");
        setField(term1690, term1690.getClass(), "ip", "SdCKLMIYnX");
        setField(term1690, term1690.getClass(), "path", "OJJtVNPyKZ");
        setField(term1690, term1690.getClass(), "parametersIn", term1727);
        setField(term1690, term1690.getClass(), "parametersOut", term1737);
        setField(term1690, term1690.getClass(), "codeResponse", term1738);
        setField(term1690, term1690.getClass(), "timeConsumeService", term1740);
        setField(term1690, term1690.getClass(), "timeResponseService", "xJgPlLxpgC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EYtfuJaxiM";
        callMethod(klass, "setTimeResponseService", argTypes, term1690, args);
    }

};


