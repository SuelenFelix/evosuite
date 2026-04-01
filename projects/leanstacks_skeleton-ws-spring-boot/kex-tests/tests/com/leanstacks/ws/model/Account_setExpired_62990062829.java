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
     Object term4139;
     Object term4144;

    public Account_setExpired_62990062829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4139 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        setField(term4139, term4139.getClass(), "username", null);
        setField(term4139, term4139.getClass(), "password", null);
        setBooleanField(term4139, term4139.getClass(), "enabled", false);
        setBooleanField(term4139, term4139.getClass(), "credentialsexpired", false);
        setBooleanField(term4139, term4139.getClass(), "expired", false);
        setBooleanField(term4139, term4139.getClass(), "locked", false);
        setField(term4139, term4139.getClass(), "roles", null);
        setField(term4139, term4139.getClass(), "id", null);
        setField(term4139, term4139.getClass(), "referenceId", null);
        setField(term4139, term4139.getClass(), "version", null);
        setField(term4139, term4139.getClass(), "createdBy", null);
        setField(term4139, term4139.getClass(), "createdAt", null);
        setField(term4139, term4139.getClass(), "updatedBy", null);
        setField(term4139, term4139.getClass(), "updatedAt", null);
        term4144 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4144;
        callMethod(klass, "setExpired", argTypes, term4139, args);
    }

};


