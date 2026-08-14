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

public class UserTokenResponse_UserTokenResponseBuilder_operatingSystem_118647358816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1478;

    public UserTokenResponse_UserTokenResponseBuilder_operatingSystem_118647358816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1478 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse$UserTokenResponseBuilder"));
        setField(term1478, term1478.getClass(), "id", null);
        setField(term1478, term1478.getClass(), "expiryDate", null);
        setField(term1478, term1478.getClass(), "token", null);
        setField(term1478, term1478.getClass(), "browser", null);
        setField(term1478, term1478.getClass(), "operatingSystem", null);
        setField(term1478, term1478.getClass(), "ipAddress", null);
        setField(term1478, term1478.getClass(), "createdAt", null);
        setField(term1478, term1478.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse$UserTokenResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "operatingSystem", argTypes, term1478, args);
    }

};


