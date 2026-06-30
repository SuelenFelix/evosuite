package com.API.OnDriver.CustomerSubsystem;

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
import static com.API.OnDriver.CustomerSubsystem.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Admin_verifyDriver_13371298077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9312;

    public Admin_verifyDriver_13371298077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9312 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Admin"));
        setField(term9312, term9312.getClass(), "manager", null);
        setField(term9312, term9312.getClass(), "username", null);
        setField(term9312, term9312.getClass(), "mobileNumber", null);
        setField(term9312, term9312.getClass(), "email", null);
        setField(term9312, term9312.getClass(), "password", null);
        setField(term9312, term9312.getClass(), "userStatus", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Admin");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "verifyDriver", argTypes, term9312, args);
    }

};


