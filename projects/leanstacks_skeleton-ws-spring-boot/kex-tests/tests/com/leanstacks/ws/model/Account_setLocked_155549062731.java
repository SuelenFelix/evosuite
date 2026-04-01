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
     Object term4151;
     Object term4156;

    public Account_setLocked_155549062731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4151 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        setField(term4151, term4151.getClass(), "username", null);
        setField(term4151, term4151.getClass(), "password", null);
        setBooleanField(term4151, term4151.getClass(), "enabled", false);
        setBooleanField(term4151, term4151.getClass(), "credentialsexpired", false);
        setBooleanField(term4151, term4151.getClass(), "expired", false);
        setBooleanField(term4151, term4151.getClass(), "locked", false);
        setField(term4151, term4151.getClass(), "roles", null);
        setField(term4151, term4151.getClass(), "id", null);
        setField(term4151, term4151.getClass(), "referenceId", null);
        setField(term4151, term4151.getClass(), "version", null);
        setField(term4151, term4151.getClass(), "createdBy", null);
        setField(term4151, term4151.getClass(), "createdAt", null);
        setField(term4151, term4151.getClass(), "updatedBy", null);
        setField(term4151, term4151.getClass(), "updatedAt", null);
        term4156 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4156;
        callMethod(klass, "setLocked", argTypes, term4151, args);
    }

};


