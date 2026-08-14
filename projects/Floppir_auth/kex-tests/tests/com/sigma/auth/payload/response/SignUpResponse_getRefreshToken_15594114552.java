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

public class SignUpResponse_getRefreshToken_15594114552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term454;

    public SignUpResponse_getRefreshToken_15594114552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term454 = newInstance(Class.forName("com.sigma.auth.payload.response.SignUpResponse"));
        setField(term454, term454.getClass(), "accessToken", "hNxWaHcfhY");
        setField(term454, term454.getClass(), "refreshToken", "RkybSrpybU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sigma.auth.payload.response.SignUpResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRefreshToken", argTypes, term454, args);
    }

};


