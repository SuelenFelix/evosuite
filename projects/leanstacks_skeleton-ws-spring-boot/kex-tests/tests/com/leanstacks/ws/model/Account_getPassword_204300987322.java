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

public class Account_getPassword_204300987322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4114;

    public Account_getPassword_204300987322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4114 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        setField(term4114, term4114.getClass(), "username", null);
        setField(term4114, term4114.getClass(), "password", null);
        setBooleanField(term4114, term4114.getClass(), "enabled", false);
        setBooleanField(term4114, term4114.getClass(), "credentialsexpired", false);
        setBooleanField(term4114, term4114.getClass(), "expired", false);
        setBooleanField(term4114, term4114.getClass(), "locked", false);
        setField(term4114, term4114.getClass(), "roles", null);
        setField(term4114, term4114.getClass(), "id", null);
        setField(term4114, term4114.getClass(), "referenceId", null);
        setField(term4114, term4114.getClass(), "version", null);
        setField(term4114, term4114.getClass(), "createdBy", null);
        setField(term4114, term4114.getClass(), "createdAt", null);
        setField(term4114, term4114.getClass(), "updatedBy", null);
        setField(term4114, term4114.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term4114, args);
    }

};


