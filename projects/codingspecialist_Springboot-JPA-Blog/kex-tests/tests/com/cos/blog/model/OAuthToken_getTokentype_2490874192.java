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

public class OAuthToken_getTokentype_2490874192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92;

    public OAuthToken_getTokentype_2490874192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92 = newInstance(Class.forName("com.cos.blog.model.OAuthToken"));
        setField(term92, term92.getClass(), "access_token", "jJCZpVmanW");
        setField(term92, term92.getClass(), "token_type", "EGtDIRbSSb");
        setField(term92, term92.getClass(), "refresh_token", "SzjVpOQTyS");
        setIntField(term92, term92.getClass(), "expires_in", 1484323161);
        setField(term92, term92.getClass(), "scope", "MjGYSRKTNF");
        setIntField(term92, term92.getClass(), "refresh_token_expires_in", 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.OAuthToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getToken_type", argTypes, term92, args);
    }

};


