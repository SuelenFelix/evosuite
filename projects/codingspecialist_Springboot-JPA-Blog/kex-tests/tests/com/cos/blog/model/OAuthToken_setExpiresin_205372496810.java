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

public class OAuthToken_setExpiresin_205372496810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term886;
     Object term937;

    public OAuthToken_setExpiresin_205372496810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term886 = newInstance(Class.forName("com.cos.blog.model.OAuthToken"));
        setField(term886, term886.getClass(), "access_token", "aKnKipADSo");
        setField(term886, term886.getClass(), "token_type", "wSQxaModmm");
        setField(term886, term886.getClass(), "refresh_token", "UlajhuVLaP");
        setIntField(term886, term886.getClass(), "expires_in", 1622346318);
        setField(term886, term886.getClass(), "scope", "gGSMzuGICf");
        setIntField(term886, term886.getClass(), "refresh_token_expires_in", 1048535127);
        term937 = new Integer(-655067527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.OAuthToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term937;
        callMethod(klass, "setExpires_in", argTypes, term886, args);
    }

};


