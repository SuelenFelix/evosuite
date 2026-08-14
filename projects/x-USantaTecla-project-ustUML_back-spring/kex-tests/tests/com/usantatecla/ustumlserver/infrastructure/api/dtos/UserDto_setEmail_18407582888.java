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

public class UserDto_setEmail_18407582888 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12669;

    public UserDto_setEmail_18407582888() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12766 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term12765 = ((Class) term12766).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term12765).setAccessible(true);
        Object enum26 = ((Field) term12765).get((Object) null);
        term12669 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.UserDto"));
        setField(term12669, term12669.getClass(), "name", "sEnIVFtZuQ");
        setField(term12669, term12669.getClass(), "email", "ZVecLZMLHF");
        setField(term12669, term12669.getClass(), "password", "fztQhjqwdP");
        setField(term12669, term12669.getClass(), "role", enum26);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.UserDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eVpkWxjuki";
        callMethod(klass, "setEmail", argTypes, term12669, args);
    }

};


