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

public class UserUpdateRequest_getPasswordConfirmation_17239498385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term493;

    public UserUpdateRequest_getPasswordConfirmation_17239498385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term493 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.controller.model.UserUpdateRequest"));
        setField(term493, term493.getClass(), "email", "xOEqzGAmDU");
        setField(term493, term493.getClass(), "password", "eZFUvlxvGV");
        setField(term493, term493.getClass(), "passwordConfirmation", "BYqFIqCKAV");
        setField(term493, term493.getClass(), "oldPassword", "vrQLuWIDJX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.controller.model.UserUpdateRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPasswordConfirmation", argTypes, term493, args);
    }

};


