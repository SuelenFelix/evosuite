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

public class Account_setCredentialsexpired_178059458812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2940;
     Object term2945;

    public Account_setCredentialsexpired_178059458812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2940 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        setField(term2940, term2940.getClass(), "username", null);
        setField(term2940, term2940.getClass(), "password", null);
        setBooleanField(term2940, term2940.getClass(), "enabled", false);
        setBooleanField(term2940, term2940.getClass(), "credentialsexpired", false);
        setBooleanField(term2940, term2940.getClass(), "expired", false);
        setBooleanField(term2940, term2940.getClass(), "locked", false);
        setField(term2940, term2940.getClass(), "roles", null);
        setField(term2940, term2940.getClass(), "id", null);
        setField(term2940, term2940.getClass(), "referenceId", null);
        setField(term2940, term2940.getClass(), "version", null);
        setField(term2940, term2940.getClass(), "createdBy", null);
        setField(term2940, term2940.getClass(), "createdAt", null);
        setField(term2940, term2940.getClass(), "updatedBy", null);
        setField(term2940, term2940.getClass(), "updatedAt", null);
        term2945 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2945;
        callMethod(klass, "setCredentialsexpired", argTypes, term2940, args);
    }

};


