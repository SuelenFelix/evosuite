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

public class AccountResource_toAccount_107968360219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5189;

    public AccountResource_toAccount_107968360219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5189 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource"));
        setField(term5189, term5189.getClass(), "id", null);
        setField(term5189, term5189.getClass(), "username", null);
        setField(term5189, term5189.getClass(), "domain", null);
        setField(term5189, term5189.getClass(), "domainId", null);
        setField(term5189, term5189.getClass(), "created", null);
        setField(term5189, term5189.getClass(), "updated", null);
        setBooleanField(term5189, term5189.getClass(), "enabled", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource");
        argTypes[1] = Class.forName("com.lyubenblagoev.postfixrest.entity.Domain");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "toAccount", argTypes, term5189, args);
    }

};


