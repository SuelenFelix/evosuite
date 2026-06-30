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

public class RefreshTokenProvider_RefreshToken_getExpirationDate_9019808902 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56;

    public RefreshTokenProvider_RefreshToken_getExpirationDate_9019808902() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.security.RefreshTokenProvider$RefreshToken"));
        Object term69 = newInstance(Class.forName("java.util.Date"));
        setField(term56, term56.getClass(), "token", "MuLcgQHgqz");
        setLongField(term69, term69.getClass(), "fastTime", 1610940182830L);
        setField(term69, term69.getClass(), "cdate", null);
        setField(term56, term56.getClass(), "expirationDate", term69);
        setField(term56, term56.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.security.RefreshTokenProvider$RefreshToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExpirationDate", argTypes, term56, args);
    }

};


