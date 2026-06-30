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

public class LoggerDto_setMethod_8018408110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term833;

    public LoggerDto_setMethod_8018408110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term870 = new HashMap();
        Integer term881 = new Integer(-1456670397);
        Long term883 = new Long(5127676408959197577L);
        term833 = newInstance(Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto"));
        Object term880 = newInstance(Class.forName("java.lang.Object"));
        setField(term833, term833.getClass(), "method", "LvJFtLBaxj");
        setField(term833, term833.getClass(), "ip", "PHvxnGHptP");
        setField(term833, term833.getClass(), "path", "TimdotUuNC");
        setField(term833, term833.getClass(), "parametersIn", term870);
        setField(term833, term833.getClass(), "parametersOut", term880);
        setField(term833, term833.getClass(), "codeResponse", term881);
        setField(term833, term833.getClass(), "timeConsumeService", term883);
        setField(term833, term833.getClass(), "timeResponseService", "jSpAteRute");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.interceptor.dto.LoggerDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "swZVeJAxjt";
        callMethod(klass, "setMethod", argTypes, term833, args);
    }

};


