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

public class LoggerDto_getCodeResponse_11844256097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term521;

    public LoggerDto_getCodeResponse_11844256097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term558 = new HashMap();
        Integer term569 = new Integer(1585847225);
        Long term571 = new Long(-5476826692763582090L);
        term521 = newInstance(Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto"));
        Object term568 = newInstance(Class.forName("java.lang.Object"));
        setField(term521, term521.getClass(), "method", "whBvTVIIlC");
        setField(term521, term521.getClass(), "ip", "IgRJUzaCwW");
        setField(term521, term521.getClass(), "path", "JUmudUmaaV");
        setField(term521, term521.getClass(), "parametersIn", term558);
        setField(term521, term521.getClass(), "parametersOut", term568);
        setField(term521, term521.getClass(), "codeResponse", term569);
        setField(term521, term521.getClass(), "timeConsumeService", term571);
        setField(term521, term521.getClass(), "timeResponseService", "HqBOwkVqjD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCodeResponse", argTypes, term521, args);
    }

};


