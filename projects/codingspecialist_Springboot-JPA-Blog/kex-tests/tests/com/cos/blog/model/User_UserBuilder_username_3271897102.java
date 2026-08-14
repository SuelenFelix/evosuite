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

public class User_UserBuilder_username_3271897102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11574;

    public User_UserBuilder_username_3271897102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11678 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term11677 = ((Class) term11678).getDeclaredField((String) "USER");
        ((Field) term11677).setAccessible(true);
        Object enum22 = ((Field) term11677).get((Object) null);
        term11574 = newInstance(Class.forName("com.cos.blog.model.User$UserBuilder"));
        Object term11632 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term11574, term11574.getClass(), "id", -1148142995);
        setField(term11574, term11574.getClass(), "username", "eBcTbweeYp");
        setField(term11574, term11574.getClass(), "password", "drcmjfQUDq");
        setField(term11574, term11574.getClass(), "email", "GjdWUoUSyA");
        setField(term11574, term11574.getClass(), "role", enum22);
        setField(term11574, term11574.getClass(), "oauth", "YEkxWsWaUl");
        setIntField(term11632, term11632.getClass(), "nanos", 327000000);
        setLongField(term11632, term11632.getClass(), "fastTime", 1511272814000L);
        setField(term11632, term11632.getClass(), "cdate", null);
        setField(term11574, term11574.getClass(), "createDate", term11632);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RINhPkhhct";
        callMethod(klass, "username", argTypes, term11574, args);
    }

};


