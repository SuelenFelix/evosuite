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

public class Account_isEnabled_61652647824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4124;

    public Account_isEnabled_61652647824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4124 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        setField(term4124, term4124.getClass(), "username", null);
        setField(term4124, term4124.getClass(), "password", null);
        setBooleanField(term4124, term4124.getClass(), "enabled", false);
        setBooleanField(term4124, term4124.getClass(), "credentialsexpired", false);
        setBooleanField(term4124, term4124.getClass(), "expired", false);
        setBooleanField(term4124, term4124.getClass(), "locked", false);
        setField(term4124, term4124.getClass(), "roles", null);
        setField(term4124, term4124.getClass(), "id", null);
        setField(term4124, term4124.getClass(), "referenceId", null);
        setField(term4124, term4124.getClass(), "version", null);
        setField(term4124, term4124.getClass(), "createdBy", null);
        setField(term4124, term4124.getClass(), "createdAt", null);
        setField(term4124, term4124.getClass(), "updatedBy", null);
        setField(term4124, term4124.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEnabled", argTypes, term4124, args);
    }

};


