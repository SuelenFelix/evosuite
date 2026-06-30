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

public class LoggerDto_getTimeConsumeService_5211554958 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term625;

    public LoggerDto_getTimeConsumeService_5211554958() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term662 = new HashMap();
        Integer term673 = new Integer(597278769);
        Long term675 = new Long(-872011222785455006L);
        term625 = newInstance(Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto"));
        Object term672 = newInstance(Class.forName("java.lang.Object"));
        setField(term625, term625.getClass(), "method", "MAcUBcBckh");
        setField(term625, term625.getClass(), "ip", "oVgzLbrsFr");
        setField(term625, term625.getClass(), "path", "vQVyKLdtaz");
        setField(term625, term625.getClass(), "parametersIn", term662);
        setField(term625, term625.getClass(), "parametersOut", term672);
        setField(term625, term625.getClass(), "codeResponse", term673);
        setField(term625, term625.getClass(), "timeConsumeService", term675);
        setField(term625, term625.getClass(), "timeResponseService", "wGmYcqUkgE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimeConsumeService", argTypes, term625, args);
    }

};


