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

public class User_UserBuilder_createDate_153828998117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13897;

    public User_UserBuilder_createDate_153828998117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13897 = newInstance(Class.forName("com.cos.blog.model.User$UserBuilder"));
        setIntField(term13897, term13897.getClass(), "id", 0);
        setField(term13897, term13897.getClass(), "username", null);
        setField(term13897, term13897.getClass(), "password", null);
        setField(term13897, term13897.getClass(), "email", null);
        setField(term13897, term13897.getClass(), "role", null);
        setField(term13897, term13897.getClass(), "oauth", null);
        setField(term13897, term13897.getClass(), "createDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createDate", argTypes, term13897, args);
    }

};


