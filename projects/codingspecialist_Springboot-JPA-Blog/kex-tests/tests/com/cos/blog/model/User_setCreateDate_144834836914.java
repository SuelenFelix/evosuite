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

public class User_setCreateDate_144834836914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28732;
     Object term28793;

    public User_setCreateDate_144834836914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28827 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term28826 = ((Class) term28827).getDeclaredField((String) "USER");
        ((Field) term28826).setAccessible(true);
        Object enum66 = ((Field) term28826).get((Object) null);
        term28732 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term28790 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term28732, term28732.getClass(), "id", 1798354517);
        setField(term28732, term28732.getClass(), "username", "jcrJhyEbDI");
        setField(term28732, term28732.getClass(), "password", "DHbGOjJfEz");
        setField(term28732, term28732.getClass(), "email", "OuyHNwADel");
        setField(term28732, term28732.getClass(), "role", enum66);
        setField(term28732, term28732.getClass(), "oauth", "shazlRAQrB");
        setIntField(term28790, term28790.getClass(), "nanos", 151000000);
        setLongField(term28790, term28790.getClass(), "fastTime", 1536051461000L);
        setField(term28790, term28790.getClass(), "cdate", null);
        setField(term28732, term28732.getClass(), "createDate", term28790);
        term28793 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term28793, term28793.getClass(), "nanos", 26000000);
        setLongField(term28793, term28793.getClass(), "fastTime", 1337912177000L);
        setField(term28793, term28793.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term28793;
        callMethod(klass, "setCreateDate", argTypes, term28732, args);
    }

};


