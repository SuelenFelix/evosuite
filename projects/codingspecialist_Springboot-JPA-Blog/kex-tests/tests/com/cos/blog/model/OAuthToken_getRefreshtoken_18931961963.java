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

public class OAuthToken_getRefreshtoken_18931961963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183;

    public OAuthToken_getRefreshtoken_18931961963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term183 = newInstance(Class.forName("com.cos.blog.model.OAuthToken"));
        setField(term183, term183.getClass(), "access_token", "hRNSzYYIrc");
        setField(term183, term183.getClass(), "token_type", "RMFIsYGgne");
        setField(term183, term183.getClass(), "refresh_token", "NRdvgJlhkX");
        setIntField(term183, term183.getClass(), "expires_in", -1922583790);
        setField(term183, term183.getClass(), "scope", "uuaPigETmJ");
        setIntField(term183, term183.getClass(), "refresh_token_expires_in", -616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.OAuthToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRefresh_token", argTypes, term183, args);
    }

};


