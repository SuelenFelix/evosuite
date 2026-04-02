package com.alkemy.ong.domain;

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
import static com.alkemy.ong.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class User_setEmail_44977511529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22739;

    public User_setEmail_44977511529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22739 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        setField(term22739, term22739.getClass(), "id", null);
        setField(term22739, term22739.getClass(), "firstName", null);
        setField(term22739, term22739.getClass(), "lastName", null);
        setField(term22739, term22739.getClass(), "email", null);
        setField(term22739, term22739.getClass(), "password", null);
        setField(term22739, term22739.getClass(), "imageUrl", null);
        setField(term22739, term22739.getClass(), "role", null);
        setField(term22739, term22739.getClass(), "token", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEmail", argTypes, term22739, args);
    }

};


