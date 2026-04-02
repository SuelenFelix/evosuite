package com.cos.blog.model;

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
import static com.cos.blog.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class OAuthToken_equals_170248440213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1185;
     Object term1236;

    public OAuthToken_equals_170248440213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1185 = newInstance(Class.forName("com.cos.blog.model.OAuthToken"));
        setField(term1185, term1185.getClass(), "access_token", "UoYtihxVaS");
        setField(term1185, term1185.getClass(), "token_type", "JDswTTCZHV");
        setField(term1185, term1185.getClass(), "refresh_token", "onpbIeEKoi");
        setIntField(term1185, term1185.getClass(), "expires_in", 590364439);
        setField(term1185, term1185.getClass(), "scope", "YRHGsAkhxb");
        setIntField(term1185, term1185.getClass(), "refresh_token_expires_in", 865208305);
        term1236 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.OAuthToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1236;
        callMethod(klass, "equals", argTypes, term1185, args);
    }

};


