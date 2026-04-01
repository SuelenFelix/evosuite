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

public class Account_isExpired_26530619828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4134;

    public Account_isExpired_26530619828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4134 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        setField(term4134, term4134.getClass(), "username", null);
        setField(term4134, term4134.getClass(), "password", null);
        setBooleanField(term4134, term4134.getClass(), "enabled", false);
        setBooleanField(term4134, term4134.getClass(), "credentialsexpired", false);
        setBooleanField(term4134, term4134.getClass(), "expired", false);
        setBooleanField(term4134, term4134.getClass(), "locked", false);
        setField(term4134, term4134.getClass(), "roles", null);
        setField(term4134, term4134.getClass(), "id", null);
        setField(term4134, term4134.getClass(), "referenceId", null);
        setField(term4134, term4134.getClass(), "version", null);
        setField(term4134, term4134.getClass(), "createdBy", null);
        setField(term4134, term4134.getClass(), "createdAt", null);
        setField(term4134, term4134.getClass(), "updatedBy", null);
        setField(term4134, term4134.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isExpired", argTypes, term4134, args);
    }

};


