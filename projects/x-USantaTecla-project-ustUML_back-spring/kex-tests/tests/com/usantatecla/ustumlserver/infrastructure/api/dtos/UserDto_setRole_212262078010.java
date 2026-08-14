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

public class UserDto_setRole_212262078010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13433;
     Object enum28;

    public UserDto_setRole_212262078010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13518 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term13517 = ((Class) term13518).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term13517).setAccessible(true);
        enum28 = ((Field) term13517).get((Object) null);
        term13433 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.UserDto"));
        setField(term13433, term13433.getClass(), "name", "MvRIxilFMJ");
        setField(term13433, term13433.getClass(), "email", "iNwOJRBEjp");
        setField(term13433, term13433.getClass(), "password", "XylxrMBraH");
        setField(term13433, term13433.getClass(), "role", enum28);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.UserDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Role");
        Object[] args = new Object[1];
        args[0] = enum28;
        callMethod(klass, "setRole", argTypes, term13433, args);
    }

};


