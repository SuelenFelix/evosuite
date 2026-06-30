package com.salomondev.interceptor.exception.dto;

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
import static com.salomondev.interceptor.exception.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ErrorDto_ErrorDtoBuilder_toString_2919706809 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term365;

    public ErrorDto_ErrorDtoBuilder_toString_2919706809() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term365 = newInstance(Class.forName("com.salomondev.interceptor.exception.dto.ErrorDto$ErrorDtoBuilder"));
        setField(term365, term365.getClass(), "code", null);
        setField(term365, term365.getClass(), "message", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.exception.dto.ErrorDto$ErrorDtoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term365, args);
    }

};


