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

public class Account_setUsername_151187370021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4109;

    public Account_setUsername_151187370021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4109 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        setField(term4109, term4109.getClass(), "username", null);
        setField(term4109, term4109.getClass(), "password", null);
        setBooleanField(term4109, term4109.getClass(), "enabled", false);
        setBooleanField(term4109, term4109.getClass(), "credentialsexpired", false);
        setBooleanField(term4109, term4109.getClass(), "expired", false);
        setBooleanField(term4109, term4109.getClass(), "locked", false);
        setField(term4109, term4109.getClass(), "roles", null);
        setField(term4109, term4109.getClass(), "id", null);
        setField(term4109, term4109.getClass(), "referenceId", null);
        setField(term4109, term4109.getClass(), "version", null);
        setField(term4109, term4109.getClass(), "createdBy", null);
        setField(term4109, term4109.getClass(), "createdAt", null);
        setField(term4109, term4109.getClass(), "updatedBy", null);
        setField(term4109, term4109.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUsername", argTypes, term4109, args);
    }

};


