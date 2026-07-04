package com.org.model;

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
import static com.org.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class User_setSex_170585947853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26480;

    public User_setSex_170585947853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26480 = newInstance(Class.forName("com.org.model.User"));
        setField(term26480, term26480.getClass(), "id", null);
        setField(term26480, term26480.getClass(), "email", null);
        setField(term26480, term26480.getClass(), "password", null);
        setField(term26480, term26480.getClass(), "username", null);
        setField(term26480, term26480.getClass(), "power", null);
        setField(term26480, term26480.getClass(), "nickname", null);
        setField(term26480, term26480.getClass(), "sex", null);
        setField(term26480, term26480.getClass(), "age", null);
        setField(term26480, term26480.getClass(), "phone", null);
        setField(term26480, term26480.getClass(), "faceUrl", null);
        setField(term26480, term26480.getClass(), "headUrl", null);
        setField(term26480, term26480.getClass(), "introduce", null);
        setField(term26480, term26480.getClass(), "ip", null);
        setField(term26480, term26480.getClass(), "meetings", null);
        setField(term26480, term26480.getClass(), "menus", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSex", argTypes, term26480, args);
    }

};


