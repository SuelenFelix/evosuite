package com.sigma.auth.advice;

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
import static com.sigma.auth.advice.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ErrorMessage_getMessage_17922952183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145;

    public ErrorMessage_getMessage_17922952183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145 = newInstance(Class.forName("com.sigma.auth.advice.ErrorMessage"));
        Object term147 = newInstance(Class.forName("java.util.Date"));
        setIntField(term145, term145.getClass(), "statusCode", 391863371);
        setLongField(term147, term147.getClass(), "fastTime", 1606045635837L);
        setField(term147, term147.getClass(), "cdate", null);
        setField(term145, term145.getClass(), "timestamp", term147);
        setField(term145, term145.getClass(), "message", "SzjVpOQTyS");
        setField(term145, term145.getClass(), "description", "MjGYSRKTNF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sigma.auth.advice.ErrorMessage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMessage", argTypes, term145, args);
    }

};


