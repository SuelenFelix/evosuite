package com.skyg0d.spring.jwt.payload.response;

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
import static com.skyg0d.spring.jwt.payload.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TokenRefreshResponse_TokenRefreshResponseBuilder_tokenType_14838974579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2424;

    public TokenRefreshResponse_TokenRefreshResponseBuilder_tokenType_14838974579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2424 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.TokenRefreshResponse$TokenRefreshResponseBuilder"));
        setField(term2424, term2424.getClass(), "accessToken", null);
        setField(term2424, term2424.getClass(), "refreshToken", null);
        setField(term2424, term2424.getClass(), "tokenType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.TokenRefreshResponse$TokenRefreshResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "tokenType", argTypes, term2424, args);
    }

};


