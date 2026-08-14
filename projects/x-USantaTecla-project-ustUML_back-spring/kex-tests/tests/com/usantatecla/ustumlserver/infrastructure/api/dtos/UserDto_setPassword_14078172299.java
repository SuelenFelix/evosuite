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
import java.lang.String;
import java.lang.Object;

public class UserDto_setPassword_14078172299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13051;

    public UserDto_setPassword_14078172299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13148 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term13147 = ((Class) term13148).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term13147).setAccessible(true);
        Object enum27 = ((Field) term13147).get((Object) null);
        term13051 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.UserDto"));
        setField(term13051, term13051.getClass(), "name", "SJiQaLvSKv");
        setField(term13051, term13051.getClass(), "email", "OEXDRUKcFl");
        setField(term13051, term13051.getClass(), "password", "RYdKCNNMBR");
        setField(term13051, term13051.getClass(), "role", enum27);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.UserDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "yGtHPyvYiQ";
        callMethod(klass, "setPassword", argTypes, term13051, args);
    }

};


