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
import java.lang.String;
import java.lang.Object;

public class User_setPassword_45663737110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27642;

    public User_setPassword_45663737110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27746 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term27745 = ((Class) term27746).getDeclaredField((String) "USER");
        ((Field) term27745).setAccessible(true);
        Object enum62 = ((Field) term27745).get((Object) null);
        term27642 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term27700 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term27642, term27642.getClass(), "id", -1735276919);
        setField(term27642, term27642.getClass(), "username", "dHrIcaTbcS");
        setField(term27642, term27642.getClass(), "password", "tAqyToqusS");
        setField(term27642, term27642.getClass(), "email", "MwiFLgdSDA");
        setField(term27642, term27642.getClass(), "role", enum62);
        setField(term27642, term27642.getClass(), "oauth", "VhnistEcCA");
        setIntField(term27700, term27700.getClass(), "nanos", 349000000);
        setLongField(term27700, term27700.getClass(), "fastTime", 1818606356000L);
        setField(term27700, term27700.getClass(), "cdate", null);
        setField(term27642, term27642.getClass(), "createDate", term27700);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hlPKLObFBU";
        callMethod(klass, "setPassword", argTypes, term27642, args);
    }

};


