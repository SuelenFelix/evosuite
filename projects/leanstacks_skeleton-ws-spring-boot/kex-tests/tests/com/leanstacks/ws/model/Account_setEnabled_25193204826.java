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
import java.lang.Boolean;

public class Account_setEnabled_25193204826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4122;
     Object term4127;

    public Account_setEnabled_25193204826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4122 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        setField(term4122, term4122.getClass(), "username", null);
        setField(term4122, term4122.getClass(), "password", null);
        setBooleanField(term4122, term4122.getClass(), "enabled", false);
        setBooleanField(term4122, term4122.getClass(), "credentialsexpired", false);
        setBooleanField(term4122, term4122.getClass(), "expired", false);
        setBooleanField(term4122, term4122.getClass(), "locked", false);
        setField(term4122, term4122.getClass(), "roles", null);
        setField(term4122, term4122.getClass(), "id", null);
        setField(term4122, term4122.getClass(), "referenceId", null);
        setField(term4122, term4122.getClass(), "version", null);
        setField(term4122, term4122.getClass(), "createdBy", null);
        setField(term4122, term4122.getClass(), "createdAt", null);
        setField(term4122, term4122.getClass(), "updatedBy", null);
        setField(term4122, term4122.getClass(), "updatedAt", null);
        term4127 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4127;
        callMethod(klass, "setEnabled", argTypes, term4122, args);
    }

};


