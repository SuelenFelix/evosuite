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

public class User_setId_167213145450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26502;

    public User_setId_167213145450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26502 = newInstance(Class.forName("com.org.model.User"));
        setField(term26502, term26502.getClass(), "id", null);
        setField(term26502, term26502.getClass(), "email", null);
        setField(term26502, term26502.getClass(), "password", null);
        setField(term26502, term26502.getClass(), "username", null);
        setField(term26502, term26502.getClass(), "power", null);
        setField(term26502, term26502.getClass(), "nickname", null);
        setField(term26502, term26502.getClass(), "sex", null);
        setField(term26502, term26502.getClass(), "age", null);
        setField(term26502, term26502.getClass(), "phone", null);
        setField(term26502, term26502.getClass(), "faceUrl", null);
        setField(term26502, term26502.getClass(), "headUrl", null);
        setField(term26502, term26502.getClass(), "introduce", null);
        setField(term26502, term26502.getClass(), "ip", null);
        setField(term26502, term26502.getClass(), "meetings", null);
        setField(term26502, term26502.getClass(), "menus", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setId", argTypes, term26502, args);
    }

};


