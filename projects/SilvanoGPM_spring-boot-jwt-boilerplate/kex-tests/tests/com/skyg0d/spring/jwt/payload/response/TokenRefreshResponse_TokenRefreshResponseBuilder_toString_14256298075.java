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

public class TokenRefreshResponse_TokenRefreshResponseBuilder_toString_14256298075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2355;

    public TokenRefreshResponse_TokenRefreshResponseBuilder_toString_14256298075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2355 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.TokenRefreshResponse$TokenRefreshResponseBuilder"));
        setField(term2355, term2355.getClass(), "accessToken", "swZVeJAxjt");
        setField(term2355, term2355.getClass(), "refreshToken", "xOcJIiQQDu");
        setField(term2355, term2355.getClass(), "tokenType", "GVizqqzXpy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.TokenRefreshResponse$TokenRefreshResponseBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2355, args);
    }

};


