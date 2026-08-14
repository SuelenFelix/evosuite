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

public class UserDto_UserDtoBuilder_build_720866465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5401;

    public UserDto_UserDtoBuilder_build_720866465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5486 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term5485 = ((Class) term5486).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term5485).setAccessible(true);
        Object enum11 = ((Field) term5485).get((Object) null);
        term5401 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.UserDto$UserDtoBuilder"));
        setField(term5401, term5401.getClass(), "name", "vQVyKLdtaz");
        setField(term5401, term5401.getClass(), "email", "OWKQODBLzb");
        setField(term5401, term5401.getClass(), "password", "wGmYcqUkgE");
        setField(term5401, term5401.getClass(), "role", enum11);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.UserDto$UserDtoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term5401, args);
    }

};


