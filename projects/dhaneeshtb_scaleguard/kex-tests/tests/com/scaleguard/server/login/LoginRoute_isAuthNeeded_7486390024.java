package com.scaleguard.server.login;

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
import static com.scaleguard.server.login.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class LoginRoute_isAuthNeeded_7486390024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public LoginRoute_isAuthNeeded_7486390024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.login.LoginRoute");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAuthNeeded", argTypes, null, args);
    }

};


