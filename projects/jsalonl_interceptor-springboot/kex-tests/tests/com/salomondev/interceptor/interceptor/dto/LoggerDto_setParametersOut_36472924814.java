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

public class LoggerDto_setParametersOut_36472924814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1373;
     Object term1437;

    public LoggerDto_setParametersOut_36472924814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1410 = new HashMap();
        Integer term1421 = new Integer(-6029667);
        Long term1423 = new Long(-2585684163342970173L);
        term1373 = newInstance(Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto"));
        Object term1420 = newInstance(Class.forName("java.lang.Object"));
        setField(term1373, term1373.getClass(), "method", "RYdKCNNMBR");
        setField(term1373, term1373.getClass(), "ip", "yGtHPyvYiQ");
        setField(term1373, term1373.getClass(), "path", "MvRIxilFMJ");
        setField(term1373, term1373.getClass(), "parametersIn", term1410);
        setField(term1373, term1373.getClass(), "parametersOut", term1420);
        setField(term1373, term1373.getClass(), "codeResponse", term1421);
        setField(term1373, term1373.getClass(), "timeConsumeService", term1423);
        setField(term1373, term1373.getClass(), "timeResponseService", "XylxrMBraH");
        term1437 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1437;
        callMethod(klass, "setParametersOut", argTypes, term1373, args);
    }

};


