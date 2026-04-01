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

public class Account_isCredentialsexpired_58933227027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4129;

    public Account_isCredentialsexpired_58933227027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4129 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        setField(term4129, term4129.getClass(), "username", null);
        setField(term4129, term4129.getClass(), "password", null);
        setBooleanField(term4129, term4129.getClass(), "enabled", false);
        setBooleanField(term4129, term4129.getClass(), "credentialsexpired", false);
        setBooleanField(term4129, term4129.getClass(), "expired", false);
        setBooleanField(term4129, term4129.getClass(), "locked", false);
        setField(term4129, term4129.getClass(), "roles", null);
        setField(term4129, term4129.getClass(), "id", null);
        setField(term4129, term4129.getClass(), "referenceId", null);
        setField(term4129, term4129.getClass(), "version", null);
        setField(term4129, term4129.getClass(), "createdBy", null);
        setField(term4129, term4129.getClass(), "createdAt", null);
        setField(term4129, term4129.getClass(), "updatedBy", null);
        setField(term4129, term4129.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isCredentialsexpired", argTypes, term4129, args);
    }

};


