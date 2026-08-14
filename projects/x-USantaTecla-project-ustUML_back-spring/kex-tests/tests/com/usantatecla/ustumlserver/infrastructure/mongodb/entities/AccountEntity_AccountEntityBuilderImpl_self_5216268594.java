package com.usantatecla.ustumlserver.infrastructure.mongodb.entities;

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
import static com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AccountEntity_AccountEntityBuilderImpl_self_5216268594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14983;

    public AccountEntity_AccountEntityBuilderImpl_self_5216268594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14983 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.AccountEntity$AccountEntityBuilderImpl"));
        setField(term14983, term14983.getClass(), "email", null);
        setField(term14983, term14983.getClass(), "password", null);
        setField(term14983, term14983.getClass(), "role", null);
        setField(term14983, term14983.getClass(), "projectEntities", null);
        setField(term14983, term14983.getClass(), "id", null);
        setField(term14983, term14983.getClass(), "name", null);
        setField(term14983, term14983.getClass(), "relationEntities", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.AccountEntity$AccountEntityBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "self", argTypes, term14983, args);
    }

};


