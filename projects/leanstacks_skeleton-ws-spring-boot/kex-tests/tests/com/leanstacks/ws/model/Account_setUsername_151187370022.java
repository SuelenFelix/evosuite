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

public class Account_setUsername_151187370022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7875;

    public Account_setUsername_151187370022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7875 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        setField(term7875, term7875.getClass(), "username", null);
        setField(term7875, term7875.getClass(), "password", null);
        setBooleanField(term7875, term7875.getClass(), "enabled", false);
        setBooleanField(term7875, term7875.getClass(), "credentialsexpired", false);
        setBooleanField(term7875, term7875.getClass(), "expired", false);
        setBooleanField(term7875, term7875.getClass(), "locked", false);
        setField(term7875, term7875.getClass(), "roles", null);
        setField(term7875, term7875.getClass(), "id", null);
        setField(term7875, term7875.getClass(), "referenceId", null);
        setField(term7875, term7875.getClass(), "version", null);
        setField(term7875, term7875.getClass(), "createdBy", null);
        setField(term7875, term7875.getClass(), "createdAt", null);
        setField(term7875, term7875.getClass(), "updatedBy", null);
        setField(term7875, term7875.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUsername", argTypes, term7875, args);
    }

};


