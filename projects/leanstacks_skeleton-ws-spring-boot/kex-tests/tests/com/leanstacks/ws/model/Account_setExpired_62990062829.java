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

public class Account_setExpired_62990062829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4153;
     Object term4158;

    public Account_setExpired_62990062829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4153 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        setField(term4153, term4153.getClass(), "username", null);
        setField(term4153, term4153.getClass(), "password", null);
        setBooleanField(term4153, term4153.getClass(), "enabled", false);
        setBooleanField(term4153, term4153.getClass(), "credentialsexpired", false);
        setBooleanField(term4153, term4153.getClass(), "expired", false);
        setBooleanField(term4153, term4153.getClass(), "locked", false);
        setField(term4153, term4153.getClass(), "roles", null);
        setField(term4153, term4153.getClass(), "id", null);
        setField(term4153, term4153.getClass(), "referenceId", null);
        setField(term4153, term4153.getClass(), "version", null);
        setField(term4153, term4153.getClass(), "createdBy", null);
        setField(term4153, term4153.getClass(), "createdAt", null);
        setField(term4153, term4153.getClass(), "updatedBy", null);
        setField(term4153, term4153.getClass(), "updatedAt", null);
        term4158 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4158;
        callMethod(klass, "setExpired", argTypes, term4153, args);
    }

};


