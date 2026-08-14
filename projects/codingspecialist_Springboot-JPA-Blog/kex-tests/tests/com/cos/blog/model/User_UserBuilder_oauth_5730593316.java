package com.cos.blog.model;

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
import static com.cos.blog.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class User_UserBuilder_oauth_5730593316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13895;

    public User_UserBuilder_oauth_5730593316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13895 = newInstance(Class.forName("com.cos.blog.model.User$UserBuilder"));
        setIntField(term13895, term13895.getClass(), "id", 0);
        setField(term13895, term13895.getClass(), "username", null);
        setField(term13895, term13895.getClass(), "password", null);
        setField(term13895, term13895.getClass(), "email", null);
        setField(term13895, term13895.getClass(), "role", null);
        setField(term13895, term13895.getClass(), "oauth", null);
        setField(term13895, term13895.getClass(), "createDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "oauth", argTypes, term13895, args);
    }

};


