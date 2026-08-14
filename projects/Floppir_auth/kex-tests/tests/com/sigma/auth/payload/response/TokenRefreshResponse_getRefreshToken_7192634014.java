package com.sigma.auth.payload.response;

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
import static com.sigma.auth.payload.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TokenRefreshResponse_getRefreshToken_7192634014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316;

    public TokenRefreshResponse_getRefreshToken_7192634014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term316 = newInstance(Class.forName("com.sigma.auth.payload.response.TokenRefreshResponse"));
        setField(term316, term316.getClass(), "accessToken", "oVcInYnLWB");
        setField(term316, term316.getClass(), "refreshToken", "aJlieCFVtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sigma.auth.payload.response.TokenRefreshResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRefreshToken", argTypes, term316, args);
    }

};


