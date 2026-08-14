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

public class ValidationExceptionDetails_ValidationExceptionDetailsBuilderImpl_build_2139618542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term976;

    public ValidationExceptionDetails_ValidationExceptionDetailsBuilderImpl_build_2139618542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term977 = new HashMap();
        term976 = newInstance(Class.forName("com.skyg0d.spring.jwt.exception.details.ValidationExceptionDetails$ValidationExceptionDetailsBuilderImpl"));
        setField(term976, term976.getClass(), "fieldErrors", term977);
        setField(term976, term976.getClass(), "title", "TJmVBGfTML");
        setField(term976, term976.getClass(), "details", "tPlsykYBqO");
        setField(term976, term976.getClass(), "developerMessage", "bLPjGVBhlX");
        setIntField(term976, term976.getClass(), "status", -1339778481);
        setField(term976, term976.getClass(), "timestamp", "whBvTVIIlC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.exception.details.ValidationExceptionDetails$ValidationExceptionDetailsBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term976, args);
    }

};


