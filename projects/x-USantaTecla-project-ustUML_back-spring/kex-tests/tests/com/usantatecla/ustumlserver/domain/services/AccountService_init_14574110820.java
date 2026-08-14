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

public class AccountService_init_14574110820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41801;

    public AccountService_init_14574110820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41801 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.TokenManager"));
        setField(term41801, term41801.getClass(), "secret", "iTxNduwSjE");
        setField(term41801, term41801.getClass(), "issuer", "MQUTfIiFnh");
        setIntField(term41801, term41801.getClass(), "expire", -2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.AccountService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.persistence.AccountPersistence");
        argTypes[1] = Class.forName("com.usantatecla.ustumlserver.domain.services.TokenManager");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term41801;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


