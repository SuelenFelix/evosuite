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

public class UserDto_UserDtoBuilder_password_846170473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4659;

    public UserDto_UserDtoBuilder_password_846170473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4756 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term4755 = ((Class) term4756).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term4755).setAccessible(true);
        Object enum9 = ((Field) term4755).get((Object) null);
        term4659 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.UserDto$UserDtoBuilder"));
        setField(term4659, term4659.getClass(), "name", "whBvTVIIlC");
        setField(term4659, term4659.getClass(), "email", "IgRJUzaCwW");
        setField(term4659, term4659.getClass(), "password", "JUmudUmaaV");
        setField(term4659, term4659.getClass(), "role", enum9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.UserDto$UserDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KoyGrUJeJW";
        callMethod(klass, "password", argTypes, term4659, args);
    }

};


