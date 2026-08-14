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

public class UserDto_doDefault_21279786390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10127;

    public UserDto_doDefault_21279786390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10212 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term10211 = ((Class) term10212).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term10211).setAccessible(true);
        Object enum19 = ((Field) term10211).get((Object) null);
        term10127 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.UserDto"));
        setField(term10127, term10127.getClass(), "name", "LvJFtLBaxj");
        setField(term10127, term10127.getClass(), "email", "PHvxnGHptP");
        setField(term10127, term10127.getClass(), "password", "TimdotUuNC");
        setField(term10127, term10127.getClass(), "role", enum19);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.UserDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "doDefault", argTypes, term10127, args);
    }

};


