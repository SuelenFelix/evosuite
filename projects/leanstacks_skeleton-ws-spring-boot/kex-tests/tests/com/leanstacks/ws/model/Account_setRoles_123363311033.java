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
     Object term4177;

    public Account_setRoles_123363311033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4177 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        setField(term4177, term4177.getClass(), "username", null);
        setField(term4177, term4177.getClass(), "password", null);
        setBooleanField(term4177, term4177.getClass(), "enabled", false);
        setBooleanField(term4177, term4177.getClass(), "credentialsexpired", false);
        setBooleanField(term4177, term4177.getClass(), "expired", false);
        setBooleanField(term4177, term4177.getClass(), "locked", false);
        setField(term4177, term4177.getClass(), "roles", null);
        setField(term4177, term4177.getClass(), "id", null);
        setField(term4177, term4177.getClass(), "referenceId", null);
        setField(term4177, term4177.getClass(), "version", null);
        setField(term4177, term4177.getClass(), "createdBy", null);
        setField(term4177, term4177.getClass(), "createdAt", null);
        setField(term4177, term4177.getClass(), "updatedBy", null);
        setField(term4177, term4177.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRoles", argTypes, term4177, args);
    }

};


