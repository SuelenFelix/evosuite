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

public class LoggerDto_getIp_6587355813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105;

    public LoggerDto_getIp_6587355813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term142 = new HashMap();
        Integer term153 = new Integer(1725571209);
        Long term155 = new Long(-2813493605142626659L);
        term105 = newInstance(Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto"));
        Object term152 = newInstance(Class.forName("java.lang.Object"));
        setField(term105, term105.getClass(), "method", "nGKItKLYNC");
        setField(term105, term105.getClass(), "ip", "UiUYnPrcCi");
        setField(term105, term105.getClass(), "path", "UoYtihxVaS");
        setField(term105, term105.getClass(), "parametersIn", term142);
        setField(term105, term105.getClass(), "parametersOut", term152);
        setField(term105, term105.getClass(), "codeResponse", term153);
        setField(term105, term105.getClass(), "timeConsumeService", term155);
        setField(term105, term105.getClass(), "timeResponseService", "onpbIeEKoi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIp", argTypes, term105, args);
    }

};


