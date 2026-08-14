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

public class UserDto_getPassword_1785252115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11567;

    public UserDto_getPassword_1785252115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11652 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term11651 = ((Class) term11652).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term11651).setAccessible(true);
        Object enum23 = ((Field) term11651).get((Object) null);
        term11567 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.UserDto"));
        setField(term11567, term11567.getClass(), "name", "JiVRgTZvKc");
        setField(term11567, term11567.getClass(), "email", "XPKmummaqg");
        setField(term11567, term11567.getClass(), "password", "BKLfkLiZTH");
        setField(term11567, term11567.getClass(), "role", enum23);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.UserDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term11567, args);
    }

};


