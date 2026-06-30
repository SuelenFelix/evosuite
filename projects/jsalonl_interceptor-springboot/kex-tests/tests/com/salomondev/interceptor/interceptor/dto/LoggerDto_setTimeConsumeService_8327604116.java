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

public class LoggerDto_setTimeConsumeService_8327604116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1584;
     Object term1648;

    public LoggerDto_setTimeConsumeService_8327604116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1621 = new HashMap();
        Integer term1632 = new Integer(-1007160944);
        Long term1634 = new Long(-4365849114644724155L);
        term1584 = newInstance(Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto"));
        Object term1631 = newInstance(Class.forName("java.lang.Object"));
        setField(term1584, term1584.getClass(), "method", "XOiDvlDhdc");
        setField(term1584, term1584.getClass(), "ip", "AdxvLJhNLe");
        setField(term1584, term1584.getClass(), "path", "lHfTrWKMPk");
        setField(term1584, term1584.getClass(), "parametersIn", term1621);
        setField(term1584, term1584.getClass(), "parametersOut", term1631);
        setField(term1584, term1584.getClass(), "codeResponse", term1632);
        setField(term1584, term1584.getClass(), "timeConsumeService", term1634);
        setField(term1584, term1584.getClass(), "timeResponseService", "mLUZFTfjle");
        term1648 = new Long(2486810210675247493L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1648;
        callMethod(klass, "setTimeConsumeService", argTypes, term1584, args);
    }

};


