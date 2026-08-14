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

public class UserDto_UserDtoBuilder_toString_10621046096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5761;

    public UserDto_UserDtoBuilder_toString_10621046096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5846 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term5845 = ((Class) term5846).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term5845).setAccessible(true);
        Object enum12 = ((Field) term5845).get((Object) null);
        term5761 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.UserDto$UserDtoBuilder"));
        setField(term5761, term5761.getClass(), "name", "idgaQsnJpQ");
        setField(term5761, term5761.getClass(), "email", "VgZnGoIFwQ");
        setField(term5761, term5761.getClass(), "password", "jUbSRrkrYZ");
        setField(term5761, term5761.getClass(), "role", enum12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.UserDto$UserDtoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term5761, args);
    }

};


