package com.leanstacks.ws.model;

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
import static com.leanstacks.ws.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Account_setRoles_123363311033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4163;

    public Account_setRoles_123363311033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4163 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        setField(term4163, term4163.getClass(), "username", null);
        setField(term4163, term4163.getClass(), "password", null);
        setBooleanField(term4163, term4163.getClass(), "enabled", false);
        setBooleanField(term4163, term4163.getClass(), "credentialsexpired", false);
        setBooleanField(term4163, term4163.getClass(), "expired", false);
        setBooleanField(term4163, term4163.getClass(), "locked", false);
        setField(term4163, term4163.getClass(), "roles", null);
        setField(term4163, term4163.getClass(), "id", null);
        setField(term4163, term4163.getClass(), "referenceId", null);
        setField(term4163, term4163.getClass(), "version", null);
        setField(term4163, term4163.getClass(), "createdBy", null);
        setField(term4163, term4163.getClass(), "createdAt", null);
        setField(term4163, term4163.getClass(), "updatedBy", null);
        setField(term4163, term4163.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRoles", argTypes, term4163, args);
    }

};


