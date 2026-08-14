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

public class UserDto_toAccount_13800005311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10487;

    public UserDto_toAccount_13800005311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10572 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term10571 = ((Class) term10572).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term10571).setAccessible(true);
        Object enum20 = ((Field) term10571).get((Object) null);
        term10487 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.UserDto"));
        setField(term10487, term10487.getClass(), "name", "PkWMRdJcBb");
        setField(term10487, term10487.getClass(), "email", "jSpAteRute");
        setField(term10487, term10487.getClass(), "password", "swZVeJAxjt");
        setField(term10487, term10487.getClass(), "role", enum20);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.UserDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toAccount", argTypes, term10487, args);
    }

};


