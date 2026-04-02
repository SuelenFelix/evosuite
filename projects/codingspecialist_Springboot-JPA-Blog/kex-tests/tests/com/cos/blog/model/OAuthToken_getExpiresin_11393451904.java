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

public class OAuthToken_getExpiresin_11393451904 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274;

    public OAuthToken_getExpiresin_11393451904() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term274 = newInstance(Class.forName("com.cos.blog.model.OAuthToken"));
        setField(term274, term274.getClass(), "access_token", "MxlszYVzRf");
        setField(term274, term274.getClass(), "token_type", "LQFpaHEwXR");
        setField(term274, term274.getClass(), "refresh_token", "oVcInYnLWB");
        setIntField(term274, term274.getClass(), "expires_in", -1955890973);
        setField(term274, term274.getClass(), "scope", "aJlieCFVtF");
        setIntField(term274, term274.getClass(), "refresh_token_expires_in", -2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.OAuthToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExpires_in", argTypes, term274, args);
    }

};


