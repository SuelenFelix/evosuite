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

public class UserDto_canEqual_157235268012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14154;
     Object term14208;

    public UserDto_canEqual_157235268012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14240 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term14239 = ((Class) term14240).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term14239).setAccessible(true);
        Object enum30 = ((Field) term14239).get((Object) null);
        term14154 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.UserDto"));
        setField(term14154, term14154.getClass(), "name", "hCWPJQKpdc");
        setField(term14154, term14154.getClass(), "email", "WzMEhMXkKx");
        setField(term14154, term14154.getClass(), "password", "XOiDvlDhdc");
        setField(term14154, term14154.getClass(), "role", enum30);
        term14208 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.UserDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term14208;
        callMethod(klass, "canEqual", argTypes, term14154, args);
    }

};


