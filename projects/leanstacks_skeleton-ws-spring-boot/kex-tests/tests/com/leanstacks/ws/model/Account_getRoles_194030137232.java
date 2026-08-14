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

public class Account_getRoles_194030137232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4172;

    public Account_getRoles_194030137232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4172 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        setField(term4172, term4172.getClass(), "username", null);
        setField(term4172, term4172.getClass(), "password", null);
        setBooleanField(term4172, term4172.getClass(), "enabled", false);
        setBooleanField(term4172, term4172.getClass(), "credentialsexpired", false);
        setBooleanField(term4172, term4172.getClass(), "expired", false);
        setBooleanField(term4172, term4172.getClass(), "locked", false);
        setField(term4172, term4172.getClass(), "roles", null);
        setField(term4172, term4172.getClass(), "id", null);
        setField(term4172, term4172.getClass(), "referenceId", null);
        setField(term4172, term4172.getClass(), "version", null);
        setField(term4172, term4172.getClass(), "createdBy", null);
        setField(term4172, term4172.getClass(), "createdAt", null);
        setField(term4172, term4172.getClass(), "updatedBy", null);
        setField(term4172, term4172.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoles", argTypes, term4172, args);
    }

};


