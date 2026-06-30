package com.lyubenblagoev.postfixrest.service.model;

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
import static com.lyubenblagoev.postfixrest.service.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserChangeRequest_getPassword_106266347918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3241;

    public UserChangeRequest_getPassword_106266347918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3241 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.UserChangeRequest"));
        setField(term3241, term3241.getClass(), "id", null);
        setField(term3241, term3241.getClass(), "email", null);
        setField(term3241, term3241.getClass(), "password", null);
        setField(term3241, term3241.getClass(), "passwordConfirmation", null);
        setField(term3241, term3241.getClass(), "oldPassword", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.UserChangeRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term3241, args);
    }

};


