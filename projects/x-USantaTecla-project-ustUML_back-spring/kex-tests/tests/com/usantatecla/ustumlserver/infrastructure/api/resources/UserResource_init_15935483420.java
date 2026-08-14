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

public class UserResource_init_15935483420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48;
     Object term75;

    public UserResource_init_15935483420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.AccountService"));
        Object term49 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.TokenManager"));
        setField(term48, term48.getClass(), "accountPersistence", null);
        setField(term49, term49.getClass(), "secret", "MuLcgQHgqz");
        setField(term49, term49.getClass(), "issuer", "xxtlPwDYFs");
        setIntField(term49, term49.getClass(), "expire", 1162663216);
        setField(term48, term48.getClass(), "tokenManager", term49);
        term75 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.SessionService"));
        setField(term75, term75.getClass(), "sessionPersistence", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.resources.UserResource");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.services.AccountService");
        argTypes[1] = Class.forName("com.usantatecla.ustumlserver.domain.services.SessionService");
        Object[] args = new Object[2];
        args[0] = term48;
        args[1] = term75;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


