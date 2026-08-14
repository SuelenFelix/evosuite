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

public class DefaultDataProps_DefaultUser_getUsername_10441064443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term373;

    public DefaultDataProps_DefaultUser_getUsername_10441064443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term373 = newInstance(Class.forName("com.skyg0d.spring.jwt.property.DefaultDataProps$DefaultUser"));
        setField(term373, term373.getClass(), "email", "admin@mail.com");
        setField(term373, term373.getClass(), "password", "admin123");
        setField(term373, term373.getClass(), "username", "Admin");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.property.DefaultDataProps$DefaultUser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term373, args);
    }

};


