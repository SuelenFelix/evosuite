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

public class AccountService_login_19335039642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41916;

    public AccountService_login_19335039642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41916 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.AccountService"));
        Object term41917 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.TokenManager"));
        setField(term41916, term41916.getClass(), "accountPersistence", null);
        setField(term41917, term41917.getClass(), "secret", "gSAtqakaLY");
        setField(term41917, term41917.getClass(), "issuer", "taPBiMFNEZ");
        setIntField(term41917, term41917.getClass(), "expire", -1339778481);
        setField(term41916, term41916.getClass(), "tokenManager", term41917);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.AccountService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NoAFAfGyYL";
        callMethod(klass, "login", argTypes, term41916, args);
    }

};


