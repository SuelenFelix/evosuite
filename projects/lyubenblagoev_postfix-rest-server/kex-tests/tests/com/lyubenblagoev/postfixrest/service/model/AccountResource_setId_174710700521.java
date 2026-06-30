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

public class AccountResource_setId_174710700521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5193;

    public AccountResource_setId_174710700521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5193 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource"));
        setField(term5193, term5193.getClass(), "id", null);
        setField(term5193, term5193.getClass(), "username", null);
        setField(term5193, term5193.getClass(), "domain", null);
        setField(term5193, term5193.getClass(), "domainId", null);
        setField(term5193, term5193.getClass(), "created", null);
        setField(term5193, term5193.getClass(), "updated", null);
        setBooleanField(term5193, term5193.getClass(), "enabled", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setId", argTypes, term5193, args);
    }

};


