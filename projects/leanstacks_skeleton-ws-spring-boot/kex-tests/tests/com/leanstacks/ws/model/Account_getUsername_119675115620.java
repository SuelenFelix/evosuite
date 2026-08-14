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

public class Account_getUsername_119675115620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4104;

    public Account_getUsername_119675115620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4104 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        setField(term4104, term4104.getClass(), "username", null);
        setField(term4104, term4104.getClass(), "password", null);
        setBooleanField(term4104, term4104.getClass(), "enabled", false);
        setBooleanField(term4104, term4104.getClass(), "credentialsexpired", false);
        setBooleanField(term4104, term4104.getClass(), "expired", false);
        setBooleanField(term4104, term4104.getClass(), "locked", false);
        setField(term4104, term4104.getClass(), "roles", null);
        setField(term4104, term4104.getClass(), "id", null);
        setField(term4104, term4104.getClass(), "referenceId", null);
        setField(term4104, term4104.getClass(), "version", null);
        setField(term4104, term4104.getClass(), "createdBy", null);
        setField(term4104, term4104.getClass(), "createdAt", null);
        setField(term4104, term4104.getClass(), "updatedBy", null);
        setField(term4104, term4104.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term4104, args);
    }

};


