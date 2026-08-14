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

public class ValidationExceptionDetails_ValidationExceptionDetailsBuilderImpl_self_18923236591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term881;

    public ValidationExceptionDetails_ValidationExceptionDetailsBuilderImpl_self_18923236591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term882 = new HashMap();
        term881 = newInstance(Class.forName("com.skyg0d.spring.jwt.exception.details.ValidationExceptionDetails$ValidationExceptionDetailsBuilderImpl"));
        setField(term881, term881.getClass(), "fieldErrors", term882);
        setField(term881, term881.getClass(), "title", "eqJfYWRaEL");
        setField(term881, term881.getClass(), "details", "fhkbdRViHi");
        setField(term881, term881.getClass(), "developerMessage", "uWHnvSvaPl");
        setIntField(term881, term881.getClass(), "status", 1227103734);
        setField(term881, term881.getClass(), "timestamp", "kBdSllIBVz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.exception.details.ValidationExceptionDetails$ValidationExceptionDetailsBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "self", argTypes, term881, args);
    }

};


