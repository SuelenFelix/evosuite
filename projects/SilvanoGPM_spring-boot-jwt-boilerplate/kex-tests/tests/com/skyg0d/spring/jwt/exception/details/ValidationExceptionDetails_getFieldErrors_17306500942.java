package com.skyg0d.spring.jwt.exception.details;

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
import static com.skyg0d.spring.jwt.exception.details.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;

public class ValidationExceptionDetails_getFieldErrors_17306500942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277;

    public ValidationExceptionDetails_getFieldErrors_17306500942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term278 = new HashMap();
        term277 = newInstance(Class.forName("com.skyg0d.spring.jwt.exception.details.ValidationExceptionDetails"));
        setField(term277, term277.getClass(), "fieldErrors", term278);
        setField(term277, term277.getClass(), "title", "MxlszYVzRf");
        setField(term277, term277.getClass(), "details", "LQFpaHEwXR");
        setField(term277, term277.getClass(), "developerMessage", "oVcInYnLWB");
        setIntField(term277, term277.getClass(), "status", 391863371);
        setField(term277, term277.getClass(), "timestamp", "aJlieCFVtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.exception.details.ValidationExceptionDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFieldErrors", argTypes, term277, args);
    }

};


