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

public class UserDto_UserDtoBuilder_role_16849275364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5041;
     Object enum10;

    public UserDto_UserDtoBuilder_role_16849275364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5126 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term5125 = ((Class) term5126).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term5125).setAccessible(true);
        enum10 = ((Field) term5125).get((Object) null);
        term5041 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.UserDto$UserDtoBuilder"));
        setField(term5041, term5041.getClass(), "name", "HqBOwkVqjD");
        setField(term5041, term5041.getClass(), "email", "MAcUBcBckh");
        setField(term5041, term5041.getClass(), "password", "oVgzLbrsFr");
        setField(term5041, term5041.getClass(), "role", enum10);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.UserDto$UserDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Role");
        Object[] args = new Object[1];
        args[0] = enum10;
        callMethod(klass, "role", argTypes, term5041, args);
    }

};


