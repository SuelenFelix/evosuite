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

public class OAuthToken_getRefreshtoken_189319619620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1557;

    public OAuthToken_getRefreshtoken_189319619620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1557 = newInstance(Class.forName("com.cos.blog.model.OAuthToken"));
        setField(term1557, term1557.getClass(), "access_token", null);
        setField(term1557, term1557.getClass(), "token_type", null);
        setField(term1557, term1557.getClass(), "refresh_token", null);
        setIntField(term1557, term1557.getClass(), "expires_in", 0);
        setField(term1557, term1557.getClass(), "scope", null);
        setIntField(term1557, term1557.getClass(), "refresh_token_expires_in", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.OAuthToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRefresh_token", argTypes, term1557, args);
    }

};


