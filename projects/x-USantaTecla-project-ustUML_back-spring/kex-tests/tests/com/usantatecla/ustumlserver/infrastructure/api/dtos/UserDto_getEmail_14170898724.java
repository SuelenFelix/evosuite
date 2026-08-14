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

public class UserDto_getEmail_14170898724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11207;

    public UserDto_getEmail_14170898724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11292 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term11291 = ((Class) term11292).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term11291).setAccessible(true);
        Object enum22 = ((Field) term11291).get((Object) null);
        term11207 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.UserDto"));
        setField(term11207, term11207.getClass(), "name", "jiKYgYHqIS");
        setField(term11207, term11207.getClass(), "email", "DfISiziTgG");
        setField(term11207, term11207.getClass(), "password", "XqgfKFvPSD");
        setField(term11207, term11207.getClass(), "role", enum22);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.UserDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term11207, args);
    }

};


