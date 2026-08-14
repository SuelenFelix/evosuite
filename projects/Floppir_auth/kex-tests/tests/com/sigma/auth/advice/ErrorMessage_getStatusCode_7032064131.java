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

public class ErrorMessage_getStatusCode_7032064131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49;

    public ErrorMessage_getStatusCode_7032064131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49 = newInstance(Class.forName("com.sigma.auth.advice.ErrorMessage"));
        Object term51 = newInstance(Class.forName("java.util.Date"));
        setIntField(term49, term49.getClass(), "statusCode", 1162663216);
        setLongField(term51, term51.getClass(), "fastTime", 1480438351369L);
        setField(term51, term51.getClass(), "cdate", null);
        setField(term49, term49.getClass(), "timestamp", term51);
        setField(term49, term49.getClass(), "message", "MuLcgQHgqz");
        setField(term49, term49.getClass(), "description", "xxtlPwDYFs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sigma.auth.advice.ErrorMessage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatusCode", argTypes, term49, args);
    }

};


