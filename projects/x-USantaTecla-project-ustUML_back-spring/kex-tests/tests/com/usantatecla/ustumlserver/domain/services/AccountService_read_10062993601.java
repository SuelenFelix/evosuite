package com.usantatecla.ustumlserver.domain.services;

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
import static com.usantatecla.ustumlserver.domain.services.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AccountService_read_10062993601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41847;

    public AccountService_read_10062993601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41847 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.AccountService"));
        Object term41848 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.TokenManager"));
        setField(term41847, term41847.getClass(), "accountPersistence", null);
        setField(term41848, term41848.getClass(), "secret", "JeyKRznnft");
        setField(term41848, term41848.getClass(), "issuer", "vQJUCtuYpK");
        setIntField(term41848, term41848.getClass(), "expire", 1227103734);
        setField(term41847, term41847.getClass(), "tokenManager", term41848);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.AccountService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GHtOeztAdz";
        callMethod(klass, "read", argTypes, term41847, args);
    }

};


