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

public class TokenExpiredExceptionDetails_TokenExpiredExceptionDetailsBuilderImpl_self_6464006934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term774;

    public TokenExpiredExceptionDetails_TokenExpiredExceptionDetailsBuilderImpl_self_6464006934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term774 = newInstance(Class.forName("com.skyg0d.spring.jwt.exception.details.TokenExpiredExceptionDetails$TokenExpiredExceptionDetailsBuilderImpl"));
        setBooleanField(term774, term774.getClass(), "expired", false);
        setField(term774, term774.getClass(), "title", null);
        setField(term774, term774.getClass(), "details", null);
        setField(term774, term774.getClass(), "developerMessage", null);
        setIntField(term774, term774.getClass(), "status", 0);
        setField(term774, term774.getClass(), "timestamp", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.exception.details.TokenExpiredExceptionDetails$TokenExpiredExceptionDetailsBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "self", argTypes, term774, args);
    }

};


