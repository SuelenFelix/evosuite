package com.usantatecla.ustumlserver.infrastructure.api.dtos;

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
import static com.usantatecla.ustumlserver.infrastructure.api.dtos.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserDto_getPassword_17852521122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15599;

    public UserDto_getPassword_17852521122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15599 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.UserDto"));
        setField(term15599, term15599.getClass(), "name", null);
        setField(term15599, term15599.getClass(), "email", null);
        setField(term15599, term15599.getClass(), "password", null);
        setField(term15599, term15599.getClass(), "role", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.UserDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term15599, args);
    }

};


