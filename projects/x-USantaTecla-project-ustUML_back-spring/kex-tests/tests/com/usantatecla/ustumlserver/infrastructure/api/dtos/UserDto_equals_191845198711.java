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

public class UserDto_equals_191845198711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13793;
     Object term13847;

    public UserDto_equals_191845198711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13879 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term13878 = ((Class) term13879).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term13878).setAccessible(true);
        Object enum29 = ((Field) term13878).get((Object) null);
        term13793 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.UserDto"));
        setField(term13793, term13793.getClass(), "name", "pORebkoRdD");
        setField(term13793, term13793.getClass(), "email", "mXGCWJDOqA");
        setField(term13793, term13793.getClass(), "password", "dpNsDgfPso");
        setField(term13793, term13793.getClass(), "role", enum29);
        term13847 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.UserDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term13847;
        callMethod(klass, "equals", argTypes, term13793, args);
    }

};


