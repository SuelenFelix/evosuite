package com.usantatecla.ustumlserver.infrastructure.api.resources;

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
import static com.usantatecla.ustumlserver.infrastructure.api.resources.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CommandResource_init_2044544750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public CommandResource_init_2044544750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.AccountService"));
        Object term2 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.TokenManager"));
        setField(term1, term1.getClass(), "accountPersistence", null);
        setField(term2, term2.getClass(), "secret", "PAEBtnZtTD");
        setField(term2, term2.getClass(), "issuer", "sjlJAEtRrb");
        setIntField(term2, term2.getClass(), "expire", 568599855);
        setField(term1, term1.getClass(), "tokenManager", term2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.resources.CommandResource");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.services.AccountService");
        argTypes[1] = Class.forName("com.usantatecla.ustumlserver.domain.services.CommandService");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


