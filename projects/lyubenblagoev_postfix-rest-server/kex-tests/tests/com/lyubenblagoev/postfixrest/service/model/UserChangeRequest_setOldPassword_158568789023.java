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

public class UserChangeRequest_setOldPassword_158568789023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3246;

    public UserChangeRequest_setOldPassword_158568789023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3246 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.UserChangeRequest"));
        setField(term3246, term3246.getClass(), "id", null);
        setField(term3246, term3246.getClass(), "email", null);
        setField(term3246, term3246.getClass(), "password", null);
        setField(term3246, term3246.getClass(), "passwordConfirmation", null);
        setField(term3246, term3246.getClass(), "oldPassword", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.UserChangeRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setOldPassword", argTypes, term3246, args);
    }

};


