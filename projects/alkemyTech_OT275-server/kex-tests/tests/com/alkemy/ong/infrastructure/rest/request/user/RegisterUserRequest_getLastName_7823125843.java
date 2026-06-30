package com.alkemy.ong.infrastructure.rest.request.user;

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
import static com.alkemy.ong.infrastructure.rest.request.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RegisterUserRequest_getLastName_7823125843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1258;

    public RegisterUserRequest_getLastName_7823125843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1258 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.user.RegisterUserRequest"));
        setField(term1258, term1258.getClass(), "firstName", "ffYhPOzlUs");
        setField(term1258, term1258.getClass(), "lastName", "MLqYREekMl");
        setField(term1258, term1258.getClass(), "email", "ytSBIKXogI");
        setField(term1258, term1258.getClass(), "password", "nHXjMycHlU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.user.RegisterUserRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term1258, args);
    }

};


