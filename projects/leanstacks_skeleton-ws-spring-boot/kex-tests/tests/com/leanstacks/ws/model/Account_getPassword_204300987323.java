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

public class Account_getPassword_204300987323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7880;

    public Account_getPassword_204300987323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7880 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        setField(term7880, term7880.getClass(), "username", null);
        setField(term7880, term7880.getClass(), "password", null);
        setBooleanField(term7880, term7880.getClass(), "enabled", false);
        setBooleanField(term7880, term7880.getClass(), "credentialsexpired", false);
        setBooleanField(term7880, term7880.getClass(), "expired", false);
        setBooleanField(term7880, term7880.getClass(), "locked", false);
        setField(term7880, term7880.getClass(), "roles", null);
        setField(term7880, term7880.getClass(), "id", null);
        setField(term7880, term7880.getClass(), "referenceId", null);
        setField(term7880, term7880.getClass(), "version", null);
        setField(term7880, term7880.getClass(), "createdBy", null);
        setField(term7880, term7880.getClass(), "createdAt", null);
        setField(term7880, term7880.getClass(), "updatedBy", null);
        setField(term7880, term7880.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term7880, args);
    }

};


