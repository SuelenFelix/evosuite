package com.skyg0d.spring.jwt.property;

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
import static com.skyg0d.spring.jwt.property.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DefaultDataProps_setUser_9578716182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63;
     Object term98;

    public DefaultDataProps_setUser_9578716182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63 = newInstance(Class.forName("com.skyg0d.spring.jwt.property.DefaultDataProps"));
        Object term64 = newInstance(Class.forName("com.skyg0d.spring.jwt.property.DefaultDataProps$DefaultUser"));
        setField(term64, term64.getClass(), "email", "admin@mail.com");
        setField(term64, term64.getClass(), "password", "admin123");
        setField(term64, term64.getClass(), "username", "Admin");
        setField(term63, term63.getClass(), "user", term64);
        term98 = newInstance(Class.forName("com.skyg0d.spring.jwt.property.DefaultDataProps$DefaultUser"));
        setField(term98, term98.getClass(), "email", "admin@mail.com");
        setField(term98, term98.getClass(), "password", "admin123");
        setField(term98, term98.getClass(), "username", "Admin");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.property.DefaultDataProps");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.skyg0d.spring.jwt.property.DefaultDataProps$DefaultUser");
        Object[] args = new Object[1];
        args[0] = term98;
        callMethod(klass, "setUser", argTypes, term63, args);
    }

};


