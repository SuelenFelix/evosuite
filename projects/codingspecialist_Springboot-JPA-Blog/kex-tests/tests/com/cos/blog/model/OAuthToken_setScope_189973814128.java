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

public class OAuthToken_setScope_189973814128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1583;

    public OAuthToken_setScope_189973814128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1583 = newInstance(Class.forName("com.cos.blog.model.OAuthToken"));
        setField(term1583, term1583.getClass(), "access_token", null);
        setField(term1583, term1583.getClass(), "token_type", null);
        setField(term1583, term1583.getClass(), "refresh_token", null);
        setIntField(term1583, term1583.getClass(), "expires_in", 0);
        setField(term1583, term1583.getClass(), "scope", null);
        setIntField(term1583, term1583.getClass(), "refresh_token_expires_in", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.OAuthToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setScope", argTypes, term1583, args);
    }

};


