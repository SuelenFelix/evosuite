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

public class User_UserBuilder_role_11062858785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12413;
     Object enum26;

    public User_UserBuilder_role_11062858785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12514 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term12513 = ((Class) term12514).getDeclaredField((String) "ADMIN");
        ((Field) term12513).setAccessible(true);
        Object enum25 = ((Field) term12513).get((Object) null);
        term12413 = newInstance(Class.forName("com.cos.blog.model.User$UserBuilder"));
        Object term12472 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term12413, term12413.getClass(), "id", 1390820006);
        setField(term12413, term12413.getClass(), "username", "EOTYMqXRmE");
        setField(term12413, term12413.getClass(), "password", "iTxNduwSjE");
        setField(term12413, term12413.getClass(), "email", "MQUTfIiFnh");
        setField(term12413, term12413.getClass(), "role", enum25);
        setField(term12413, term12413.getClass(), "oauth", "JeyKRznnft");
        setIntField(term12472, term12472.getClass(), "nanos", 233000000);
        setLongField(term12472, term12472.getClass(), "fastTime", 1316961637000L);
        setField(term12472, term12472.getClass(), "cdate", null);
        setField(term12413, term12413.getClass(), "createDate", term12472);
        Class<? extends Object> term12681 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term12680 = ((Class) term12681).getDeclaredField((String) "USER");
        ((Field) term12680).setAccessible(true);
        enum26 = ((Field) term12680).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.cos.blog.model.RoleType");
        Object[] args = new Object[1];
        args[0] = enum26;
        callMethod(klass, "role", argTypes, term12413, args);
    }

};


