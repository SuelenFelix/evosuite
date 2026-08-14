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

public class Account_setLocked_155549062731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4165;
     Object term4170;

    public Account_setLocked_155549062731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4165 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        setField(term4165, term4165.getClass(), "username", null);
        setField(term4165, term4165.getClass(), "password", null);
        setBooleanField(term4165, term4165.getClass(), "enabled", false);
        setBooleanField(term4165, term4165.getClass(), "credentialsexpired", false);
        setBooleanField(term4165, term4165.getClass(), "expired", false);
        setBooleanField(term4165, term4165.getClass(), "locked", false);
        setField(term4165, term4165.getClass(), "roles", null);
        setField(term4165, term4165.getClass(), "id", null);
        setField(term4165, term4165.getClass(), "referenceId", null);
        setField(term4165, term4165.getClass(), "version", null);
        setField(term4165, term4165.getClass(), "createdBy", null);
        setField(term4165, term4165.getClass(), "createdAt", null);
        setField(term4165, term4165.getClass(), "updatedBy", null);
        setField(term4165, term4165.getClass(), "updatedAt", null);
        term4170 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4170;
        callMethod(klass, "setLocked", argTypes, term4165, args);
    }

};


