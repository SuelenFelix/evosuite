package com.lyubenblagoev.postfixrest.service.model;

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
import static com.lyubenblagoev.postfixrest.service.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AccountResource_setDomainId_100539747127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5205;

    public AccountResource_setDomainId_100539747127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5205 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource"));
        setField(term5205, term5205.getClass(), "id", null);
        setField(term5205, term5205.getClass(), "username", null);
        setField(term5205, term5205.getClass(), "domain", null);
        setField(term5205, term5205.getClass(), "domainId", null);
        setField(term5205, term5205.getClass(), "created", null);
        setField(term5205, term5205.getClass(), "updated", null);
        setBooleanField(term5205, term5205.getClass(), "enabled", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDomainId", argTypes, term5205, args);
    }

};


