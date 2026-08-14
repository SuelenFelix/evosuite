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

public class User_UserBuilder_createDate_15382899817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13115;
     Object term13176;

    public User_UserBuilder_createDate_15382899817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13210 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term13209 = ((Class) term13210).getDeclaredField((String) "USER");
        ((Field) term13209).setAccessible(true);
        Object enum28 = ((Field) term13209).get((Object) null);
        term13115 = newInstance(Class.forName("com.cos.blog.model.User$UserBuilder"));
        Object term13173 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term13115, term13115.getClass(), "id", 1221443226);
        setField(term13115, term13115.getClass(), "username", "MFtfkBMyOD");
        setField(term13115, term13115.getClass(), "password", "rdiIyXfRtL");
        setField(term13115, term13115.getClass(), "email", "douzkltmiI");
        setField(term13115, term13115.getClass(), "role", enum28);
        setField(term13115, term13115.getClass(), "oauth", "MFKjhvLtpe");
        setIntField(term13173, term13173.getClass(), "nanos", 13000000);
        setLongField(term13173, term13173.getClass(), "fastTime", 1655658011000L);
        setField(term13173, term13173.getClass(), "cdate", null);
        setField(term13115, term13115.getClass(), "createDate", term13173);
        term13176 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term13176, term13176.getClass(), "nanos", 958000000);
        setLongField(term13176, term13176.getClass(), "fastTime", 1319344284000L);
        setField(term13176, term13176.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term13176;
        callMethod(klass, "createDate", argTypes, term13115, args);
    }

};


