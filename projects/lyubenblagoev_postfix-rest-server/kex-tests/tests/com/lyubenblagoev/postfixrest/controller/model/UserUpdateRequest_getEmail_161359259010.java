package com.lyubenblagoev.postfixrest.controller.model;

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
import static com.lyubenblagoev.postfixrest.controller.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserUpdateRequest_getEmail_161359259010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term893;

    public UserUpdateRequest_getEmail_161359259010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term893 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.controller.model.UserUpdateRequest"));
        setField(term893, term893.getClass(), "email", null);
        setField(term893, term893.getClass(), "password", null);
        setField(term893, term893.getClass(), "passwordConfirmation", null);
        setField(term893, term893.getClass(), "oldPassword", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.controller.model.UserUpdateRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term893, args);
    }

};


