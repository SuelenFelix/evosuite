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

public class AccountChangeRequest_getId_185211644014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4195;

    public AccountChangeRequest_getId_185211644014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4195 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountChangeRequest"));
        setField(term4195, term4195.getClass(), "id", null);
        setField(term4195, term4195.getClass(), "username", null);
        setField(term4195, term4195.getClass(), "password", null);
        setField(term4195, term4195.getClass(), "confirmPassword", null);
        setField(term4195, term4195.getClass(), "domainId", null);
        setField(term4195, term4195.getClass(), "enabled", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountChangeRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term4195, args);
    }

};


