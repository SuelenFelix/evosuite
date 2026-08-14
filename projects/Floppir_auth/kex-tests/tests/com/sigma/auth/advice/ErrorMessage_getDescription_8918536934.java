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

public class ErrorMessage_getDescription_8918536934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193;

    public ErrorMessage_getDescription_8918536934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term193 = newInstance(Class.forName("com.sigma.auth.advice.ErrorMessage"));
        Object term195 = newInstance(Class.forName("java.util.Date"));
        setIntField(term193, term193.getClass(), "statusCode", -1922583790);
        setLongField(term195, term195.getClass(), "fastTime", 1442639565302L);
        setField(term195, term195.getClass(), "cdate", null);
        setField(term193, term193.getClass(), "timestamp", term195);
        setField(term193, term193.getClass(), "message", "hRNSzYYIrc");
        setField(term193, term193.getClass(), "description", "RMFIsYGgne");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sigma.auth.advice.ErrorMessage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term193, args);
    }

};


