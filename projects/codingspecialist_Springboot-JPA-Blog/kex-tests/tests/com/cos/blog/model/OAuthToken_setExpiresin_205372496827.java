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
import java.lang.Integer;

public class OAuthToken_setExpiresin_205372496827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1578;
     Object term1581;

    public OAuthToken_setExpiresin_205372496827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1578 = newInstance(Class.forName("com.cos.blog.model.OAuthToken"));
        setField(term1578, term1578.getClass(), "access_token", null);
        setField(term1578, term1578.getClass(), "token_type", null);
        setField(term1578, term1578.getClass(), "refresh_token", null);
        setIntField(term1578, term1578.getClass(), "expires_in", 0);
        setField(term1578, term1578.getClass(), "scope", null);
        setIntField(term1578, term1578.getClass(), "refresh_token_expires_in", 0);
        term1581 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.OAuthToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1581;
        callMethod(klass, "setExpires_in", argTypes, term1578, args);
    }

};


