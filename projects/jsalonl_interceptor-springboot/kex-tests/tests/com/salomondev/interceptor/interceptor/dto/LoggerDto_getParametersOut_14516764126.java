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

public class LoggerDto_getParametersOut_14516764126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term417;

    public LoggerDto_getParametersOut_14516764126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term454 = new HashMap();
        Integer term465 = new Integer(-883034806);
        Long term467 = new Long(2535595959091595249L);
        term417 = newInstance(Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto"));
        Object term464 = newInstance(Class.forName("java.lang.Object"));
        setField(term417, term417.getClass(), "method", "uWHnvSvaPl");
        setField(term417, term417.getClass(), "ip", "kBdSllIBVz");
        setField(term417, term417.getClass(), "path", "TJmVBGfTML");
        setField(term417, term417.getClass(), "parametersIn", term454);
        setField(term417, term417.getClass(), "parametersOut", term464);
        setField(term417, term417.getClass(), "codeResponse", term465);
        setField(term417, term417.getClass(), "timeConsumeService", term467);
        setField(term417, term417.getClass(), "timeResponseService", "bLPjGVBhlX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParametersOut", argTypes, term417, args);
    }

};


