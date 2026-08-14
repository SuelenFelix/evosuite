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

public class ErrorMessage_getStatusCode_7032064136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243;

    public ErrorMessage_getStatusCode_7032064136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term243 = newInstance(Class.forName("com.sigma.auth.advice.ErrorMessage"));
        setIntField(term243, term243.getClass(), "statusCode", 0);
        setField(term243, term243.getClass(), "timestamp", null);
        setField(term243, term243.getClass(), "message", null);
        setField(term243, term243.getClass(), "description", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sigma.auth.advice.ErrorMessage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatusCode", argTypes, term243, args);
    }

};


