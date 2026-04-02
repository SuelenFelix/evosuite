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

public class User_setOauth_92923174734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30307;

    public User_setOauth_92923174734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30307 = newInstance(Class.forName("com.cos.blog.model.User"));
        setIntField(term30307, term30307.getClass(), "id", 0);
        setField(term30307, term30307.getClass(), "username", null);
        setField(term30307, term30307.getClass(), "password", null);
        setField(term30307, term30307.getClass(), "email", null);
        setField(term30307, term30307.getClass(), "role", null);
        setField(term30307, term30307.getClass(), "oauth", null);
        setField(term30307, term30307.getClass(), "createDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setOauth", argTypes, term30307, args);
    }

};


