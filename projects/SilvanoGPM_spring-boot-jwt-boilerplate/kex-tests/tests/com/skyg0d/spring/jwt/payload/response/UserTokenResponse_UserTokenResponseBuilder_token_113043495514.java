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

public class UserTokenResponse_UserTokenResponseBuilder_token_113043495514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1476;

    public UserTokenResponse_UserTokenResponseBuilder_token_113043495514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1476 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse$UserTokenResponseBuilder"));
        setField(term1476, term1476.getClass(), "id", null);
        setField(term1476, term1476.getClass(), "expiryDate", null);
        setField(term1476, term1476.getClass(), "token", null);
        setField(term1476, term1476.getClass(), "browser", null);
        setField(term1476, term1476.getClass(), "operatingSystem", null);
        setField(term1476, term1476.getClass(), "ipAddress", null);
        setField(term1476, term1476.getClass(), "createdAt", null);
        setField(term1476, term1476.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse$UserTokenResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "token", argTypes, term1476, args);
    }

};


