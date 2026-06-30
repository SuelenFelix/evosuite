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

public class AccountChangeRequest_setConfirmPassword_185615619121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4202;

    public AccountChangeRequest_setConfirmPassword_185615619121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4202 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountChangeRequest"));
        setField(term4202, term4202.getClass(), "id", null);
        setField(term4202, term4202.getClass(), "username", null);
        setField(term4202, term4202.getClass(), "password", null);
        setField(term4202, term4202.getClass(), "confirmPassword", null);
        setField(term4202, term4202.getClass(), "domainId", null);
        setField(term4202, term4202.getClass(), "enabled", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountChangeRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setConfirmPassword", argTypes, term4202, args);
    }

};


