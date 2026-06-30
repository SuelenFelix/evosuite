package com.blog.coffee_shop.dto;

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
import static com.blog.coffee_shop.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AuthDTO_setPassword_208201998912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term602;

    public AuthDTO_setPassword_208201998912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term602 = newInstance(Class.forName("com.blog.coffee_shop.dto.AuthDTO"));
        setField(term602, term602.getClass(), "username", null);
        setField(term602, term602.getClass(), "password", null);
        setBooleanField(term602, term602.getClass(), "rememberMe", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.blog.coffee_shop.dto.AuthDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPassword", argTypes, term602, args);
    }

};


