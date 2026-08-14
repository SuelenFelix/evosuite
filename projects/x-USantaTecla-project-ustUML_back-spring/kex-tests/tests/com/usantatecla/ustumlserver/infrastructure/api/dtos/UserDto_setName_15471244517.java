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

public class UserDto_setName_15471244517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12287;

    public UserDto_setName_15471244517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12384 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term12383 = ((Class) term12384).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term12383).setAccessible(true);
        Object enum25 = ((Field) term12383).get((Object) null);
        term12287 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.UserDto"));
        setField(term12287, term12287.getClass(), "name", "vjxIhXHxGR");
        setField(term12287, term12287.getClass(), "email", "QXzGXbEXMu");
        setField(term12287, term12287.getClass(), "password", "qxSDVejjiY");
        setField(term12287, term12287.getClass(), "role", enum25);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.UserDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xBsXSDjXYK";
        callMethod(klass, "setName", argTypes, term12287, args);
    }

};


