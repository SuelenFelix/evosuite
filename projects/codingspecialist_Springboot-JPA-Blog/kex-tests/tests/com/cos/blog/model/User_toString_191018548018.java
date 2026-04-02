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

public class User_toString_191018548018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29761;

    public User_toString_191018548018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29854 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term29853 = ((Class) term29854).getDeclaredField((String) "ADMIN");
        ((Field) term29853).setAccessible(true);
        Object enum70 = ((Field) term29853).get((Object) null);
        term29761 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term29820 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term29761, term29761.getClass(), "id", -1458980236);
        setField(term29761, term29761.getClass(), "username", "OlbhHDRGng");
        setField(term29761, term29761.getClass(), "password", "kbxuaUHTXf");
        setField(term29761, term29761.getClass(), "email", "CwmyQhyiUR");
        setField(term29761, term29761.getClass(), "role", enum70);
        setField(term29761, term29761.getClass(), "oauth", "PxwyuZAkGy");
        setIntField(term29820, term29820.getClass(), "nanos", 2000000);
        setLongField(term29820, term29820.getClass(), "fastTime", 1602126119000L);
        setField(term29820, term29820.getClass(), "cdate", null);
        setField(term29761, term29761.getClass(), "createDate", term29820);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term29761, args);
    }

};


