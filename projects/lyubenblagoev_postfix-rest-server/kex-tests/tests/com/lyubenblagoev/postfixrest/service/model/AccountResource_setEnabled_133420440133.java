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
import java.lang.Boolean;

public class AccountResource_setEnabled_133420440133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5217;
     Object term5219;

    public AccountResource_setEnabled_133420440133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5217 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource"));
        setField(term5217, term5217.getClass(), "id", null);
        setField(term5217, term5217.getClass(), "username", null);
        setField(term5217, term5217.getClass(), "domain", null);
        setField(term5217, term5217.getClass(), "domainId", null);
        setField(term5217, term5217.getClass(), "created", null);
        setField(term5217, term5217.getClass(), "updated", null);
        setBooleanField(term5217, term5217.getClass(), "enabled", false);
        term5219 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term5219;
        callMethod(klass, "setEnabled", argTypes, term5217, args);
    }

};


