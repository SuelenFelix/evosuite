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

public class User_getPassword_24502957937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26489;

    public User_getPassword_24502957937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26489 = newInstance(Class.forName("com.org.model.User"));
        setField(term26489, term26489.getClass(), "id", null);
        setField(term26489, term26489.getClass(), "email", null);
        setField(term26489, term26489.getClass(), "password", null);
        setField(term26489, term26489.getClass(), "username", null);
        setField(term26489, term26489.getClass(), "power", null);
        setField(term26489, term26489.getClass(), "nickname", null);
        setField(term26489, term26489.getClass(), "sex", null);
        setField(term26489, term26489.getClass(), "age", null);
        setField(term26489, term26489.getClass(), "phone", null);
        setField(term26489, term26489.getClass(), "faceUrl", null);
        setField(term26489, term26489.getClass(), "headUrl", null);
        setField(term26489, term26489.getClass(), "introduce", null);
        setField(term26489, term26489.getClass(), "ip", null);
        setField(term26489, term26489.getClass(), "meetings", null);
        setField(term26489, term26489.getClass(), "menus", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term26489, args);
    }

};


