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

public class User_getPassword_112970506924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30285;

    public User_getPassword_112970506924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30285 = newInstance(Class.forName("com.cos.blog.model.User"));
        setIntField(term30285, term30285.getClass(), "id", 0);
        setField(term30285, term30285.getClass(), "username", null);
        setField(term30285, term30285.getClass(), "password", null);
        setField(term30285, term30285.getClass(), "email", null);
        setField(term30285, term30285.getClass(), "role", null);
        setField(term30285, term30285.getClass(), "oauth", null);
        setField(term30285, term30285.getClass(), "createDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term30285, args);
    }

};


