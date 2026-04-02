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

public class User_setUsername_5985688969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27361;

    public User_setUsername_5985688969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27466 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term27465 = ((Class) term27466).getDeclaredField((String) "ADMIN");
        ((Field) term27465).setAccessible(true);
        Object enum61 = ((Field) term27465).get((Object) null);
        term27361 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term27420 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term27361, term27361.getClass(), "id", -1374527319);
        setField(term27361, term27361.getClass(), "username", "xZTWqxWsAc");
        setField(term27361, term27361.getClass(), "password", "sWchglYniO");
        setField(term27361, term27361.getClass(), "email", "lohegbXyjA");
        setField(term27361, term27361.getClass(), "role", enum61);
        setField(term27361, term27361.getClass(), "oauth", "HlddItIexw");
        setIntField(term27420, term27420.getClass(), "nanos", 443000000);
        setLongField(term27420, term27420.getClass(), "fastTime", 1293726798000L);
        setField(term27420, term27420.getClass(), "cdate", null);
        setField(term27361, term27361.getClass(), "createDate", term27420);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HnpLvemmRI";
        callMethod(klass, "setUsername", argTypes, term27361, args);
    }

};


