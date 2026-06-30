package com.lyubenblagoev.postfixrest.security;

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
import static com.lyubenblagoev.postfixrest.security.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RefreshTokenProvider_RefreshToken_getToken_12945209411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31;

    public RefreshTokenProvider_RefreshToken_getToken_12945209411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.security.RefreshTokenProvider$RefreshToken"));
        Object term44 = newInstance(Class.forName("java.util.Date"));
        setField(term31, term31.getClass(), "token", "sjlJAEtRrb");
        setLongField(term44, term44.getClass(), "fastTime", 1480438351369L);
        setField(term44, term44.getClass(), "cdate", null);
        setField(term31, term31.getClass(), "expirationDate", term44);
        setField(term31, term31.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.security.RefreshTokenProvider$RefreshToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getToken", argTypes, term31, args);
    }

};


