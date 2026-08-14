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

public class TokenExpiredExceptionDetails_TokenExpiredExceptionDetailsBuilderImpl_self_6464006931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term592;

    public TokenExpiredExceptionDetails_TokenExpiredExceptionDetailsBuilderImpl_self_6464006931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term592 = newInstance(Class.forName("com.skyg0d.spring.jwt.exception.details.TokenExpiredExceptionDetails$TokenExpiredExceptionDetailsBuilderImpl"));
        setBooleanField(term592, term592.getClass(), "expired", false);
        setField(term592, term592.getClass(), "title", "UiUYnPrcCi");
        setField(term592, term592.getClass(), "details", "UoYtihxVaS");
        setField(term592, term592.getClass(), "developerMessage", "JDswTTCZHV");
        setIntField(term592, term592.getClass(), "status", -616727354);
        setField(term592, term592.getClass(), "timestamp", "onpbIeEKoi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.exception.details.TokenExpiredExceptionDetails$TokenExpiredExceptionDetailsBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "self", argTypes, term592, args);
    }

};


