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

public class TokenExpiredExceptionDetails_TokenExpiredExceptionDetailsBuilderImpl_build_17267975252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term683;

    public TokenExpiredExceptionDetails_TokenExpiredExceptionDetailsBuilderImpl_build_17267975252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term683 = newInstance(Class.forName("com.skyg0d.spring.jwt.exception.details.TokenExpiredExceptionDetails$TokenExpiredExceptionDetailsBuilderImpl"));
        setBooleanField(term683, term683.getClass(), "expired", false);
        setField(term683, term683.getClass(), "title", "YRHGsAkhxb");
        setField(term683, term683.getClass(), "details", "ffYhPOzlUs");
        setField(term683, term683.getClass(), "developerMessage", "MLqYREekMl");
        setIntField(term683, term683.getClass(), "status", -1955890973);
        setField(term683, term683.getClass(), "timestamp", "ytSBIKXogI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.exception.details.TokenExpiredExceptionDetails$TokenExpiredExceptionDetailsBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term683, args);
    }

};


