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

public class ExceptionDetails_ExceptionDetailsBuilderImpl_build_3279538652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91;

    public ExceptionDetails_ExceptionDetailsBuilderImpl_build_3279538652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91 = newInstance(Class.forName("com.skyg0d.spring.jwt.exception.details.ExceptionDetails$ExceptionDetailsBuilderImpl"));
        setField(term91, term91.getClass(), "title", "jJCZpVmanW");
        setField(term91, term91.getClass(), "details", "EGtDIRbSSb");
        setField(term91, term91.getClass(), "developerMessage", "SzjVpOQTyS");
        setIntField(term91, term91.getClass(), "status", 1162663216);
        setField(term91, term91.getClass(), "timestamp", "MjGYSRKTNF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.exception.details.ExceptionDetails$ExceptionDetailsBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term91, args);
    }

};


