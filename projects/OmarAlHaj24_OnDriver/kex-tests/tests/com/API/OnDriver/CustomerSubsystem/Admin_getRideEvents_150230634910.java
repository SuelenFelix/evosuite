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
import java.lang.Integer;

public class Admin_getRideEvents_150230634910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9315;
     Object term9316;

    public Admin_getRideEvents_150230634910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9315 = newInstance(Class.forName("com.API.OnDriver.CustomerSubsystem.Admin"));
        setField(term9315, term9315.getClass(), "manager", null);
        setField(term9315, term9315.getClass(), "username", null);
        setField(term9315, term9315.getClass(), "mobileNumber", null);
        setField(term9315, term9315.getClass(), "email", null);
        setField(term9315, term9315.getClass(), "password", null);
        setField(term9315, term9315.getClass(), "userStatus", null);
        term9316 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.API.OnDriver.CustomerSubsystem.Admin");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9316;
        callMethod(klass, "getRideEvents", argTypes, term9315, args);
    }

};


