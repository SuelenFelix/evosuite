package com.alkemy.ong.infrastructure.rest.response.user;

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
import static com.alkemy.ong.infrastructure.rest.response.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RegisterUserResponse_getLastName_8534926563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2888;

    public RegisterUserResponse_getLastName_8534926563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2888 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.user.RegisterUserResponse"));
        setField(term2888, term2888.getClass(), "firstName", "xIeFjkHkOe");
        setField(term2888, term2888.getClass(), "lastName", "SdCKLMIYnX");
        setField(term2888, term2888.getClass(), "email", "OJJtVNPyKZ");
        setField(term2888, term2888.getClass(), "token", "AKNapTAfmD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.user.RegisterUserResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term2888, args);
    }

};


