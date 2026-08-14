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

public class ValidationExceptionDetails_ValidationExceptionDetailsBuilderImpl_self_18923236594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1071;

    public ValidationExceptionDetails_ValidationExceptionDetailsBuilderImpl_self_18923236594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1071 = newInstance(Class.forName("com.skyg0d.spring.jwt.exception.details.ValidationExceptionDetails$ValidationExceptionDetailsBuilderImpl"));
        setField(term1071, term1071.getClass(), "fieldErrors", null);
        setField(term1071, term1071.getClass(), "title", null);
        setField(term1071, term1071.getClass(), "details", null);
        setField(term1071, term1071.getClass(), "developerMessage", null);
        setIntField(term1071, term1071.getClass(), "status", 0);
        setField(term1071, term1071.getClass(), "timestamp", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.exception.details.ValidationExceptionDetails$ValidationExceptionDetailsBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "self", argTypes, term1071, args);
    }

};


