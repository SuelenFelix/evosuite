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

public class UserDto_getRole_13545915126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11927;

    public UserDto_getRole_13545915126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12012 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term12011 = ((Class) term12012).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term12011).setAccessible(true);
        Object enum24 = ((Field) term12011).get((Object) null);
        term11927 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.UserDto"));
        setField(term11927, term11927.getClass(), "name", "SPpkrGcPRr");
        setField(term11927, term11927.getClass(), "email", "sEccwbJKYE");
        setField(term11927, term11927.getClass(), "password", "AWRooQKkdW");
        setField(term11927, term11927.getClass(), "role", enum24);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.UserDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRole", argTypes, term11927, args);
    }

};


